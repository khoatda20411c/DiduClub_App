package com.nhom3.diduclub_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountActivity extends Fragment {
    ImageView imvAccountAvatar_activity_account;
    TextView txtAccountFirstName_activity_account, txtAccountEmail_activity_account,
            txtAccountLastName_activity_account,
            txtAccountRate_activity_account, txtAccountPoint_activity_account;
    Button btnPersonalInfo_activity_account, btnPaymentOrder_activity_account,
            btnVoucherList_activity_account, btnAccountSetting_activity_account,
            btnSupportAndRule_activity_account, btnLogout_activity_account;
    View view = null;

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_account, container, false);
        linkViews();
        addEvents();

        return view;
    }

    private void addEvents() {
        btnPersonalInfo_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPaymentOrder_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnVoucherList_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAccountSetting_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSupportAndRule_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnLogout_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void linkViews() {
        imvAccountAvatar_activity_account = view.findViewById(R.id.imv_AccountAvatar_activity_account);

        txtAccountFirstName_activity_account = view.findViewById(R.id.txt_AccountFirstName_activity_account);
        txtAccountLastName_activity_account = view.findViewById(R.id.txt_AccountLastName_activity_account);
        txtAccountEmail_activity_account = view.findViewById(R.id.txt_AccountEmail_activity_account);
        txtAccountRate_activity_account = view.findViewById(R.id.txt_AccountRate_activity_account);
        txtAccountPoint_activity_account = view.findViewById(R.id.txt_AccountPoint_activity_account);

        btnPersonalInfo_activity_account = view.findViewById(R.id.btn_PersonalInfo_activity_account);
        btnPaymentOrder_activity_account = view.findViewById(R.id.btn_PaymentOrder_activity_account);
        btnVoucherList_activity_account = view.findViewById(R.id.btn_VoucherList_activity_account);
        btnAccountSetting_activity_account = view.findViewById(R.id.btn_AccountSetting_activity_account);
        btnSupportAndRule_activity_account = view.findViewById(R.id.btn_SupportAndRule_activity_account);
        btnLogout_activity_account = view.findViewById(R.id.btn_Logout_activity_account);
    }
}