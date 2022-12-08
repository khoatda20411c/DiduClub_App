package com.nhom3.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.nhom3.diduclub_app.AccountNotLoginFragment;
import com.nhom3.diduclub_app.CartnotloginFragment;
import com.nhom3.diduclub_app.R;
import com.nhom3.diduclub_app.fragment_cart_not_login;
import com.nhom3.diduclub_app.fragment_main;
import com.nhom3.diduclub_app.fragment_notinotlogin;
import com.nhom3.diduclub_app.fragment_promotion_not_login;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragment_main f = new fragment_main();

                return f;
            case 1:
                return new CartnotloginFragment();
            case 2:
                return new fragment_promotion_not_login();
            case 3:
                return new fragment_notinotlogin();
            case 4:
                return new AccountNotLoginFragment();
            default:
            return new fragment_main();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }



}
