package com.nhom3.diduclub_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nhom3.Database.Database;

public class AccountLoginFragment extends Fragment {
    ImageView imvAccountAvatar_activity_account;
    TextView txtAccountLastName_activity_account ,txtAccountFirstName_activity_account, txtAccountEmail_activity_account,
            txtAccountRate_activity_account, txtAccountPoint_activity_account;
    Button btnPersonalInfo_activity_account, btnHistoryOrder_activity_account,
            btnVoucherList_activity_account, btnAccountSetting_activity_account,
            btnSupportAndRule_activity_account, btnLogout_activity_account;
    View view = null;
    Intent intent;

    Database database;

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_accountlogin, container, false);
        linkViews();
        addEvents();

        getData();

        return view;
    }

    private void getData() {
        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT Last_Name, First_Name, Email, Customer_Type, Avatar FROM Account WHERE Account_ID = ? ",
                new String[]{"DC03"});
        while (cursor.moveToNext()) {
            String Acclastname = cursor.getString(0);
            String Accfirstname = cursor.getString(1);
            String Accemail = cursor.getString(2);
            String AccType = cursor.getString(3);
            byte[] AccImage = cursor.getBlob(4);
            Bitmap bitmap = BitmapFactory.decodeByteArray(AccImage, 0, AccImage.length);
            imvAccountAvatar_activity_account.setImageBitmap(bitmap);

            txtAccountLastName_activity_account.setText(Acclastname);
            txtAccountFirstName_activity_account.setText(Accfirstname);
            txtAccountEmail_activity_account.setText(Accemail);
            txtAccountRate_activity_account.setText(AccType);

        }
        cursor.close();
    }

    private void addEvents() {
        btnPersonalInfo_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                startActivity(intent);
            }
        });

        btnHistoryOrder_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), OrderHistoryActivity.class);
                startActivity(intent);

            }
        });

        btnVoucherList_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(getActivity(),VoucherActivity.class);
                startActivity(intent7);

            }
        });

        btnAccountSetting_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(getActivity(), AccountSettingActivity.class);
                startActivity(intent4);

            }
        });

        btnSupportAndRule_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten10=new Intent(getActivity(),SuppportCenterActivity.class);
                startActivity(inten10);

            }
        });

        btnLogout_activity_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Đăng xuất thành công", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void linkViews() {
        imvAccountAvatar_activity_account = view.findViewById(R.id.imv_AccountAvatar_activity_account);

        txtAccountLastName_activity_account = view.findViewById(R.id.txt_AccountLastName_activity_account);
        txtAccountFirstName_activity_account = view.findViewById(R.id.txt_AccountFirstName_activity_account);
        txtAccountEmail_activity_account = view.findViewById(R.id.txt_AccountEmail_activity_account);
        txtAccountRate_activity_account = view.findViewById(R.id.txt_AccountRate_activity_account);
        txtAccountPoint_activity_account = view.findViewById(R.id.txt_AccountPoint_activity_account);

        btnPersonalInfo_activity_account = view.findViewById(R.id.btn_PersonalInfo_activity_account);
        btnHistoryOrder_activity_account = view.findViewById(R.id.btn_HistoryOrder_activity_account);
        btnVoucherList_activity_account = view.findViewById(R.id.btn_VoucherList_activity_account);
        btnAccountSetting_activity_account = view.findViewById(R.id.btn_AccountSetting_activity_account);
        btnSupportAndRule_activity_account = view.findViewById(R.id.btn_SupportAndRule_activity_account);
        btnLogout_activity_account = view.findViewById(R.id.btn_Logout_activity_account);
    }
}