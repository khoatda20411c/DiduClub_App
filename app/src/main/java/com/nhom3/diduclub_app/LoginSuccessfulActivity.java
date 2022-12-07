package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginSuccessfulActivity extends AppCompatActivity {
    Button btnGoToHomePage_activity_login_successful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_successful);

        btnGoToHomePage_activity_login_successful = findViewById(R.id.btn_GoToHomePage_activity_login_successful);

        btnGoToHomePage_activity_login_successful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSuccessfulActivity.this, MainLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}