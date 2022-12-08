package com.nhom3.diduclub_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AccountNotLoginFragment extends Fragment {
    Button btnSupportAndRule_account_not_login_fragment, btnLogin_account_not_login_fragment;
    View view = null;
    Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.account_not_login_fragment, container, false);

        linkViews();
        addEvents();

        return view;
    }

    private void addEvents() {
        btnSupportAndRule_account_not_login_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SuppportCenterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin_account_not_login_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), LoginmethodActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        btnSupportAndRule_account_not_login_fragment = view.findViewById(R.id.btn_SupportAndRule_account_not_login_fragment);
        btnLogin_account_not_login_fragment = view.findViewById(R.id.btn_Login_account_not_login_fragment);
    }
}