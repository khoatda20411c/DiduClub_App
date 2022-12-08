package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.Adapters.HistorySearchAdapter;
import com.nhom3.Adapters.ProductSuggestAdapter;
import com.nhom3.Database.Database;
import com.nhom3.Models.HistorySearchModel;
import com.nhom3.Models.ProductModel;

import java.util.ArrayList;

public class ProductSearchActivity extends AppCompatActivity {
    ArrayList<HistorySearchModel> historySearchModelArrayList;
    ListView lvSearch;
    HistorySearchAdapter adapter;
    Database database;
    GridView gv_ProductSuggest_fragment_product_search;
    ArrayList<ProductModel> productModels;
    ProductSuggestAdapter productSuggestAdapter;
    ImageView btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_search);
        lvSearch = findViewById(R.id.lv_HistorySearch_fragment_product_search);
        adapter = new HistorySearchAdapter(this, R.layout.item_search_history,initData());
        lvSearch.setAdapter(adapter);
        linkView();
        addEvent();

        //san pham

        gv_ProductSuggest_fragment_product_search = findViewById(R.id.gv_ProductSuggest_fragment_product_search);
        productModels =new ArrayList<ProductModel>();
        productSuggestAdapter = new ProductSuggestAdapter(this, R.layout.item_product_suggest,productModels);
        gv_ProductSuggest_fragment_product_search.setAdapter(productSuggestAdapter);
        Getdata();
        gv_ProductSuggest_fragment_product_search.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ProductSearchActivity.this,ProductinfoActivity.class);
                Bundle bundle=new Bundle();
                ProductModel sanphammoi=productModels.get(i);
                bundle.putSerializable("productinfo",sanphammoi);
                intent.putExtra("productbundle",bundle);
                startActivity(intent);
            }
        });
    }

    private void addEvent() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductSearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void linkView() {
        btnback = findViewById(R.id.btn_BackToHomePage_activity_product_search);
    }

    private ArrayList<HistorySearchModel> initData() {
        historySearchModelArrayList =new ArrayList<>();
        historySearchModelArrayList.add(new HistorySearchModel("Áo hoodie mùa đông", R.drawable.ic_baseline_arrow_back_24));
        historySearchModelArrayList.add(new HistorySearchModel("Quần bò", R.drawable.ic_baseline_arrow_back_24));
        historySearchModelArrayList.add(new HistorySearchModel("Áo phông nam", R.drawable.ic_baseline_arrow_back_24));
        historySearchModelArrayList.add(new HistorySearchModel("Giày thể thao", R.drawable.ic_baseline_arrow_back_24));
        historySearchModelArrayList.add(new HistorySearchModel("Giày chunky MLB", R.drawable.ic_baseline_arrow_back_24));
        historySearchModelArrayList.add(new HistorySearchModel("Áo sinh viên UEL", R.drawable.ic_baseline_arrow_back_24));
        return historySearchModelArrayList;
    }

    private void Getdata() {
        Cursor cursor= LoadingActivity.database.rawQuery("SELECT * FROM Product",null);
        productModels.clear();
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
            ProductModel sanpham = new ProductModel(id,ten,danhmuc,giakhuyenmai,size,giagoc,star,mota,sodanhgia,hinh,mausac);
            productModels.add(sanpham);
        }
        cursor.close();
        productSuggestAdapter.notifyDataSetChanged();
    }
}