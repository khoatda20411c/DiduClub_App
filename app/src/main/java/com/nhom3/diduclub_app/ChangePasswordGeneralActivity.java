package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ChangePasswordGeneralActivity extends AppCompatActivity {
    ImageButton imv_btnBack_ChangePasswordGeneralActivity;
    Button btnSavePassword_ChangePasswordGeneralActivity,
            btnCancel_ChangePasswordGeneralActivity;
    EditText edtCurrentPassword_ChangePasswordGeneralActivity,
            edtNewPassword_ChangePasswordGeneralActivity,
            edtRetypePassword_ChangePasswordGeneralActivity;
    Intent intent = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_general);

        linkViews();
        addEvents();

    }

    private void addEvents() {
        intent = new Intent(ChangePasswordGeneralActivity.this, AccountSettingFragment.class);

        imv_btnBack_ChangePasswordGeneralActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        btnSavePassword_ChangePasswordGeneralActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCancel_ChangePasswordGeneralActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(intent);
            }
        });

    }

    private void linkViews() {
        imv_btnBack_ChangePasswordGeneralActivity = findViewById(R.id.imv_btn_Back_ChangePasswordGeneralActivity);

        btnSavePassword_ChangePasswordGeneralActivity = findViewById(R.id.btn_SavePassword_ChangePasswordGeneralActivity);
        btnCancel_ChangePasswordGeneralActivity = findViewById(R.id.btn_Cancel_ChangePasswordGeneralActivity);

        edtCurrentPassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_CurrentPassword_ChangePasswordGeneralActivity);
        edtNewPassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_NewPassword_ChangePasswordGeneralActivity);
        edtRetypePassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_RetypePassword_ChangePasswordGeneralActivity);
    }
}