package com.nhom3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.nhom3.Models.OrderHistoryModel;
import com.nhom3.diduclub_app.R;

import java.util.ArrayList;

public class OrderHistoryAdapter extends BaseAdapter {
    Context context;
    int orderhistoryitem_layout;
    ArrayList<OrderHistoryModel> orderHistoryModels;

    public OrderHistoryAdapter(Context context, int orderhistoryitem_layout, ArrayList<OrderHistoryModel> orderHistoryModels) {
        this.context = context;
        this.orderhistoryitem_layout = orderhistoryitem_layout;
        this.orderHistoryModels = orderHistoryModels;
    }

    @Override
    public int getCount() {
        return orderHistoryModels.size();
    }

    @Override
    public Object getItem(int i) {
        return orderHistoryModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(orderhistoryitem_layout, null);

            holder.txtProductName_history_item_card_list = view.findViewById(R.id.txt_ProductName_history_item_card_list);
            holder.txtDate_history_item_card_list = view.findViewById(R.id.txt_Date_history_item_card_list);
            holder.txtProductNumber_history_item_card_list = view.findViewById(R.id.txt_ProductNumber_history_item_card_list);
            holder.txtProductColor_history_item_card_list = view.findViewById(R.id.txt_ProductColor_history_item_card_list);
            holder.txtProductSize_history_item_card_list = view.findViewById(R.id.txt_ProductSize_history_item_card_list);
            holder.txtProductTotalPrice_history_item_card_list = view.findViewById(R.id.txt_ProductTotalPrice_history_item_card_list);
            holder.btnDetailCard_history_item_card_list = view.findViewById(R.id.btn_DetailCard_history_item_card_list);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        OrderHistoryModel oh = orderHistoryModels.get(i);
        holder.txtProductName_history_item_card_list.setText(oh.getProduct_Name());
        holder.txtDate_history_item_card_list.setText(oh.getOrder_Time());
        holder.txtProductNumber_history_item_card_list.setText(String.valueOf(oh.getProduct_Quantity()));
        holder.txtProductColor_history_item_card_list.setText(oh.getProduct_Color());
        holder.txtProductSize_history_item_card_list.setText(oh.getSize());
        holder.txtProductTotalPrice_history_item_card_list.setText(String.valueOf(oh.getTotal_Price()));

        holder.btnDetailCard_history_item_card_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }

    public static class ViewHolder{
        TextView txtProductName_history_item_card_list, txtDate_history_item_card_list,
                txtProductNumber_history_item_card_list, txtProductColor_history_item_card_list,
                txtProductSize_history_item_card_list, txtProductTotalPrice_history_item_card_list;
        Button btnDetailCard_history_item_card_list;
    }
}
