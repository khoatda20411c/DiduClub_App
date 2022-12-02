package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class SuppportCenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppport_center);


        // initiating the tabhost
        TabHost tabhost = findViewById(R.id.th_SupportCenter);

        // setting up the tab host
        tabhost.setup();

        // Code for adding Tab 1 to the tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("Câu hỏi thường gặp");
        spec.setContent(R.id.tab_Question);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("Câu hỏi thường gặp");

        // adding the tab to tabhost
        tabhost.addTab(spec);

        // Code for adding Tab 2 to the tabhost
        spec = tabhost.newTabSpec("Thông tin chung");
        spec.setContent(R.id.tab_GeneralInfo);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Thông tin chung");
        tabhost.addTab(spec);

        // Code for adding Tab 3 to the tabhost
        spec = tabhost.newTabSpec("Tư vấn trực tuyến");
        spec.setContent(R.id.tab_Hotline);
        spec.setIndicator("Tư vấn trực tuyến");
        tabhost.addTab(spec);
    }
}