package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class DiscountActivity extends AppCompatActivity {

    View fragment_DiscountList_DiscountActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        linkViews();
    }

    private void linkViews() {
        fragment_DiscountList_DiscountActivity = findViewById(R.id.fragment_DiscountList_DiscountActivity);
    }
}