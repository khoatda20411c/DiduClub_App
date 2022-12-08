package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.nhom3.Models.ProductModel;

public class ProductinfoActivity extends AppCompatActivity {
    TextView txtnameproduct_actiproductinfo,txtdanhmucsanpham,txtgiasanphaminfo;
    ImageView imghinhanhinfoproduct,imgbacktohome;
    Button btnordernow,btnaddproducttocart;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productinfo);
        Linkview();
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("productbundle");
        ProductModel k=(ProductModel) bundle.getSerializable("productinfo");
        txtnameproduct_actiproductinfo.setText(k.getProduct_Name());
        txtgiasanphaminfo.setText(k.getPromoted_Price().toString());
        txtdanhmucsanpham.setText(k.getCategory());
        ratingbar.setRating(Float.parseFloat(k.getStar().toString()));

        byte[] productimg=k.getProduct_Photo();
        Bitmap bitmap= BitmapFactory.decodeByteArray(productimg,0,productimg.length);
        imghinhanhinfoproduct.setImageBitmap(bitmap);
        btnordernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(ProductinfoActivity.this,Confirm_order_Activity.class);
                startActivity(intent4);
            }
        });
        imgbacktohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14=new Intent(ProductinfoActivity.this,MainLoginActivity.class);
                startActivity(intent14);
            }
        });
        btnaddproducttocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //them vao gio hang

                Toast.makeText(ProductinfoActivity.this, "Đã thêm vào giỏ ", Toast.LENGTH_SHORT).show();
                Intent intent6=new Intent(ProductinfoActivity.this,MainLoginActivity.class);
                startActivity(intent6);
            }
        });

    }

    private void Linkview() {
        txtnameproduct_actiproductinfo=findViewById(R.id.txtnameproduct_actiproductinfo);
        imghinhanhinfoproduct=findViewById(R.id.imghinhanhproductinfo);
        btnordernow=findViewById(R.id.btnordernow);
        btnaddproducttocart=findViewById(R.id.btnaddproducttocart);
        txtdanhmucsanpham=findViewById(R.id.txtdanhmucsanpham);
        txtgiasanphaminfo=findViewById(R.id.txtgiasanphaminfo);
        imgbacktohome=findViewById(R.id.imgbacktohome);
        ratingbar=findViewById(R.id.ratingbar);
    }


}