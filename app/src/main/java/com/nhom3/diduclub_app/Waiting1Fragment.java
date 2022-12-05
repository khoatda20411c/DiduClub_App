package com.nhom3.diduclub_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Waiting1Fragment extends AppCompatActivity {
    ImageView imvNext_fragment_waiting_1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_waiting_1);

        imvNext_fragment_waiting_1 = findViewById(R.id.imv_Next_fragment_waiting_1);

        imvNext_fragment_waiting_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Waiting1Fragment.this, Waiting2Fragment.class);
                startActivity(intent);
            }
        });
    }
}
