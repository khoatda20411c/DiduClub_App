package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePinActivity extends AppCompatActivity {
    EditText edtCurrentPassword_activity_change_pin, edtCurrentPin_activity_change_pin,
            edtPinNew_activity_change_pin, edtReTypeNewPin_activity_change_pin;
    Button btnSaveChangePin_activity_change_pin, btnCancelChangePin_activity_change_pin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pin);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        btnSaveChangePin_activity_change_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCancelChangePin_activity_change_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ChangePinActivity.this, AccountSettingFragment.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        edtCurrentPassword_activity_change_pin = findViewById(R.id.edt_CurrentPassword_activity_change_pin);
        edtCurrentPin_activity_change_pin = findViewById(R.id.edt_CurrentPin_activity_change_pin);
        edtPinNew_activity_change_pin = findViewById(R.id.edt_PinNew_activity_change_pin);
        edtReTypeNewPin_activity_change_pin = findViewById(R.id.edt_ReTypeNewPin_activity_change_pin);

        btnSaveChangePin_activity_change_pin = findViewById(R.id.btn_SaveChangePin_activity_change_pin);
        btnCancelChangePin_activity_change_pin = findViewById(R.id.btn_CancelChangePin_activity_change_pin);
    }
}