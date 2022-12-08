package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Edit_Information_Activity extends AppCompatActivity {
    ImageView imvAccountAvatar_activity_edit_information;
    Button btnChonAnh_activity_edit_information, btnLuuCacThayDoi_activity_edit_information, btnHuy_activity_edit_information;
    EditText edtName_activity_edit_information, edtEditSDT_activity_edit_information, edtNgaySinh_activity_edit_information;
    RadioButton radNam_activity_edit_information, radNu_activity_edit_information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_information);
        linkViews();
        addEvents();
    }

    private void addEvents() {
        btnChonAnh_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnLuuCacThayDoi_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnHuy_activity_edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void linkViews() {
        imvAccountAvatar_activity_edit_information = findViewById(R.id.imv_AccountAvatar_activity_edit_information);

        btnChonAnh_activity_edit_information = findViewById(R.id.btn_ChonAnh_activity_edit_information);
        btnLuuCacThayDoi_activity_edit_information = findViewById(R.id.btn_LuuCacThayDoi_activity_edit_information);
        btnHuy_activity_edit_information = findViewById(R.id.btn_Huy_activity_edit_information);

        edtName_activity_edit_information = findViewById(R.id.edt_Name_activity_edit_information);
        edtEditSDT_activity_edit_information = findViewById(R.id.edt_EditSDT_activity_edit_information);
        edtNgaySinh_activity_edit_information = findViewById(R.id.edt_NgaySinh_activity_edit_information);

        radNam_activity_edit_information = findViewById(R.id.rad_Nam_activity_edit_information);
        radNu_activity_edit_information = findViewById(R.id.rad_Nu_activity_edit_information);
    }
}