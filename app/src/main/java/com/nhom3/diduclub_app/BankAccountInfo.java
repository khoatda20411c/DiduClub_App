package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BankAccountInfo extends AppCompatActivity {
    ImageView imvBack_activity_bank_account_info;
    TextView txtBankAccountName_activity_bank_account_info, txtAccountNumber_activity_bank_account_info,
            txtMomoAccountName_activity_bank_account_info, txtPhoneNumber_activity_bank_account_info;
    Button btnDeleteAcountBank_activity_bank_account_info, btnAddAccountBank_activity_bank_account_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account_info);

        livkViews();
        addEvents();
    }

    private void addEvents() {
        imvBack_activity_bank_account_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnDeleteAcountBank_activity_bank_account_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAddAccountBank_activity_bank_account_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void livkViews() {
        imvBack_activity_bank_account_info = findViewById(R.id.imv_Back_activity_bank_account_info);

        txtBankAccountName_activity_bank_account_info = findViewById(R.id.txt_BankAccountName_activity_bank_account_info);
        txtAccountNumber_activity_bank_account_info = findViewById(R.id.txt_AccountNumber_activity_bank_account_info);
        txtMomoAccountName_activity_bank_account_info = findViewById(R.id.txt_MomoAccountName_activity_bank_account_info);
        txtPhoneNumber_activity_bank_account_info = findViewById(R.id.txt_PhoneNumber_activity_bank_account_info);

        btnDeleteAcountBank_activity_bank_account_info = findViewById(R.id.btn_DeleteAcountBank_activity_bank_account_info);
        btnAddAccountBank_activity_bank_account_info = findViewById(R.id.btn_AddAccountBank_activity_bank_account_info);
    }
}