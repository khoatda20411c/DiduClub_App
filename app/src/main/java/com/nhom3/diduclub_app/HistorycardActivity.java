package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;
import com.nhom3.Adapters.OrderHistoryAdapter;
import com.nhom3.Database.Database;
import com.nhom3.Models.OrderHistoryModel;

import java.util.ArrayList;

public class HistorycardActivity extends AppCompatActivity {
    ImageView imvBack_activity_historycard;
    ListView lvAllHistoryOrder_activity_historycard;

    ArrayList<OrderHistoryModel> arrayList;
    OrderHistoryAdapter adapter;

    Database database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historycard);

        linkViews();
        defineTabHost();

        arrayList = new ArrayList<OrderHistoryModel>();

        adapter = new OrderHistoryAdapter(HistorycardActivity.this, R.layout.history_item_card_list, arrayList);
        lvAllHistoryOrder_activity_historycard.setAdapter(adapter);

        getData();

        imvBack_activity_historycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HistorycardActivity.this,MainLoginActivity.class);
                startActivity(intent);

            }
        });
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

    private void defineTabHost() {
        // initiating the tabhost
        TabHost tabhost = findViewById(R.id.th_OrderHisotry_activity_hisotorycard);

        // setting up the tab host
        tabhost.setup();

        // Code for adding Tab 1 to the tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("Tất cả");
        spec.setContent(R.id.tab_All);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("Tất cả");

        // adding the tab to tabhost
        tabhost.addTab(spec);

        // Code for adding Tab 2 to the tabhost
        spec = tabhost.newTabSpec("Đang giao hàng");
        spec.setContent(R.id.tab_Delivering);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Đang giao hàng");
        tabhost.addTab(spec);

        // Code for adding Tab 3 to the tabhost
        spec = tabhost.newTabSpec("Đã nhận hàng");
        spec.setContent(R.id.tab_Received);
        spec.setIndicator("Đã nhận hàng");
        tabhost.addTab(spec);
    }

    private void linkViews() {
        imvBack_activity_historycard = findViewById(R.id.imv_Back_activity_historycard);

        lvAllHistoryOrder_activity_historycard = findViewById(R.id.lv_AllHistoryOrder_activity_historycard);

    }
}