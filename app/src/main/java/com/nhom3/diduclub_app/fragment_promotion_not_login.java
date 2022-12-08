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

public class fragment_promotion_not_login extends Fragment {
    Button btn_Login_fragment_promotion_not_login;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_promotion_not_login,container,false);
        btn_Login_fragment_promotion_not_login=view.findViewById(R.id.btn_Login_fragment_promotion_not_login);
        btn_Login_fragment_promotion_not_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LoginmethodActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
