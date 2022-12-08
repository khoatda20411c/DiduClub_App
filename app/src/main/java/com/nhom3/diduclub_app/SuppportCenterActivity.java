package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class SuppportCenterActivity extends AppCompatActivity {
    ImageView imvBack_activity_suppport_center;
    Button btnPolicyAndRule_activity_suppport_center, btnCallToSeller_fragment_directly_advice;
    TextView txtQuestion1_fragment_frequent_questions, txtQuestion2_fragment_frequent_questions,
            txtQuestion3_fragment_frequent_questions, txtQuestion4_fragment_frequent_questions,
            txtQuestion5_fragment_frequent_questions, txtQuestion6_fragment_frequent_questions,
            txtQuestion7_fragment_frequent_questions, txtQuestion8_fragment_frequent_questions,
            txtG_Question1_fragment_general_information, txtG_Question2_fragment_general_information,
            txtG_Question3_fragment_general_information, txtG_Question4_fragment_general_information,
            txtG_Question5_fragment_general_information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppport_center);
        linkVIews();
        defineTabHost();
        addEvents();
    }

    private void addEvents() {
        imvBack_activity_suppport_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(SuppportCenterActivity.this, AccountLoginFragment.class);
                startActivity(intent12);
            }
        });

        txtQuestion1_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        txtQuestion2_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion3_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion4_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion5_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion6_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion7_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtQuestion8_fragment_frequent_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtG_Question1_fragment_general_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtG_Question2_fragment_general_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtG_Question3_fragment_general_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtG_Question4_fragment_general_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtG_Question5_fragment_general_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPolicyAndRule_activity_suppport_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnCallToSeller_fragment_directly_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Uri uri = Uri.parse("tel:" + "0987654321");
                intent.setData(uri);
                startActivity(intent);
            }
        });
    }

    private void linkVIews() {
        imvBack_activity_suppport_center = findViewById(R.id.imv_Back_activity_suppport_center);

        btnPolicyAndRule_activity_suppport_center = findViewById(R.id.btn_PolicyAndRule_activity_suppport_center);
        btnCallToSeller_fragment_directly_advice = findViewById(R.id.btn_CallToSeller_fragment_directly_advice);

        txtQuestion1_fragment_frequent_questions = findViewById(R.id.txt_Question1_fragment_frequent_questions);
        txtQuestion2_fragment_frequent_questions = findViewById(R.id.txt_Question2_fragment_frequent_questions);
        txtQuestion3_fragment_frequent_questions = findViewById(R.id.txt_Question3_fragment_frequent_questions);
        txtQuestion4_fragment_frequent_questions = findViewById(R.id.txt_Question4_fragment_frequent_questions);
        txtQuestion5_fragment_frequent_questions = findViewById(R.id.txt_Question5_fragment_frequent_questions);
        txtQuestion6_fragment_frequent_questions = findViewById(R.id.txt_Question6_fragment_frequent_questions);
        txtQuestion7_fragment_frequent_questions = findViewById(R.id.txt_Question7_fragment_frequent_questions);
        txtQuestion8_fragment_frequent_questions = findViewById(R.id.txt_Question8_fragment_frequent_questions);
        txtG_Question1_fragment_general_information = findViewById(R.id.txt_G_Question1_fragment_general_information);
        txtG_Question2_fragment_general_information = findViewById(R.id.txt_G_Question2_fragment_general_information);
        txtG_Question3_fragment_general_information = findViewById(R.id.txt_G_Question3_fragment_general_information);
        txtG_Question4_fragment_general_information = findViewById(R.id.txt_G_Question4_fragment_general_information);
        txtG_Question5_fragment_general_information = findViewById(R.id.txt_G_Question5_fragment_general_information);
    }

    private void defineTabHost() {
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