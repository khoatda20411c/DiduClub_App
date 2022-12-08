package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;

import com.nhom3.Adapters.OrderHistoryAdapter;
import com.nhom3.Database.Database;
import com.nhom3.Models.OrderHistoryModel;

import java.util.ArrayList;

public class OrderHistoryActivity extends AppCompatActivity {
    ImageView imvBack_activity_historycard;
    ListView lvAllHistoryOrder_activity_historycard, lvConfirmHistoryOrder_activity_historycard,
            lvDeliveringHistoryOrder_activity_historycard, lvReceivedHistoryOrder_activity_historycard,
            lvCancelledHistoryOrder_activity_historycard;

    ArrayList<OrderHistoryModel> arrayList;
    OrderHistoryAdapter adapter;

    Database database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderhistory);

        linkViews();
        defineTabHost();
        getData();

        imvBack_activity_historycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrderHistoryActivity.this,MainLoginActivity.class);
                startActivity(intent);

            }
        });
    }

    private void getData() {

        /*-------------tab tất cả--------------*/
        arrayList = new ArrayList<OrderHistoryModel>();
        adapter = new OrderHistoryAdapter(OrderHistoryActivity.this, R.layout.history_item_card_list, arrayList);
        lvAllHistoryOrder_activity_historycard.setAdapter(adapter);

//        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory WHERE Account_ID = ? ",new String[]{"DC01"});

        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory  ",null);

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

        /*-------------tab chờ xác nhận--------------*/
        arrayList = new ArrayList<OrderHistoryModel>();
        adapter = new OrderHistoryAdapter(OrderHistoryActivity.this, R.layout.history_item_card_list, arrayList);
        lvConfirmHistoryOrder_activity_historycard.setAdapter(adapter);

//        Cursor cursor2 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory WHERE Account_ID = ? and Status = ? ",new String[]{"DC01", "Chờ xác nhận"});

        Cursor cursor2 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory ",null);


        arrayList.clear();

        while (cursor2.moveToNext()) {
            String OrhisId = cursor2.getString(0);
            String AccountId = cursor2.getString(1);
            String ProductName = cursor2.getString(2);
            String OrderId = cursor2.getString(3);
            String OrderTime = cursor2.getString(4);
            int ProductQuantity = cursor2.getInt(5);
            String ProductColor = cursor2.getString(6);
            String Size = cursor2.getString(7);
            double TotalPrice = cursor2.getDouble(8);
            String CateGory = cursor2.getString(9);

            OrderHistoryModel lichsumuahang = new OrderHistoryModel(OrhisId, AccountId, ProductName,
                    OrderId, OrderTime, ProductQuantity, ProductColor, Size, TotalPrice, CateGory);
            arrayList.add(lichsumuahang);
        }
        cursor2.close();
        adapter.notifyDataSetChanged();

        /*-------------tab đang giao hàng--------------*/
        arrayList = new ArrayList<OrderHistoryModel>();
        adapter = new OrderHistoryAdapter(OrderHistoryActivity.this, R.layout.history_item_card_list, arrayList);
        lvDeliveringHistoryOrder_activity_historycard.setAdapter(adapter);

//        Cursor cursor3 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory WHERE Account_ID = ? and Status = ? ",new String[]{"DC01", "Đang giao hàng"});

        Cursor cursor3 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory ",null);


        arrayList.clear();

        while (cursor3.moveToNext()) {
            String OrhisId = cursor3.getString(0);
            String AccountId = cursor3.getString(1);
            String ProductName = cursor3.getString(2);
            String OrderId = cursor3.getString(3);
            String OrderTime = cursor3.getString(4);
            int ProductQuantity = cursor3.getInt(5);
            String ProductColor = cursor3.getString(6);
            String Size = cursor3.getString(7);
            double TotalPrice = cursor3.getDouble(8);
            String CateGory = cursor3.getString(9);

            OrderHistoryModel lichsumuahang = new OrderHistoryModel(OrhisId, AccountId, ProductName,
                    OrderId, OrderTime, ProductQuantity, ProductColor, Size, TotalPrice, CateGory);
            arrayList.add(lichsumuahang);
        }
        cursor3.close();
        adapter.notifyDataSetChanged();

        /*-------------tab đã nhận hàng--------------*/
        arrayList = new ArrayList<OrderHistoryModel>();
        adapter = new OrderHistoryAdapter(OrderHistoryActivity.this, R.layout.history_item_card_list, arrayList);
        lvReceivedHistoryOrder_activity_historycard.setAdapter(adapter);

//        Cursor cursor4 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory WHERE Account_ID = ? and Status = ? ",new String[]{"DC01", "Đã nhận hàng"});

        Cursor cursor4 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory ",null);

        arrayList.clear();

        while (cursor4.moveToNext()) {
            String OrhisId = cursor4.getString(0);
            String AccountId = cursor4.getString(1);
            String ProductName = cursor4.getString(2);
            String OrderId = cursor4.getString(3);
            String OrderTime = cursor4.getString(4);
            int ProductQuantity = cursor4.getInt(5);
            String ProductColor = cursor4.getString(6);
            String Size = cursor4.getString(7);
            double TotalPrice = cursor4.getDouble(8);
            String CateGory = cursor4.getString(9);

            OrderHistoryModel lichsumuahang = new OrderHistoryModel(OrhisId, AccountId, ProductName,
                    OrderId, OrderTime, ProductQuantity, ProductColor, Size, TotalPrice, CateGory);
            arrayList.add(lichsumuahang);
        }
        cursor4.close();
        adapter.notifyDataSetChanged();

        /*-------------tab đã hủy--------------*/
        arrayList = new ArrayList<OrderHistoryModel>();
        adapter = new OrderHistoryAdapter(OrderHistoryActivity.this, R.layout.history_item_card_list, arrayList);
        lvCancelledHistoryOrder_activity_historycard.setAdapter(adapter);

//        Cursor cursor5 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory WHERE Account_ID = ? and Status = ? ",new String[]{"DC01", "Đã hủy"});

        Cursor cursor5 = LoadingActivity.database.rawQuery(" SELECT * FROM OrderHistory ",null);

        arrayList.clear();

        while (cursor5.moveToNext()) {
            String OrhisId = cursor5.getString(0);
            String AccountId = cursor5.getString(1);
            String ProductName = cursor5.getString(2);
            String OrderId = cursor5.getString(3);
            String OrderTime = cursor5.getString(4);
            int ProductQuantity = cursor5.getInt(5);
            String ProductColor = cursor5.getString(6);
            String Size = cursor5.getString(7);
            double TotalPrice = cursor5.getDouble(8);
            String CateGory = cursor5.getString(9);

            OrderHistoryModel lichsumuahang = new OrderHistoryModel(OrhisId, AccountId, ProductName,
                    OrderId, OrderTime, ProductQuantity, ProductColor, Size, TotalPrice, CateGory);
            arrayList.add(lichsumuahang);
        }
        cursor5.close();
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
        spec.setIndicator("Tất cả");
        tabhost.addTab(spec);

        // Code for adding Tab 2 to the tabhost
        spec = tabhost.newTabSpec("Chờ xác nhận");
        spec.setContent(R.id.tab_Confirm);
        spec.setIndicator("Chờ xác nhận");
        tabhost.addTab(spec);

        // Code for adding Tab 3 to the tabhost
        spec = tabhost.newTabSpec("Đang giao hàng");
        spec.setContent(R.id.tab_Delivering);
        spec.setIndicator("Đang giao hàng");
        tabhost.addTab(spec);

        // Code for adding Tab 4 to the tabhost
        spec = tabhost.newTabSpec("Đã nhận hàng");
        spec.setContent(R.id.tab_Received);
        spec.setIndicator("Đã nhận hàng");
        tabhost.addTab(spec);

        // Code for adding Tab 5 to the tabhost
        spec = tabhost.newTabSpec("Đã hủy");
        spec.setContent(R.id.tab_Cancelled);
        spec.setIndicator("Đã hủy");
        tabhost.addTab(spec);
    }

    private void linkViews() {
        imvBack_activity_historycard = findViewById(R.id.imv_Back_activity_historycard);

        lvAllHistoryOrder_activity_historycard = findViewById(R.id.lv_AllHistoryOrder_activity_historycard);
        lvConfirmHistoryOrder_activity_historycard = findViewById(R.id.lv_ConfirmHistoryOrder_activity_historycard);
        lvDeliveringHistoryOrder_activity_historycard = findViewById(R.id.lv_DeliveringHistoryOrder_activity_historycard);
        lvReceivedHistoryOrder_activity_historycard = findViewById(R.id.lv_ReceivedHistoryOrder_activity_historycard);
        lvCancelledHistoryOrder_activity_historycard = findViewById(R.id.lv_CancelledHistoryOrder_activity_historycard);
    }
}