package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nhom3.Database.Database;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

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
                Intent intent  = new Intent(getApplicationContext(), ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });

        btnLogin_activity_loginmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtUsername_activity_loginmethod.getText().toString();
                String pass = edtPassword_activity_loginmethod.getText().toString();

                if (user.equals("") || pass.equals("")) {
                    Toast.makeText(LoginmethodActivity.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuserandpass = checkLogin(user, pass);
                    if (checkuserandpass==true) {
                        Toast.makeText(LoginmethodActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), LoginSuccessfulActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginmethodActivity.this, "Tài khoản không hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                }
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


    public boolean checkLogin(String username, String password) {
        Cursor cursor= LoadingActivity.database.rawQuery(" SELECT * FROM Account WHERE User_Name = ? and Password = ? ",new String[]{username, password});
        if(cursor.getCount()>0) {
            return true;
        }
        else {
            return false;
        }
    }
}