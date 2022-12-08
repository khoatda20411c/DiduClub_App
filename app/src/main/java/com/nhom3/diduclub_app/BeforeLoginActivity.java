package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeforeLoginActivity extends AppCompatActivity {
    Button btnLogin_activity_before_login, btnRegister_activity_before_login, btnBackToHomePage_activity_before_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_login);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        btnLogin_activity_before_login = findViewById(R.id.btn_Login_activity_before_login);
        btnRegister_activity_before_login = findViewById(R.id.btn_Register_activity_before_login);
        btnBackToHomePage_activity_before_login = findViewById(R.id.btn_BackToHomePage_activity_before_login);
    }

    private void addEvents() {
        btnLogin_activity_before_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BeforeLoginActivity.this,LoginmethodActivity.class);
                startActivity(intent);
            }
        });

        btnRegister_activity_before_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BeforeLoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnBackToHomePage_activity_before_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BeforeLoginActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}