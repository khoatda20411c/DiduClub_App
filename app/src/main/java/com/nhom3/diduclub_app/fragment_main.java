package com.nhom3.diduclub_app;


import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.nhom3.Adapters.ProductbestsellerAdapter;
import com.nhom3.Models.ProductModel;
import com.nhom3.diduclub_app.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class fragment_main extends Fragment {
    GridView gv_HotProduct_fragment_main;
    Button btn_login_fragmentmain;
    EditText edtSearch;

    ArrayList<ProductModel> arrayList;
    ProductbestsellerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main,container,false);
        edtSearch =  view.findViewById(R.id.edt_Search);
        gv_HotProduct_fragment_main= view.findViewById(R.id.gv_HotProduct_fragment_main);
        btn_login_fragmentmain = view.findViewById(R.id.btn_login_fragmentmain);

        edtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getActivity(),ProductSearchActivity.class);
                startActivity(intent);
            }
        });
        btn_login_fragmentmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LoginmethodActivity.class);
                startActivity(intent);

            }
        });
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
