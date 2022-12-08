package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

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
        intent = new Intent(ChangePasswordGeneralActivity.this, AccountSettingActivity.class);

        imv_btnBack_ChangePasswordGeneralActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        btnSavePassword_ChangePasswordGeneralActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPassword = edtCurrentPassword_ChangePasswordGeneralActivity.getText().toString().trim();
                String newPassword = edtNewPassword_ChangePasswordGeneralActivity.getText().toString().trim();
                String reTypePassword = edtRetypePassword_ChangePasswordGeneralActivity.getText().toString().trim();
                String userPassword = ""; //Password luu o database
                
                if(TextUtils.isEmpty(currentPassword) || TextUtils.isEmpty(newPassword)|| TextUtils.isEmpty(reTypePassword)){
                    Toast.makeText(getApplicationContext(),"Vui long nhap day du thong tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                Cursor cursor = LoadingActivity.database.rawQuery(" SELECT Password FROM Account WHERE Account_ID = ? ",
                        new String[]{"DC03"});
                while (cursor.moveToNext()) {
                    userPassword = cursor.getString(0);
                }

                if(!(currentPassword.equals(userPassword.toString().trim())) || !(newPassword.equals(reTypePassword.toString().trim()))){
                    Toast.makeText(ChangePasswordGeneralActivity.this, "Ban nhap sai. Vui long nhap lai", Toast.LENGTH_SHORT).show();
                    return;
                }
                ContentValues values = new ContentValues();
                values.put("Password", newPassword);
                int flag = LoadingActivity.database.update("Account", values, "Account_ID = ?", new String[]{"DC03"});
                if(flag > 0){
                    Toast.makeText(ChangePasswordGeneralActivity.this, "Cap nhat thanh cong", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ChangePasswordGeneralActivity.this, "Cap nhat that bai", Toast.LENGTH_SHORT).show();
                }

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