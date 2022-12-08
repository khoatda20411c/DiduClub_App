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

import com.nhom3.Models.DiscountModel;
import com.nhom3.diduclub_app.R;

import java.util.ArrayList;

public class DiscountAdapter extends BaseAdapter {
    private Context context;
    private int item_layout;
    private ArrayList<DiscountModel> discountModels;

    public DiscountAdapter(Context context, int item_layout, ArrayList<DiscountModel> discountModels) {
        this.context = context;
        this.item_layout = item_layout;
        this.discountModels = discountModels;
    }

    public class ViewHolder{
        ImageView imvDiscountImage;

        TextView
                txtDiscountNumber,
                txtProductName,
                txtProductType,
                txtProductPrice;
    }

    @Override
    public int getCount() {
        return discountModels.size();
    }

    @Override
    public Object getItem(int i) {
        return discountModels.get(i);
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
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_layout, null);

            holder.imvDiscountImage = view.findViewById(R.id.imv_DiscountImage_DiscountActivity);
            holder.txtDiscountNumber = view.findViewById(R.id.txt_DiscountNumber_DiscountActivity);
            holder.txtProductName = view.findViewById(R.id.txt_ProductName_DiscountActivity);
            holder.txtProductType = view.findViewById(R.id.txt_ProductType_DiscountActivity);
            holder.txtProductPrice = view.findViewById(R.id.txt_ProductPrice_DiscountActivity);


            view.setTag(holder);

        } else{
            holder = (ViewHolder) view.getTag();
        }

        DiscountModel d = discountModels.get(i);
        holder.txtDiscountNumber.setText(d.getPercent() + "%");
        holder.txtProductName.setText(d.getProduct_Name());
        holder.txtProductType.setText(d.getProduct_Type());
        holder.txtProductPrice.setText(String.valueOf(d.getPrice()) + " VND");

        // Chuyển byte[] --> bitmap
        byte[] discountImage = d.getDiscount_Image();
        Bitmap bitmap = BitmapFactory.decodeByteArray(discountImage, 0, discountImage.length);
        holder.imvDiscountImage.setImageBitmap(bitmap);
        return view;
    }

}
