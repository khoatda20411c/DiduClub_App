package com.nhom3.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.nhom3.diduclub_app.AccountActivity;
import com.nhom3.diduclub_app.CartnotloginFragment;
import com.nhom3.diduclub_app.fragment_discount;
import com.nhom3.diduclub_app.fragment_main;
import com.nhom3.diduclub_app.fragment_mycard;
import com.nhom3.diduclub_app.fragment_notinotlogin;
import com.nhom3.diduclub_app.fragment_promotion_not_login;
import com.nhom3.diduclub_app.fragmentmainlogin;

public class ViewPagerloginAdapter extends FragmentStatePagerAdapter {
    public ViewPagerloginAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragmentmainlogin f = new fragmentmainlogin();

                return f;
            case 1:
                return new fragment_mycard();
            case 2:
                return new fragment_discount();
            case 3:
                return new fragment_notinotlogin();
            case 4:
                return new AccountActivity();
            default:
                return new fragment_main();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}
