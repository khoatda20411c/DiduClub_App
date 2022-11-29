package com.nhom3.diduclub_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment_main fragmentmain=(com.nhom3.diduclub_app.fragment_main) getFragmentManager().findFragmentById(R.id.fragment_main);

    }
}