package com.nhom3.diduclub_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.nhom3.Adapters.NotificationAdapter;
import com.nhom3.Database.Database;
import com.nhom3.Models.NotificationModel;
import com.nhom3.Models.OrderHistoryModel;

import java.util.ArrayList;

public class fragment_notilogin extends Fragment {
    TextView txtAllNoti_fragment_notilogin, txtSeenNoti_fragment_notilogin, txtNotSeenNoti_fragment_notilogin;
    ListView lvNotiList_fragment_notilogin, lvNotiListSeen_fragment_notilogin, lvNotiListNotSeen_fragment_notilogin;
    View view = null;

    ArrayList<NotificationModel> arrayList;
    NotificationAdapter adapter;

    Database database;

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_notilogin);
//
//        linkViews();
//        defineTabHost();
//
///*        arrayList = new ArrayList<NotificationModel>();
//
//        adapter = new NotificationAdapter(this, R.layout.item_noti_login, arrayList);
//        lvNotiList_fragment_notilogin.setAdapter(adapter);*/
//
//        getData();
//
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_notilogin , container, false);

        linkViews();
        defineTabHost();
//        arrayList = new ArrayList<NotificationModel>();
//
//        adapter = new NotificationAdapter(getContext(), R.layout.item_noti_login, arrayList);
//        lvNotiList_fragment_notilogin.setAdapter(adapter);

        getData();


        return view;
    }

    private void getData() {
        /*tab tất cả thông báo*/
        arrayList = new ArrayList<NotificationModel>();
        adapter = new NotificationAdapter(getContext(), R.layout.item_noti_login, arrayList);
        lvNotiList_fragment_notilogin.setAdapter(adapter);
        Cursor cursor= LoadingActivity.database.rawQuery(" SELECT * FROM Notification ",null);
        arrayList.clear();
        while (cursor.moveToNext()) {
            String NotiId = cursor.getString(0);
            String NotiName = cursor.getString(1);
            String NotiDes = cursor.getString(2);
            String NotiType = cursor.getString(3);
            NotificationModel notificationModel = new NotificationModel(NotiId, NotiName, NotiDes, NotiType);
            arrayList.add(notificationModel);
        }
        cursor.close();
        adapter.notifyDataSetChanged();

        /*tab thông báo đã xem*/
        arrayList = new ArrayList<NotificationModel>();
        adapter = new NotificationAdapter(getContext(), R.layout.item_noti_login, arrayList);
        lvNotiListSeen_fragment_notilogin.setAdapter(adapter);
        Cursor cursorseen= LoadingActivity.database.rawQuery(" SELECT * FROM Notification WHERE Noti_type = ? ",new String[]{"Đã xem"});
        arrayList.clear();
        while (cursorseen.moveToNext()) {
            String NotiId = cursorseen.getString(0);
            String NotiName = cursorseen.getString(1);
            String NotiDes = cursorseen.getString(2);
            String NotiType = cursorseen.getString(3);
            NotificationModel notificationModel = new NotificationModel(NotiId, NotiName, NotiDes, NotiType);
            arrayList.add(notificationModel);
        }
        cursorseen.close();
        adapter.notifyDataSetChanged();

        /*tab thông báo chưa xem*/
        arrayList = new ArrayList<NotificationModel>();
        adapter = new NotificationAdapter(getContext(), R.layout.item_noti_login, arrayList);
        lvNotiListNotSeen_fragment_notilogin.setAdapter(adapter);
        Cursor cursornotseen= LoadingActivity.database.rawQuery(" SELECT * FROM Notification WHERE Noti_type = ? ",new String[]{"Chưa xem"});
        arrayList.clear();
        while (cursornotseen.moveToNext()) {
            String NotiId = cursornotseen.getString(0);
            String NotiName = cursornotseen.getString(1);
            String NotiDes = cursornotseen.getString(2);
            String NotiType = cursornotseen.getString(3);
            NotificationModel notificationModel = new NotificationModel(NotiId, NotiName, NotiDes, NotiType);
            arrayList.add(notificationModel);
        }
        cursorseen.close();
        adapter.notifyDataSetChanged();
    }

    private void defineTabHost() {
        // initiating the tabhost
        TabHost tabhost = view.findViewById(R.id.th_NotiLogin_fragment_notilogin);

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
        spec = tabhost.newTabSpec("Đã xem");
        spec.setContent(R.id.tab_NotiListSeen);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Đã xem");
        tabhost.addTab(spec);

        // Code for adding Tab 3 to the tabhost
        spec = tabhost.newTabSpec("Chưa xem");
        spec.setContent(R.id.tab_NotiListNotSeen);
        spec.setIndicator("Chưa xem");
        tabhost.addTab(spec);
    }

    private void linkViews() {
        txtAllNoti_fragment_notilogin = view.findViewById(R.id.txt_AllNoti_fragment_notilogin);
        txtSeenNoti_fragment_notilogin = view.findViewById(R.id.txt_SeenNoti_fragment_notilogin);
        txtNotSeenNoti_fragment_notilogin = view.findViewById(R.id.txt_NotSeenNoti_fragment_notilogin);

        lvNotiList_fragment_notilogin = view.findViewById(R.id.lv_NotiList_fragment_notilogin);
        lvNotiListSeen_fragment_notilogin = view.findViewById(R.id.lv_NotiListSeen_fragment_notilogin);
        lvNotiListNotSeen_fragment_notilogin = view.findViewById(R.id.lv_NotiListNotSeen_fragment_notilogin);

//        txtAllNoti_fragment_notilogin = findViewById(R.id.txt_AllNoti_fragment_notilogin);
//        txtSeenNoti_fragment_notilogin = findViewById(R.id.txt_SeenNoti_fragment_notilogin);
//        txtNotSeenNoti_fragment_notilogin = findViewById(R.id.txt_NotSeenNoti_fragment_notilogin);
//
//        lvNotiList_fragment_notilogin = findViewById(R.id.lv_NotiList_fragment_notilogin);
//        lvNotiListSeen_fragment_notilogin = findViewById(R.id.lv_NotiListSeen_fragment_notilogin);
//        lvNotiListNotSeen_fragment_notilogin = findViewById(R.id.lv_NotiListNotSeen_fragment_notilogin);

    }
}