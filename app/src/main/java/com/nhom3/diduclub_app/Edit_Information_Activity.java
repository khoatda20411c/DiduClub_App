package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.Database.Database;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Edit_Information_Activity extends AppCompatActivity {
    ImageView imvAccountAvatar_activity_edit_information;
    Button btnChonAnh_activity_edit_information, btnLuuCacThayDoi_activity_edit_information, btnHuy_activity_edit_information;
    EditText edtName_activity_edit_information, edtEditSDT_activity_edit_information, edtNgaySinh_activity_edit_information;
    RadioButton radNam_activity_edit_information, radNu_activity_edit_information;
    TextView txtName,txtDOB,txtPhone;
    RadioButton radNam,radNu;

    int REQUESTCODE_IMAGE = 123;
    int REQUESTCODE_FOLDER = 456;
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_information);
        linkViews();
        GetData();
        addEvents();

    }



    private void addEvents() {
        btnChonAnh_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,REQUESTCODE_FOLDER);

            }
        });

        btnLuuCacThayDoi_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edtName_activity_edit_information != null && edtEditSDT_activity_edit_information !=null && edtNgaySinh_activity_edit_information != null){
                    Toast.makeText(Edit_Information_Activity.this, "Lưu thông tin thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Edit_Information_Activity.this, UserInfoActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Edit_Information_Activity.this, "Bạn không thay đổi gì", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Edit_Information_Activity.this, UserInfoActivity.class);
                    startActivity(intent);
                }

            }
        });

        btnHuy_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Edit_Information_Activity.this, UserInfoActivity.class);
                startActivity(intent);

            }
        });
    }

    private void linkViews() {
        imvAccountAvatar_activity_edit_information = findViewById(R.id.imv_AccountAvatar_activity_edit_information);
        btnChonAnh_activity_edit_information = findViewById(R.id.btn_ChonAnh_activity_edit_information);
        btnLuuCacThayDoi_activity_edit_information = findViewById(R.id.btn_LuuCacThayDoi_activity_edit_information);
        btnHuy_activity_edit_information = findViewById(R.id.btn_Huy_activity_edit_information);

        edtName_activity_edit_information = findViewById(R.id.edt_Name_activity_edit_information);
        edtEditSDT_activity_edit_information = findViewById(R.id.edt_EditSDT_activity_edit_information);
        edtNgaySinh_activity_edit_information = findViewById(R.id.edt_NgaySinh_activity_edit_information);

        radNam_activity_edit_information = findViewById(R.id.rad_Nam_activity_edit_information);
        radNu_activity_edit_information = findViewById(R.id.rad_Nu_activity_edit_information);

        txtName = findViewById(R.id.txt_UserName_UserInfoActivity);
        txtPhone =findViewById(R.id.txt_UserPhone_UserInfoActivity);
        txtDOB = findViewById(R.id.txt_UserDate_UserInfoActivity);


    }

        private void GetData(){

        Cursor cursor = LoadingActivity.database.rawQuery("SELECT User_Name, Phone, DOB, Gender, Avatar FROM Account WHERE Account_ID =?",new String[]{"DC01"});

        while (cursor.moveToNext()){

            String name = cursor.getString(0);
            String phone =cursor.getString(1);
            String date = cursor.getString(2);
            String gender = cursor.getString(3);
            byte[] avtar =  cursor.getBlob(4);
            Bitmap bitmap = BitmapFactory.decodeByteArray(avtar,0,avtar.length);

            edtName_activity_edit_information.setText(name);
            edtNgaySinh_activity_edit_information.setText(date);
            edtEditSDT_activity_edit_information.setText(phone);
            imvAccountAvatar_activity_edit_information.setImageBitmap(bitmap);


        }
            cursor.close();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUESTCODE_FOLDER && resultCode == RESULT_OK  &&  data !=null){
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imvAccountAvatar_activity_edit_information.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}