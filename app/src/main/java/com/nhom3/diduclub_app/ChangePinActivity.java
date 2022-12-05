package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ChangePinActivity extends AppCompatActivity {
    EditText edtCurrentPassword_ChangePinActivity,edtCurrentPin_ChangePinActivity,
            edtPinNew_ChangePinActivity,edt_ReTypeNewPin_ChangePinActivity;
    Button btn_SaveChangePin_activity_change_pin,btn_CancelChangePin_activity_change_pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pin);

        linkViews();
    }

    private void linkViews() {
        edtCurrentPassword_ChangePinActivity = findViewById(R.id.edt_CurrentPassword_ChangePasswordGeneralActivity);
        edtCurrentPin_ChangePinActivity = findViewById(R.id.edt_CurrentPin_activity_change_pin);
        edtPinNew_ChangePinActivity = findViewById(R.id.edt_PinNew_activity_change_pin);
        edt_ReTypeNewPin_ChangePinActivity = findViewById(R.id.edt_ReTypeNewPin_activity_change_pin);
        btn_CancelChangePin_activity_change_pin = findViewById(R.id.btn_CancelChangePin_activity_change_pin);
        btn_SaveChangePin_activity_change_pin = findViewById(R.id.btn_SaveChangePin_activity_change_pin);
    }
}