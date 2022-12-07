package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginmethodActivity extends AppCompatActivity {
    EditText edtUsername_activity_loginmethod, edtPassword_activity_loginmethod;
    TextView txtForgotPass_activity_loginmethod;
    Button btnLogin_activity_loginmethod, btnLoginWithFacebook_activity_loginmethod, btnLoginWithGoogle_activity_loginmethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmethod);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        txtForgotPass_activity_loginmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginmethodActivity.this,ForgetPasswordActivity.class);
                startActivity(intent);

            }
        });

        btnLogin_activity_loginmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginmethodActivity.this,LoginSuccessfulActivity.class);
                startActivity(intent);

            }
        });

        btnLoginWithFacebook_activity_loginmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnLoginWithGoogle_activity_loginmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void linkViews() {
        edtUsername_activity_loginmethod = findViewById(R.id.edt_Username_activity_loginmethod);
        edtPassword_activity_loginmethod = findViewById(R.id.edt_Password_activity_loginmethod);

        txtForgotPass_activity_loginmethod = findViewById(R.id.txt_ForgotPass_activity_loginmethod);

        btnLogin_activity_loginmethod = findViewById(R.id.btn_Login_activity_loginmethod);
        btnLoginWithFacebook_activity_loginmethod = findViewById(R.id.btn_LoginWithFacebook_activity_loginmethod);
        btnLoginWithGoogle_activity_loginmethod = findViewById(R.id.btn_LoginWithGoogle_activity_loginmethod);
    }
}