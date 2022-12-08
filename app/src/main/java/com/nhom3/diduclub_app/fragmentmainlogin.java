package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nhom3.Adapters.ProductbestsellerAdapter;
import com.nhom3.Interface.ProductInterface;
import com.nhom3.Models.ProductModel;

import java.util.ArrayList;

public class fragmentmainlogin extends Fragment {
    GridView gv_HotProduct_fragment_main;
    Button btn_login_fragmentmain;

    ArrayList<ProductModel> arrayList;
    ProductbestsellerAdapter adapter;
    ProductInterface productInterface;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mainlogin,container,false);
        gv_HotProduct_fragment_main= view.findViewById(R.id.gv_HotProduct_fragment_main);
        arrayList=new ArrayList<>();
        adapter=new ProductbestsellerAdapter(getContext(),R.layout.item_bestsellerproduct,arrayList);
        gv_HotProduct_fragment_main.setAdapter(adapter);
        Getdata();
        gv_HotProduct_fragment_main.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ProductInterface myInterface= (ProductInterface) getActivity();
//                if(myInterface != null){
//                    myInterface.dataFlow(arrayList.get(position));
//                }

                Intent intent=new Intent(getActivity(),ProductinfoActivity.class);
                Bundle bundle=new Bundle();
                ProductModel sanphammoi=arrayList.get(position);
                bundle.putSerializable("productinfo",sanphammoi);
                intent.putExtra("productbundle",bundle);
                startActivity(intent);
            }
        });
        return view;
    }
    private void Getdata() {
        Cursor cursor= LoadingActivity.database.rawQuery("SELECT * FROM Product",null);
        arrayList.clear();
        while (cursor.moveToNext()){
            String id= cursor.getString(0);
            String ten= cursor.getString(1);
            String danhmuc= cursor.getString(2);
            Double giakhuyenmai=cursor.getDouble(3);
            String size=cursor.getString(4);
            Double giagoc=cursor.getDouble(5);
            Double star=cursor.getDouble(6);
            String mota=cursor.getString(7);
            int sodanhgia=cursor.getInt(8);
            byte[] hinh=cursor.getBlob(9);
            String mausac=cursor.getString(10);
            ProductModel sanpham=new ProductModel(id,ten,danhmuc,giakhuyenmai,size,giagoc,star,mota,sodanhgia,hinh,mausac);
            arrayList.add(sanpham);
        }
        cursor.close();
        adapter.notifyDataSetChanged();
    }
}
