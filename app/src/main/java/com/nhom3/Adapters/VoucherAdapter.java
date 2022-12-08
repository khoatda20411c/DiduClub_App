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

import com.nhom3.Models.VoucherModel;
import com.nhom3.diduclub_app.R;

import java.util.ArrayList;

public class VoucherAdapter extends BaseAdapter {

    private Context context;
    private int item_layout;
    private ArrayList<VoucherModel> voucherModels;

    public VoucherAdapter(Context context, int item_layout, ArrayList<VoucherModel> voucherModels) {
        this.context = context;
        this.item_layout = item_layout;
        this.voucherModels = voucherModels;
    }

    public class ViewHolder{
        TextView txt_VoucherName, txt_VoucherTerms, txt_VoucherDate;

        ImageView imv_VoucherImage;
    }

    @Override
    public int getCount() {
        return voucherModels.size();
    }

    @Override
    public Object getItem(int i) {
        return voucherModels.get(i);
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

            holder.imv_VoucherImage = view.findViewById(R.id.imv_VoucherImage_VoucherActivity);
            holder.txt_VoucherName = view.findViewById(R.id.txt_VoucherName_VoucherActivity);
            holder.txt_VoucherTerms = view.findViewById(R.id.txt_VoucherTerms_VoucherActivity);
            holder.txt_VoucherDate = view.findViewById(R.id.txt_VoucherDate_VoucherActivity);


            view.setTag(holder);

        } else{
            holder = (ViewHolder) view.getTag();
        }

        VoucherModel v = voucherModels.get(i);
        holder.txt_VoucherName.setText(v.getVoucher_Name());
        holder.txt_VoucherTerms.setText(String.valueOf(v.getVoucher_Values()) + " VND");
        holder.txt_VoucherDate.setText(v.getVoucher_Date());

        // Chuyển byte[] --> bitmap
        byte[] voucherImage = v.getVoucher_Image();
        Bitmap bitmap = BitmapFactory.decodeByteArray(voucherImage, 0, voucherImage.length);
        holder.imv_VoucherImage.setImageBitmap(bitmap);

        return view;
    }
}
