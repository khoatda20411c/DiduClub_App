package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ChangePasswordGeneralActivity extends AppCompatActivity {

    ImageButton imv_btn_BackToHomePage_ChangePasswordGeneralActivity;

    Button  btn_SavePassword_ChangePasswordGeneralActivity,
            btn_Cancel_ChangePasswordGeneralActivity;

    EditText
            edt_CurrentPassword_ChangePasswordGeneralActivity,
            edt_NewPassword_ChangePasswordGeneralActivity,
            edt_RetypePassword_ChangePasswordGeneralActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_general);

        linkViews();
    }

    private void linkViews() {
        imv_btn_BackToHomePage_ChangePasswordGeneralActivity = findViewById(R.id.imv_btn_BackToHomePage_ChangePasswordGeneralActivity);

        btn_SavePassword_ChangePasswordGeneralActivity = findViewById(R.id.btn_SavePassword_ChangePasswordGeneralActivity);
        btn_Cancel_ChangePasswordGeneralActivity = findViewById(R.id.btn_Cancel_ChangePasswordGeneralActivity);

        edt_CurrentPassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_CurrentPassword_ChangePasswordGeneralActivity);
        edt_NewPassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_NewPassword_ChangePasswordGeneralActivity);
        edt_RetypePassword_ChangePasswordGeneralActivity = findViewById(R.id.edt_RetypePassword_ChangePasswordGeneralActivity);

    }


}