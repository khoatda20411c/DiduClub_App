package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoadingActivity extends AppCompatActivity {
    Button btngetstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        btngetstarted= findViewById(R.id.btngetstarted);
        btngetstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoadingActivity.this,WaitingActivity.class);
                startActivity(intent);
            }
        });
    }
}