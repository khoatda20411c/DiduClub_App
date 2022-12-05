package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {
    ImageView imvAccountAvatar_activity_account;
    TextView txtAccountName_activity_account, txtAccountEmail_activity_account, txtAccountRate_activity_account, txtAccountPoint_activity_account;
    Button btnPersonalInfo_activity_account, btnPaymentOrder_activity_account, btnVoucherList_activity_account, btnAccountSetting_activity_account, btnSupportAndRule_activity_account, btnLogout_activity_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        linkViews();
    }

    private void linkViews() {
        imvAccountAvatar_activity_account = findViewById(R.id.imv_AccountAvatar_activity_account);

        txtAccountName_activity_account = findViewById(R.id.txt_AccountName_activity_account);
        txtAccountEmail_activity_account = findViewById(R.id.txt_AccountEmail_activity_account);
        txtAccountRate_activity_account = findViewById(R.id.txt_AccountRate_activity_account);
        txtAccountPoint_activity_account = findViewById(R.id.txt_AccountPoint_activity_account);

        btnPersonalInfo_activity_account = findViewById(R.id.btn_PersonalInfo_activity_account);
        btnPaymentOrder_activity_account = findViewById(R.id.btn_PaymentOrder_activity_account);
        btnVoucherList_activity_account = findViewById(R.id.btn_VoucherList_activity_account);
        btnAccountSetting_activity_account = findViewById(R.id.btn_AccountSetting_activity_account);
        btnSupportAndRule_activity_account = findViewById(R.id.btn_SupportAndRule_activity_account);
        btnLogout_activity_account = findViewById(R.id.btn_Logout_activity_account);
    }
}