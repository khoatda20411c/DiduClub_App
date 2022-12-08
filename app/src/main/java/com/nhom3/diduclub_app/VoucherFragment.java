package com.nhom3.diduclub_app;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nhom3.Adapters.VoucherAdapter;
import com.nhom3.Models.VoucherModel;

import java.util.ArrayList;

public class VoucherFragment extends Fragment {

    ListView lv_ListVoucher_ListVoucherActivity;
    ArrayList<VoucherModel> voucherModels;
    VoucherAdapter voucherAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_voucher, container, false);

        lv_ListVoucher_ListVoucherActivity = view.findViewById(R.id.lv_ListVoucher_ListVoucherActivity);
        voucherModels = new ArrayList<>();

        voucherAdapter = new VoucherAdapter(getContext(), R.layout.item_list_voucher, voucherModels);
        lv_ListVoucher_ListVoucherActivity.setAdapter(voucherAdapter);

        getData();
        return view;
    }

    private void getData() {
        Cursor cursor= LoadingActivity.database.rawQuery("SELECT * FROM Voucher ",null);


        voucherModels.clear();
        while (cursor.moveToNext()){
            String id= cursor.getString(0);
            String ten= cursor.getString(1);
            Double giatri=cursor.getDouble(2);
            String thoihan= cursor.getString(3);
            byte[] hinh=cursor.getBlob(4);
            VoucherModel voucherModel = new VoucherModel(id,ten,giatri,thoihan,hinh);
            voucherModels.add(voucherModel);


        }
        cursor.close();

        voucherAdapter.notifyDataSetChanged();
    }
}
