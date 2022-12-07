package com.nhom3.diduclub_app;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nhom3.Adapters.OrderHistoryAdapter;
import com.nhom3.Database.Database;
import com.nhom3.Models.OrderHistoryModel;

import java.util.ArrayList;

public class Allhistoryfragment extends Fragment {
    ListView lvAllHistory_fragment_allhistoryfragment;
    ArrayList<OrderHistoryModel> arrayList;
    OrderHistoryAdapter adapter;

    Database database;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_allhistoryfragment, container, false);
        lvAllHistory_fragment_allhistoryfragment = view.findViewById(R.id.lv_AllHistory_fragment_allhistoryfragment);

        arrayList = new ArrayList<OrderHistoryModel>();

        adapter = new OrderHistoryAdapter(getContext(), R.layout.history_item_card_list, arrayList);
        lvAllHistory_fragment_allhistoryfragment.setAdapter(adapter);

        getData();

        return view;
    }

    private void getData() {

        Cursor cursor= LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory ",null);

        arrayList.clear();

        while (cursor.moveToNext()) {
            String OrhisId = cursor.getString(0);
            String AccountId = cursor.getString(1);
            String ProductName = cursor.getString(2);
            String OrderId = cursor.getString(3);
            String OrderTime = cursor.getString(4);
            int ProductQuantity = cursor.getInt(5);
            String ProductColor = cursor.getString(6);
            String Size = cursor.getString(7);
            double TotalPrice = cursor.getDouble(8);
            String CateGory = cursor.getString(9);

            OrderHistoryModel lichsumuahang = new OrderHistoryModel(OrhisId, AccountId, ProductName,
                    OrderId, OrderTime, ProductQuantity, ProductColor, Size, TotalPrice, CateGory);
            arrayList.add(lichsumuahang);
        }
        cursor.close();
        adapter.notifyDataSetChanged();
    }
}