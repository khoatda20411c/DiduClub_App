package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class WaitingActivity extends AppCompatActivity {
    ImageView imvNext_activity_waiting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        imvNext_activity_waiting = findViewById(R.id.imv_Next_activity_waiting);

    }
}