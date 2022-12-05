package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartNotLoginFragment extends AppCompatActivity {
    Button btnLogin_fragment_cart_not_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cart_not_login);
        btnLogin_fragment_cart_not_login = findViewById(R.id.btn_Login_fragment_cart_not_login);

        btnLogin_fragment_cart_not_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}