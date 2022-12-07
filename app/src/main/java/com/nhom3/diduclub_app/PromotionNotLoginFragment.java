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

public class PromotionNotLoginFragment extends Fragment {
    Button btnLogin_fragment_promotion_not_login;
    View view = null;

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_promotion_not_login);
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_promotion_not_login, container, false);
         btnLogin_fragment_promotion_not_login = view.findViewById(R.id.btn_Login_fragment_promotion_not_login);

         btnLogin_fragment_promotion_not_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(getActivity(),LoginmethodActivity.class);
                 startActivity(intent);

             }
         });

         return view;
    }
}