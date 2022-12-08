package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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


    }

    private boolean checked() {
        String pass= edtCurrentPassword_activity_change_pin.getText().toString().trim();
        String pin = edtCurrentPin_activity_change_pin.getText().toString().trim();
        if (pass.isEmpty()) {
            Toast.makeText(this, "Vui lòng cung cấp đủ thông tin", Toast.LENGTH_SHORT).show();
            return false;
        } else if (pass.length() < 6) {
            Toast.makeText(this, "Định dạng mật khẩu sai", Toast.LENGTH_SHORT).show();
            return false;
        } else if (pin.isEmpty()) {
            Toast.makeText(this, "Vui lòng cung cấp đủ thông tin", Toast.LENGTH_SHORT).show();
            return false;
        }else if (pin.length() < 6) {
            Toast.makeText(this, "Định dạng mã Pin sai", Toast.LENGTH_SHORT).show();
            return false;
        }else {
            return true;
        }


    }


    private boolean comparePin() {
        String pinCompare= edtPinNew_activity_change_pin.getText().toString().trim();
        if (pinCompare.isEmpty()) {
            Toast.makeText(this, "Vui lòng cung cấp đủ thông tin", Toast.LENGTH_SHORT).show();
            return false;
        } else if (pinCompare.length() < 6) {
            Toast.makeText(this, "Định dạng mật khẩu sai", Toast.LENGTH_SHORT).show();
            return false;
        }else if (!edtPinNew_activity_change_pin.getText().toString().equals(edtReTypeNewPin_activity_change_pin.getText().toString())) {
            Toast.makeText(this, "Vui lòng kiểm tra lại", Toast.LENGTH_SHORT).show();
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
                Intent intent = new Intent(ChangePinActivity.this,MainActivity.class   );

                if (comparePin() && checked()){
                    startActivity(intent);
                    Toast.makeText(ChangePinActivity.this, "Cập nhật mã pin thành công", Toast.LENGTH_SHORT).show();

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