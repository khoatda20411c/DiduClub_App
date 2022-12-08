package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTPActivity extends AppCompatActivity {
    Button btnnext_otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpactivity);
        btnnext_otp=findViewById(R.id.btnnext_otp);
        btnnext_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OTPActivity.this,ChangePasswordActivity.class);
                startActivity(intent);

            }
        });

    }
}