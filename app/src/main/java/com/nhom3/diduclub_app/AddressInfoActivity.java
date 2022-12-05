package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AddressInfoActivity extends AppCompatActivity {
    ImageView imvBack_activity_address_info;
    TextView txtReceiverName_activity_address_info, txtPhoneNumber_activity_address_info, txtCurrentAddress_activity_address_info;
    Button btnChangeAddress_activity_address_info, btnInputNewAddress_activity_address_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_info);

        linkViews();
    }

    private void linkViews() {
        imvBack_activity_address_info = findViewById(R.id.imv_Back_activity_address_info);

        txtReceiverName_activity_address_info = findViewById(R.id.txt_ReceiverName_activity_address_info);
        txtPhoneNumber_activity_address_info = findViewById(R.id.txt_PhoneNumber_activity_address_info);
        txtCurrentAddress_activity_address_info = findViewById(R.id.txt_CurrentAddress_activity_address_info);

        btnChangeAddress_activity_address_info = findViewById(R.id.btn_ChangeAddress_activity_address_info);
        btnInputNewAddress_activity_address_info = findViewById(R.id.btn_InputNewAddress_activity_address_info);
    }
}