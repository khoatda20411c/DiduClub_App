package com.nhom3.diduclub_app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.Nullable;

public class DiscountFragment extends Fragment {
    GridView gv_ListDiscount_DiscountActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discount, container, false);
        gv_ListDiscount_DiscountActivity = view.findViewById(R.id.gv_ListDiscount_DiscountActivity);
        return view;
    }

}

