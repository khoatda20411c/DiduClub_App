package com.nhom3.diduclub_app;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nhom3.Adapters.DiscountAdapter;
import com.nhom3.Models.DiscountModel;

import java.util.ArrayList;

public class fragment_discount extends Fragment {

    GridView gv_ListDiscount_DiscountActivity;
    ArrayList<DiscountModel> discountModels;
    DiscountAdapter discountAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discount,container,false);

        gv_ListDiscount_DiscountActivity = view.findViewById(R.id.gv_ListDiscount_DiscountActivity);
        discountModels = new ArrayList<>();

        discountAdapter = new DiscountAdapter(getContext(), R.layout.item_list_discount, discountModels);
        gv_ListDiscount_DiscountActivity.setAdapter(discountAdapter);

        getData();

        return view;
    }

    private void getData() {

        Cursor cursor= LoadingActivity.database.rawQuery("SELECT * FROM Discount ",null);


        discountModels.clear();
        while (cursor.moveToNext()){
            String id= cursor.getString(0);
            String ten= cursor.getString(1);
            String phantram= cursor.getString(2);
            String loaisanpham=cursor.getString(3);
            Double gia=cursor.getDouble(4);
            byte[] hinh=cursor.getBlob(5);
            DiscountModel discountModel = new DiscountModel(id,ten,phantram,loaisanpham,gia,hinh);
            discountModels.add(discountModel);


        }
        cursor.close();

        discountAdapter.notifyDataSetChanged();

    }
}
