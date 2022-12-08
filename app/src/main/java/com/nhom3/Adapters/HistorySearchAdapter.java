package com.nhom3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.Models.HistorySearchModel;
import com.nhom3.diduclub_app.R;

import java.util.ArrayList;

public class HistorySearchAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<HistorySearchModel> historySearchModelArrayList;


    public HistorySearchAdapter(Context context, int layout, ArrayList<HistorySearchModel> historySearchModelArrayList) {
        this.context = context;
        this.layout = layout;
        this.historySearchModelArrayList = historySearchModelArrayList;
    }

    @Override
    public int getCount() {
        return historySearchModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return historySearchModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null ){
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.imvThumb=view.findViewById(R.id.imvbtn_ShowDetail_itemSearchHistory);
            holder.txtName = view.findViewById(R.id.txt_ProductName_ItemSearchHistory);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

//        bindingData
        HistorySearchModel historySearchModel = historySearchModelArrayList.get(i);
        holder.imvThumb.setImageResource(historySearchModel.getImvDetail());
        holder.txtName.setText(historySearchModel.getTextSearch());


        return view;
    }
    private static class ViewHolder{
        ImageView imvThumb;
        TextView txtName;
    }
}
