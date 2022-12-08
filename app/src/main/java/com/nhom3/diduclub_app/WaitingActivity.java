package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WaitingActivity extends AppCompatActivity {
    FragmentManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.layoutwaiting_container, new fragment_waiting0());
        transaction.commit();
        ImageView img_next=findViewById(R.id.imv_Next_activity);
        TextView txt_content_next=findViewById(R.id.txt_activity_waiting_content);
        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt_content_next.getText().equals("1/3")){

                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.replace(R.id.layoutwaiting_container, new fragment_waiting1());
                    transaction.commit();
                    txt_content_next.setText("2/3");


                }else if (txt_content_next.getText().equals("2/3")){
                    manager=getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.replace(R.id.layoutwaiting_container, new fragment_waiting2());
                    transaction.commit();
                    txt_content_next.setText("3/3");

                }else if(txt_content_next.getText().equals("3/3")){
                    Intent intent=new Intent(WaitingActivity.this,BeforeLoginActivity.class);
                    startActivity(intent);
                }


            }
        });


    }
}