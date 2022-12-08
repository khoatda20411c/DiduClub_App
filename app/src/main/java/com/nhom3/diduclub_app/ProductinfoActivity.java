package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.Models.ProductModel;

public class ProductinfoActivity extends AppCompatActivity {
    TextView txtnameproduct_actiproductinfo;
    ImageView imghinhanhinfoproduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productinfo);
        Linkview();
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("productbundle");
        ProductModel k=(ProductModel) bundle.getSerializable("productinfo");
        txtnameproduct_actiproductinfo.setText(k.getProduct_Name());
        byte[] productimg=k.getProduct_Photo();
        Bitmap bitmap= BitmapFactory.decodeByteArray(productimg,0,productimg.length);
        imghinhanhinfoproduct.setImageBitmap(bitmap);

    }

    private void Linkview() {
        txtnameproduct_actiproductinfo=findViewById(R.id.txtnameproduct_actiproductinfo);
        imghinhanhinfoproduct=findViewById(R.id.imghinhanhproductinfo);
    }


}