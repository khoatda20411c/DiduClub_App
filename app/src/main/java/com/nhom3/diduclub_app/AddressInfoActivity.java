package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AddressInfoActivity extends AppCompatActivity {
    ImageView imvBack_activity_address_info;
    TextView txtReceiverFirstName_activity_address_info, txtPhoneNumber_activity_address_info, txtCurrentAddress_activity_address_info;
    Button btnChangeAddress_activity_address_info, btnInputNewAddress_activity_address_info;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_info);

        linkViews();
        getData();
        addEvents();
    }

    private void getData() {
        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT First_Name, Phone, Address FROM Account WHERE Account_ID = ? ",
                new String[]{"DC04"});
        while (cursor.moveToNext()) {
            String Accfirstname = cursor.getString(0);
            String AccPhone = cursor.getString(1);
            String AccAddress = cursor.getString(2);

            txtReceiverFirstName_activity_address_info.setText(Accfirstname);
            txtPhoneNumber_activity_address_info.setText(AccPhone);
            txtCurrentAddress_activity_address_info.setText(AccAddress);

        }
        cursor.close();
    }

    private void addEvents() {
        imvBack_activity_address_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AddressInfoActivity.this, AccountSettingActivity.class);
                startActivity(intent);
            }
        });

        btnChangeAddress_activity_address_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnInputNewAddress_activity_address_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void linkViews() {
        imvBack_activity_address_info = findViewById(R.id.imv_Back_activity_address_info);

        txtReceiverFirstName_activity_address_info = findViewById(R.id.txt_ReceiverFirstName_activity_address_info);
        txtPhoneNumber_activity_address_info = findViewById(R.id.txt_PhoneNumber_activity_address_info);
        txtCurrentAddress_activity_address_info = findViewById(R.id.txt_CurrentAddress_activity_address_info);

        btnChangeAddress_activity_address_info = findViewById(R.id.btn_ChangeAddress_activity_address_info);
        btnInputNewAddress_activity_address_info = findViewById(R.id.btn_InputNewAddress_activity_address_info);
    }
}