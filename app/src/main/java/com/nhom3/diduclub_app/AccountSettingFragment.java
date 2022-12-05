package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class AccountSettingFragment extends AppCompatActivity {
    ImageView imvBack_fragment_account_setting;
    Button btnChangePassword_fragment_account_setting, btnAddressInfo_fragment_account_setting, btnBankAndWallet_fragment_account_setting, btnChangePIN_fragment_account_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_account_setting);

        linkViews();
    }

    private void linkViews() {
        imvBack_fragment_account_setting = findViewById(R.id.imv_Back_fragment_account_setting);

        btnChangePassword_fragment_account_setting = findViewById(R.id.btn_ChangePassword_fragment_account_setting);
        btnAddressInfo_fragment_account_setting = findViewById(R.id.btn_AddressInfo_fragment_account_setting);
        btnBankAndWallet_fragment_account_setting = findViewById(R.id.btn_BankAndWallet_fragment_account_setting);
        btnChangePIN_fragment_account_setting = findViewById(R.id.btn_ChangePIN_fragment_account_setting);
    }
}