package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager mViewpager;
    FragmentManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linkview();
        setupViewpager();
 //       fragment_main fragmentmain = (fragment_main) getFragmentManager().findFragmentById(R.id.fragment_main_container);
 //       fragmentmain.btn_login_fragmentmain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,LoginmethodActivity.class);
//                startActivity(intent);
//            }
//        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cart:
                        Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.sale:
                        Toast.makeText(MainActivity.this, "Sale", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.notifications:
                        Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.account:
                        Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }

    private void setupViewpager() {

    }

    private void Linkview() {
        bottomNavigationView = findViewById(R.id.bottom_navigation_nar);
        mViewpager= findViewById(R.id.viewpager);

    }




}