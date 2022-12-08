package com.nhom3.diduclub_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_notinotlogin extends Fragment {
    Button btn_Login_activity_not_login_noti_fragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.noti_notlogin_fragment, container, false);
        btn_Login_activity_not_login_noti_fragment=view.findViewById(R.id.btn_Login_activity_not_login_noti_fragment);
        btn_Login_activity_not_login_noti_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LoginmethodActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
