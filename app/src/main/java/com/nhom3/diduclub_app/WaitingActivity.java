package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WaitingActivity extends AppCompatActivity {
    FragmentManager manager;
    ImageView imvNext_activity_waiting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
                manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.layoutwaiting_container, new fragment_waiting0());
                transaction.commit();
//        fragment_waiting0 fragment_waiting0ra =(fragment_waiting0) getFragmentManager().findFragmentById(R.id.frag);
//
//        imvNext_activity_waiting = findViewById(R.id.imv_Next_activity_waiting);
//
//        imvNext_activity_waiting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                manager=getSupportFragmentManager();
//                FragmentTransaction transaction=manager.beginTransaction();
//                transaction.replace(R.id.layoutwaiting_container, new fragment_waiting0());
//                transaction.commit();
//
//
//            }
//        });
    }
}