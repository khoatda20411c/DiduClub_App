package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
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
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account_info);

        linkViews();
        addEvents();
        getData();
    }


    private void getData() {
        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT Bank_Account, Phone, Bank_Number, Momo_Name FROM Account WHERE Account_ID = ? ", new String[]{"DC03"});
        while (cursor.moveToNext()) {
            String AccBankAccount = cursor.getString(0);
            String AccPhone = cursor.getString(1);
            String AccBankNumber = cursor.getString(2);
            String AccMomoName = cursor.getString(3);

            txtAccountNumber_activity_bank_account_info.setText(AccBankNumber);
            txtPhoneNumber_activity_bank_account_info.setText(AccPhone);
            txtBankAccountName_activity_bank_account_info.setText(AccBankAccount);
            txtMomoAccountName_activity_bank_account_info.setText(AccMomoName);
        }
    }

    private void addEvents() {
        imvBack_activity_bank_account_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(BankAccountInfo.this, AccountSettingActivity.class);
                startActivity(intent);
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

    private void linkViews() {
        imvBack_activity_bank_account_info = findViewById(R.id.imv_Back_activity_bank_account_info);

        txtBankAccountName_activity_bank_account_info = findViewById(R.id.txt_BankAccountName_activity_bank_account_info);
        txtAccountNumber_activity_bank_account_info = findViewById(R.id.txt_AccountNumber_activity_bank_account_info);
        txtMomoAccountName_activity_bank_account_info = findViewById(R.id.txt_MomoAccountName_activity_bank_account_info);
        txtPhoneNumber_activity_bank_account_info = findViewById(R.id.txt_PhoneNumber_activity_bank_account_info);

        btnDeleteAcountBank_activity_bank_account_info = findViewById(R.id.btn_DeleteAcountBank_activity_bank_account_info);
        btnAddAccountBank_activity_bank_account_info = findViewById(R.id.btn_AddAccountBank_activity_bank_account_info);
    }
}