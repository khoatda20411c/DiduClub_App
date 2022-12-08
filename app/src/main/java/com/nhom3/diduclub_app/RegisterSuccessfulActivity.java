package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class RegisterSuccessfulActivity extends AppCompatActivity {
    Button btnGoToHomePage_activity_successful_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_successful);

        btnGoToHomePage_activity_successful_login = findViewById(R.id.btn_GoToHomePage_activity_successful_login);
    }
}