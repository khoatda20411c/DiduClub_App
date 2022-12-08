package com.nhom3.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.Models.ProductModel;
import com.nhom3.diduclub_app.ProductinfoActivity;
import com.nhom3.diduclub_app.R;
import com.nhom3.diduclub_app.fragment_main;

import java.util.List;

public class ProductbestsellerAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ProductModel> ProductList;

    public ProductbestsellerAdapter(Context context, int layout, List<ProductModel> productList) {
        this.context = context;
        this.layout = layout;
        ProductList = productList;
    }

    @Override
    public int getCount() {
        return ProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return ProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView txtten_bestsellerproductitem,txtdanhmuc_bestsellerproductitem,txtprice_bestsellerproductitem;
        ImageView img_bestsellerproductitem;
        GridView gvhienthihotproduct;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            holder.txtten_bestsellerproductitem= convertView.findViewById(R.id.txtten_bestsellerproductitem);
            holder.txtdanhmuc_bestsellerproductitem=convertView.findViewById(R.id.txtdanhmuc_bestsellerproductitem);
            holder.txtprice_bestsellerproductitem=convertView.findViewById(R.id.txtprice_bestsellerproductitem);
            holder.gvhienthihotproduct=convertView.findViewById(R.id.gv_HotProduct_fragment_main);

            holder.img_bestsellerproductitem=convertView.findViewById(R.id.img_bestsellerproductitem);

            convertView.setTag(holder);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }

        ProductModel sanpham=ProductList.get(position);
        holder.txtten_bestsellerproductitem.setText(sanpham.getProduct_Name());
        holder.txtdanhmuc_bestsellerproductitem.setText(sanpham.getCategory());
        holder.txtprice_bestsellerproductitem.setText(sanpham.getPromoted_Price().toString());
        byte[] hinhanh =sanpham.getProduct_Photo();
        Bitmap bitmap= BitmapFactory.decodeByteArray(hinhanh,0,hinhanh.length);
        holder.img_bestsellerproductitem.setImageBitmap(bitmap);
//        holder.gvhienthihotproduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent=new Intent(context, ProductinfoActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//            }
//        });


        return convertView;
    }
}
