package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangePasswordActivity extends AppCompatActivity {
    EditText edtNewPassWord_activity_change_password, edtReTypePassWord_activity_change_password;
    ImageView imvHint1_activity_change_password, imvHint2_activity_change_password;
    Button btnConfirm_activity_change_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtNewPassWord_activity_change_password = findViewById(R.id.edt_NewPassWord_activity_change_password);
        edtNewPassWord_activity_change_password = findViewById(R.id.edt_NewPassWord_activity_change_password);

        imvHint1_activity_change_password = findViewById(R.id.imv_Hint1_activity_change_password);
        imvHint2_activity_change_password = findViewById(R.id.imv_Hint2_activity_change_password);

        btnConfirm_activity_change_password = findViewById(R.id.btn_Confirm_activity_change_password);

    }

    private void addEvents() {
        btnConfirm_activity_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}