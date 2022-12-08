package com.nhom3.diduclub_app;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nhom3.Adapters.MycardAdapter;
import com.nhom3.Adapters.ProductbestsellerAdapter;
import com.nhom3.Models.CartModel;
import com.nhom3.Models.ProductModel;

import java.util.ArrayList;

public class fragment_mycard extends Fragment {
    TextView xt_TotalPrice_fragment_mycard;
    ListView lv_Cart_fragment_mycard;
    CheckBox chkcheckall;
    ImageView imv_NextToPayment_fragment_mycard,imgdeleteall,imv_Back_fragment_mycard;
    ArrayList<CartModel> arrayList;
    MycardAdapter adapter;
    double a;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mycard,container,false);
        lv_Cart_fragment_mycard=view.findViewById(R.id.lv_Cart_fragment_mycard);
        arrayList=new ArrayList<>();
        adapter=new MycardAdapter(getContext(),R.layout.item_listsanphamgiohang,arrayList);
        lv_Cart_fragment_mycard.setAdapter(adapter);
        xt_TotalPrice_fragment_mycard=view.findViewById(R.id.txt_TotalPrice_fragment_mycard);

        Getdata();
        xt_TotalPrice_fragment_mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < arrayList.size(); i++) {
                    a=a+arrayList.get(i).getProduct_Price();
                }

            }
        });

        return view;
    }

    private void Getdata() {
        Cursor cursor= LoadingActivity.database.rawQuery("SELECT * FROM Cart WHERE Account_ID like '%DC02%'",null);
        arrayList.clear();
        while (cursor.moveToNext()){
            String cartid= cursor.getString(0);
            String accountid= cursor.getString(1);
            String productname= cursor.getString(2);
            Double soluong=cursor.getDouble(3);
            Double gia=cursor.getDouble(4);
            String danhmuc=cursor.getString(5);
            byte[] hinh=cursor.getBlob(6);
            CartModel sanphamgiohang=new CartModel(cartid,accountid,productname,soluong,gia,danhmuc,hinh);
            arrayList.add(sanphamgiohang);
        }
        cursor.close();
        adapter.notifyDataSetChanged();
    }
}
