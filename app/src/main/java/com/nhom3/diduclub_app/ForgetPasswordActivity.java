package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPasswordActivity extends AppCompatActivity {
    Button btn_forgotpassword_acctivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        btn_forgotpassword_acctivity=(Button) findViewById(R.id.btnforhotpassnext);
        btn_forgotpassword_acctivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgetPasswordActivity.this,OTPActivity.class);
                startActivity(intent);
            }
        });

    }
}