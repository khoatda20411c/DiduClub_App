package com.nhom3.diduclub_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Waiting2Fragment extends AppCompatActivity {
    ImageView imvNext_fragment_waiting_2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_waiting_2);

        imvNext_fragment_waiting_2 = findViewById(R.id.imv_Next_fragment_waiting_2);

        imvNext_fragment_waiting_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Waiting2Fragment.this, BeforeLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
