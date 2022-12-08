package com.nhom3.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.Models.ProductModel;
import com.nhom3.diduclub_app.R;

import java.util.List;

public class ProductSuggestAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ProductModel> ProductList;

    public ProductSuggestAdapter(Context context, int layout, List<ProductModel> productList) {
        this.context = context;
        this.layout = layout;
        ProductList = productList;
    }

    @Override
    public int getCount() {
        return ProductList.size();
    }

    @Override
    public Object getItem(int i) {
        return ProductList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder.txt_ProductName_ProductSuggestItem= view.findViewById(R.id.txt_ProductName_ItemProductSuggest);
            holder.txt_Des_ProductSuggestItem=view.findViewById(R.id.txt_ProductDes_ItemProductSuggest);
            holder.img_ProductSuggest_item=view.findViewById(R.id.imv_ProductThumb_ItemProductSuggest);
            view.setTag(holder);
        }else {
            holder=(ViewHolder) view.getTag();
        }

        ProductModel sanpham = ProductList.get(i);
        holder.txt_ProductName_ProductSuggestItem.setText(sanpham.getProduct_Name());
        holder.txt_Des_ProductSuggestItem.setText(sanpham.getCategory());
        byte[] hinhanh =sanpham.getProduct_Photo();
        Bitmap bitmap = BitmapFactory.decodeByteArray(hinhanh,0,hinhanh.length);
        holder.img_ProductSuggest_item.setImageBitmap(bitmap);


        return view;
    }

    private class ViewHolder{
        TextView  txt_ProductName_ProductSuggestItem,txt_Des_ProductSuggestItem;
        ImageView img_ProductSuggest_item;


    }
}
