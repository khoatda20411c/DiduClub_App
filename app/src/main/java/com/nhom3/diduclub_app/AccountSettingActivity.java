package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AccountSettingActivity extends AppCompatActivity {
    ImageView imvBack_fragment_account_setting;
    Button btnChangePassword_fragment_account_setting, btnAddressInfo_fragment_account_setting,
            btnBankAndWallet_fragment_account_setting, btnChangePIN_fragment_account_setting;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        imvBack_fragment_account_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12=new Intent(AccountSettingActivity.this, AccountLoginFragment.class);
                startActivity(intent12);

            }
        });

        btnChangePassword_fragment_account_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AccountSettingActivity.this, ChangePasswordGeneralActivity.class);
                startActivity(intent);
            }
        });

        btnAddressInfo_fragment_account_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AccountSettingActivity.this, AddressInfoActivity.class);
                startActivity(intent);
            }
        });

        btnBankAndWallet_fragment_account_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AccountSettingActivity.this, BankAccountInfo.class);
                startActivity(intent);
            }
        });

        btnChangePIN_fragment_account_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AccountSettingActivity.this, ChangePinActivity.class);
                startActivity(intent);
            }
        });

    }

    private void linkViews() {
        imvBack_fragment_account_setting = findViewById(R.id.imv_Back_fragment_account_setting);

        btnChangePassword_fragment_account_setting = findViewById(R.id.btn_ChangePassword_fragment_account_setting);
        btnAddressInfo_fragment_account_setting = findViewById(R.id.btn_AddressInfo_fragment_account_setting);
        btnBankAndWallet_fragment_account_setting = findViewById(R.id.btn_BankAndWallet_fragment_account_setting);
        btnChangePIN_fragment_account_setting = findViewById(R.id.btn_ChangePIN_fragment_account_setting);
    }
}