package com.nhom3.diduclub_app;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.Database.Database;

public class Confirm_order_Activity extends AppCompatActivity {
    ImageButton imv_btnBackToCart_activity_comfirm_order, imv_btneditInformation_activity_comfirm_order,
            imv_btnChooseVoucher_activity_comfirm_order;
    Button btnDatHang_activity_comfirm_order;
    TextView txtName_activity_comfirm_order, txtPhoneNumber_activity_comfirm_order,
            txtShippingAddress_activity_comfirm_order, txtPriceDelivery_activity_comfirm_order,
            txtRatingPoint_activity_comfirm_order, txtVoucherName_activity_comfirm_order,
            txtToTalProductPrice_activity_comfirm_order, txtPriceDeliveryThanhToan_activity_comfirm_order,
            txtPoint_activity_comfirm_order, txtVoucher_activity_comfirm_order, txtToTalSum_activity_comfirm_order;
    RadioButton radDelivery_activity_comfirm_order, radCash_activity_comfirm_order,
            radInternetBanking_activity_comfirm_order, radMomo_activity_comfirm_order;

    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        GetData();

        linkViews();
        addEvents();

    }

    private void addEvents() {
        imv_btnBackToCart_activity_comfirm_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnDatHang_activity_comfirm_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                int  idAccount = dataOrder.getInt(1);
//                int idOrder = dataOrder.getInt(0);
//                String address = dataOrder.getString(2);
//                String payment = dataOrder.getString(3);
//                String voucher = dataOrder.getString(4);
//                int total = dataOrder.getInt(5);
//                String name = dataOrder.getString(6);
//                String phone =dataOrder.getString(7);

                String ten = txtName_activity_comfirm_order.getText().toString();
                String phone = txtPhoneNumber_activity_comfirm_order.getText().toString();
//

            }
        });
    }

    private void linkViews() {
        imv_btnBackToCart_activity_comfirm_order = findViewById(R.id.imv_btn_BackToCart_activity_comfirm_order);
        imv_btneditInformation_activity_comfirm_order = findViewById(R.id.imv_btn_editInformation_activity_comfirm_order);
        imv_btnChooseVoucher_activity_comfirm_order = findViewById(R.id.imv_btn_ChooseVoucher_activity_comfirm_order);
        btnDatHang_activity_comfirm_order = findViewById(R.id.btn_DatHang_activity_comfirm_order);
        txtName_activity_comfirm_order = findViewById(R.id.txt_Name_activity_comfirm_order);
        txtPhoneNumber_activity_comfirm_order = findViewById(R.id.txt_PhoneNumber_activity_comfirm_order);
        txtShippingAddress_activity_comfirm_order = findViewById(R.id.txt_ShippingAddress_activity_comfirm_order);
        txtPriceDelivery_activity_comfirm_order = findViewById(R.id.txt_PriceDelivery_activity_comfirm_order);
        txtRatingPoint_activity_comfirm_order = findViewById(R.id.txt_RatingPoint_activity_comfirm_order);
        txtVoucherName_activity_comfirm_order = findViewById(R.id.txt_VoucherName_activity_comfirm_order);
        txtToTalProductPrice_activity_comfirm_order = findViewById(R.id.txt_ToTalProductPrice_activity_comfirm_order);
        txtPriceDeliveryThanhToan_activity_comfirm_order = findViewById(R.id.txt_PriceDeliveryThanhToan_activity_comfirm_order);
        txtPoint_activity_comfirm_order = findViewById(R.id.txt_Point_activity_comfirm_order);
        txtVoucher_activity_comfirm_order = findViewById(R.id.txt_Voucher_activity_comfirm_order);
        txtToTalSum_activity_comfirm_order = findViewById(R.id.txt_ToTalSum_activity_comfirm_order);

        radDelivery_activity_comfirm_order = findViewById(R.id.rad_Delivery_activity_comfirm_order);
        radCash_activity_comfirm_order = findViewById(R.id.rad_Cash_activity_comfirm_order);
        radInternetBanking_activity_comfirm_order = findViewById(R.id.rad_InternetBanking_activity_comfirm_order);
        radMomo_activity_comfirm_order = findViewById(R.id.rad_Momo_activity_comfirm_order);
    }


    private void GetData(){

        Cursor dataOrder = LoadingActivity.database.rawQuery("SELECT * FROM Order WHERE Account_ID =?",new String[]{"DC01"});

        while (dataOrder.moveToNext()){
            String order_ID = dataOrder.getString(0);
            String  account_ID = dataOrder.getString(1);
            String address = dataOrder.getString(2);
            String payment_Method = dataOrder.getString(3);
            String applied_Voucher = dataOrder.getString(4);
            double total_Price = dataOrder.getInt(5);
            String first_name = dataOrder.getString(6);
            String phone =dataOrder.getString(7);

            txtName_activity_comfirm_order.setText(first_name);
            txtPhoneNumber_activity_comfirm_order.setText(phone);
            txtShippingAddress_activity_comfirm_order.setText(address);


        }
        dataOrder.close();
        }


}