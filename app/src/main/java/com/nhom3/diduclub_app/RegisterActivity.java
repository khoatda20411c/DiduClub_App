package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText edtUsername_activity_register, edtEmail_activity_register,
            edtPassword_activity_register, edtRetypePassword_activity_register;
    Button btnRegister_activity_register;
    CheckBox chkAccept_activity_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtUsername_activity_register = findViewById(R.id.edt_Username_activity_register);
        edtEmail_activity_register = findViewById(R.id.edt_Email_activity_register);
        edtPassword_activity_register = findViewById(R.id.edt_Password_activity_register);

        btnRegister_activity_register = findViewById(R.id.btn_Register_activity_register);

        chkAccept_activity_register = findViewById(R.id.chk_Accept_activity_register);
    }

    private void addEvents() {
        btnRegister_activity_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}