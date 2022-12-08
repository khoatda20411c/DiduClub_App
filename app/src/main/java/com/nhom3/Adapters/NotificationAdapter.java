package com.nhom3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nhom3.Models.NotificationModel;
import com.nhom3.Models.OrderHistoryModel;
import com.nhom3.diduclub_app.R;

import java.util.ArrayList;

public class NotificationAdapter extends BaseAdapter {
    Context context;
    int notiloginitem_layout;
    ArrayList<NotificationModel> notificationModels;

    public NotificationAdapter(Context context, int notiloginitem_layout, ArrayList<NotificationModel> notificationModels) {
        this.context = context;
        this.notiloginitem_layout = notiloginitem_layout;
        this.notificationModels = notificationModels;
    }



    @Override
    public int getCount() {
        return notificationModels.size();
    }

    @Override
    public Object getItem(int i) {
        return notificationModels.get(i);
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
            view = inflater.inflate(notiloginitem_layout, null);

            holder.txtNotiName_item_noti_login = view.findViewById(R.id.txt_NotiName_item_noti_login);
            holder.txtNotiDescription_item_noti_login = view.findViewById(R.id.txt_NotiDescription_item_noti_login);
            holder.txtNotiType_item_noti_login = view.findViewById(R.id.txt_NotiType_item_noti_login);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        NotificationModel nm = notificationModels.get(i);
        holder.txtNotiName_item_noti_login.setText(nm.getNoti_Name());
        holder.txtNotiDescription_item_noti_login.setText(nm.getNoti_Description());
        holder.txtNotiType_item_noti_login.setText(nm.getNoti_Type());

        return view;
    }

    public static class ViewHolder {
        TextView txtNotiName_item_noti_login, txtNotiDescription_item_noti_login, txtNotiType_item_noti_login;
    }
}
