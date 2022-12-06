package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nhom3.Database.Database;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LoadingActivity extends AppCompatActivity {
    Button btngetstarted;
    public static final String DATABASE_NAME="Diduclub.db";
    public static final String DB_PATH_SUFFIX="/databases/";

    public static SQLiteDatabase database=null;
    int SPLASH_TIME_OUT=3000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        copyDB();
        database = openOrCreateDatabase(DATABASE_NAME,MODE_PRIVATE,null);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(LoadingActivity.this,WaitingActivity.class);
                startActivity(intent);

                finish();
            }
        },SPLASH_TIME_OUT);
    }

    private void copyDB() {
        File dbPath= getDatabasePath(DATABASE_NAME);
        if(!dbPath.exists()){
            if(copyDBFromAsset()){
                Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean copyDBFromAsset() {
        String dbPath= getApplicationInfo().dataDir + DB_PATH_SUFFIX+ DATABASE_NAME;
        try {
            InputStream inputStream=getAssets().open(DATABASE_NAME);
            File f = new File(getApplicationInfo().dataDir + DB_PATH_SUFFIX);
            if(!f.exists()){
                f.mkdir();
            }
            OutputStream outputStream = new FileOutputStream(dbPath);
            byte[] buffer = new byte[1024];
            int length;
            while((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0, length);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }


}