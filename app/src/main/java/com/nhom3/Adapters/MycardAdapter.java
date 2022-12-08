package com.nhom3.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.Models.CartModel;
import com.nhom3.Models.ProductModel;
import com.nhom3.diduclub_app.R;

import java.util.List;

public class MycardAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CartModel> CartList;
    TextView txttotalcost;

    public MycardAdapter(Context context, int layout, List<CartModel> cartList) {
        this.context = context;
        this.layout = layout;
        CartList = cartList;
    }

    @Override
    public int getCount() {
        return CartList.size();
    }

    @Override
    public Object getItem(int position) {
        return CartList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView txt_ProductName_item_listsanphamgiohang,txtdanhmucsanphamcart,txtsoluongsanphamcart,txt_ProductPrice_item_listsanphamgiohang;
        ImageView imghinhanhcart,imggiamsanpham,imgtangsanpham,imv_DelateProduct_item_listsanphamgiohang;
        CheckBox chkcheckprodduct;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MycardAdapter.ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            holder.txt_ProductName_item_listsanphamgiohang= convertView.findViewById(R.id.txt_ProductName_item_listsanphamgiohang);
            holder.txtdanhmucsanphamcart=convertView.findViewById(R.id.txtdanhmucsanphamcart);
            holder.txtsoluongsanphamcart=convertView.findViewById(R.id.txtsoluongsanphamcart);
            holder.txt_ProductPrice_item_listsanphamgiohang=convertView.findViewById(R.id.txt_ProductPrice_item_listsanphamgiohang);
            holder.imghinhanhcart=convertView.findViewById(R.id.imghinhanhcart);
            holder.imggiamsanpham=convertView.findViewById(R.id.imggiamsanpham);
            holder.imgtangsanpham=convertView.findViewById(R.id.imgtangsanpham);
            holder.imv_DelateProduct_item_listsanphamgiohang=convertView.findViewById(R.id.imv_DelateProduct_item_listsanphamgiohang);
            holder.chkcheckprodduct=convertView.findViewById(R.id.chkcheckprodduct);



            convertView.setTag(holder);
        }else {
            holder=(MycardAdapter.ViewHolder) convertView.getTag();
        }

        CartModel giohang=CartList.get(position);
        holder.txt_ProductName_item_listsanphamgiohang.setText(giohang.getProduct_Name());
        holder.txtdanhmucsanphamcart.setText(giohang.getProduct_Type());
        holder.txtsoluongsanphamcart.setText(giohang.getProduct_Quantity().toString());
        holder.txt_ProductPrice_item_listsanphamgiohang.setText(giohang.getProduct_Price().toString());
        byte[] hinhanh =giohang.getProduct_photo();
        Bitmap bitmap= BitmapFactory.decodeByteArray(hinhanh,0,hinhanh.length);
        holder.imghinhanhcart.setImageBitmap(bitmap);
        holder.imv_DelateProduct_item_listsanphamgiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.imgtangsanpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double d=Double.parseDouble(holder.txtsoluongsanphamcart.getText().toString());
                d=d+1;
                holder.txtsoluongsanphamcart.setText(d.toString());
            }
        });
        holder.imggiamsanpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double d=Double.parseDouble(holder.txtsoluongsanphamcart.getText().toString());
                d=d-1;
                holder.txtsoluongsanphamcart.setText(d.toString());
            }
        });
        if(holder.chkcheckprodduct.isChecked()){
            txttotalcost=convertView.findViewById(R.id.txt_TotalPrice_fragment_mycard);
            Double d,e;
            d=Double.parseDouble(holder.txt_ProductPrice_item_listsanphamgiohang.getText().toString());
            e=Double.parseDouble(holder.txtsoluongsanphamcart.getText().toString());
            Double g= d*e;
            txttotalcost.setText(g.toString());

        }

        return convertView;
    }
}
