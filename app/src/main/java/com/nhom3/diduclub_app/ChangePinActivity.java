package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

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
        GetData();
        addEvents();
        comparePin();
    }



    private boolean comparePin() {
        String pinCompare= edtPinNew_activity_change_pin.getText().toString().trim();
        if (pinCompare.isEmpty()) {
            return false;
        } else if (pinCompare.length() < 6) {
            return false;
        }else if (!edtPinNew_activity_change_pin.getText().toString().equals(edtReTypeNewPin_activity_change_pin.getText().toString())) {
            return false;
        }
        else {
            return true;
        }
    }


    private void addEvents() {
        btnSaveChangePin_activity_change_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtCurrentPassword_activity_change_pin.length() == 0 ) {
                    edtCurrentPassword_activity_change_pin.setError("Vui lòng nhập đầy đủ thông tin!",null);
                }else if (edtCurrentPassword_activity_change_pin.length() < 6) {
                    edtCurrentPassword_activity_change_pin.setError("Mật khẩu sai cú pháp",null);
                    if (edtCurrentPin_activity_change_pin.length() == 0 ) {
                        edtCurrentPin_activity_change_pin.setError("Vui lòng nhập đầy đủ thông tin!",null);
                    }else if (edtCurrentPin_activity_change_pin.length() < 6) {
                        edtCurrentPin_activity_change_pin.setError("Pin sai cú pháp",null);

                    }else if (edtPinNew_activity_change_pin.length() ==0 ) {
                    edtPinNew_activity_change_pin.setError("Vui lòng nhập đầy đủ thông tin",null);
                    }else if (edtPinNew_activity_change_pin.length() < 6) {
                    edtPinNew_activity_change_pin.setError("Pin sai cú pháp",null);
                    }else if (edtReTypeNewPin_activity_change_pin.length() ==0 ) {
                    edtReTypeNewPin_activity_change_pin.setError("Vui lòng nhập đầy đủ thông tin",null);
                    }else if (edtReTypeNewPin_activity_change_pin.length() < 6) {
                    edtReTypeNewPin_activity_change_pin.setError("Pin sai cú pháp",null);

                }
                    if (!edtPinNew_activity_change_pin.getText().toString().equals(edtReTypeNewPin_activity_change_pin.getText().toString()) ) {
                    edtReTypeNewPin_activity_change_pin.setError("Mật khẩu không trùng khớp",null);
                    }else
                    {
                        intent = new Intent(ChangePinActivity.this, AccountSettingActivity.class);
                        startActivity(intent);
                    }

                }

            }
        });

        btnCancelChangePin_activity_change_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ChangePinActivity.this, AccountSettingActivity.class);
                startActivity(intent);
            }
        });
    }
    private void GetData(){

        Cursor dataOrder = LoadingActivity.database.rawQuery("SELECT * FROM Account WHERE Account_ID =?",new String[]{"DC01"});

        while (dataOrder.moveToNext()){
            String order_ID = dataOrder.getString(0);
            String  account_ID = dataOrder.getString(1);
            String address = dataOrder.getString(2);
            String payment_Method = dataOrder.getString(3);
            String applied_Voucher = dataOrder.getString(4);
            double total_Price = dataOrder.getInt(5);
            String first_name = dataOrder.getString(6);
            String phone =dataOrder.getString(7);

//            txtName_activity_comfirm_order.setText(first_name);
//            txtPhoneNumber_activity_comfirm_order.setText(phone);
//            txtShippingAddress_activity_comfirm_order.setText(address);


        }
        dataOrder.close();
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