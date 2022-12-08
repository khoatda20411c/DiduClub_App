package com.nhom3.diduclub_app;

//import static androidx.fragment.app.FragmentPagerAdapter.makeFragmentName;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nhom3.Adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager mViewpager;
    FragmentManager manager;
    Button btnlogin_main_fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linkview();
        setupViewpager();
//        btnlogin_main_fragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,LoginmethodActivity.class);
//                startActivity(intent);
//            }
//        });
        //String fragmentTag = makeFragmentName(mViewpager, 2);
        //Fragment fragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
//        fragment_main fragmentmain = (fragment_main) getSupportFragmentManager().findFragmentById(R.id.viewpager);
//        fragmentmain.btn_login_fragmentmain.setOnClickListener(new View.OnClickListener() {
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
                        mViewpager.setCurrentItem(0);
                        break;
                    case R.id.cart:
                        mViewpager.setCurrentItem(1);

                        break;

                    case R.id.sale:
                        mViewpager.setCurrentItem(2);
                        break;

                    case R.id.notifications:
                        mViewpager.setCurrentItem(3);
                        break;

                    case R.id.account:
                        mViewpager.setCurrentItem(4);

                        break;
                }
                return true;
            }
        });

    }

//    private String makeFragmentName(ViewPager mViewpager, int i) {
//        return "android:switcher:" + mViewpager + ":" + i;
//    }

    private void setupViewpager() {
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewpager.setAdapter(viewPagerAdapter);

    }

    private void Linkview() {
        bottomNavigationView = findViewById(R.id.bottom_navigation_nar);
        mViewpager= findViewById(R.id.viewpager);
        btnlogin_main_fragment=(Button) findViewById(R.id.btn_login_fragmentmain);
        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.cart).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.sale).setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.notifications).setChecked(true);
                        break;
                    case 4:
                        bottomNavigationView.getMenu().findItem(R.id.account).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }




}