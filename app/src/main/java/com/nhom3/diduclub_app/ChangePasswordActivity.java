package com.nhom3.diduclub_app;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.Database.Database;

public class ChangePasswordActivity extends AppCompatActivity {
    EditText edtNewPassWord_activity_change_password, edtReTypePassWord_activity_change_password;
    Database database;
    Button btnConfirm_activity_change_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        linkViews();
        addEvents();

    }

//    private boolean valid() {
//        String passwordInput=edtNewPassWord_activity_change_password.getText().toString().trim();
//        if (passwordInput.isEmpty()) {
//            return false;
//        } else if (passwordInput.length() < 6) {
//            return false;
//        }
//        else {
//            edtReTypePassWord_activity_change_password.setError(null,null);
//            return true;
//        }
//    }

//    private boolean comparePassWord() {
//        String passwordComPare= edtNewPassWord_activity_change_password.getText().toString().trim();
//        if (passwordComPare.isEmpty()) {
//            return false;
//        } else if (passwordComPare.length() < 6) {
//            return false;
//        }else if (!edtNewPassWord_activity_change_password.getText().toString().equals(edtReTypePassWord_activity_change_password.getText().toString())) {
//            return false;
//        }
//        else {
//            return true;
//        }
//    }



    private void linkViews() {
        edtNewPassWord_activity_change_password = findViewById(R.id.edt_NewPassWord_activity_change_password);
        edtNewPassWord_activity_change_password = findViewById(R.id.edt_NewPassWord_activity_change_password);
        btnConfirm_activity_change_password = findViewById(R.id.btn_Confirm_activity_change_password);
    }

    private void addEvents() {
        btnConfirm_activity_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//               checked();
//               Intent intent=new Intent(ChangePasswordActivity.this,MainLoginActivity.class);

//
//                if(!edtNewPassWord_activity_change_password.getText().toString().equals(edtReTypePassWord_activity_change_password.getText().toString()))
//                {
////                    startActivity(intent);
//                }
//                else{
//                    Toast.makeText(ChangePasswordActivity.this, "BẠN HÃY KIỂM TRA LẠI THÔNG TIN", Toast.LENGTH_SHORT).show();
//                }

                Intent intent = new Intent(ChangePasswordActivity.this,MainLoginActivity.class);
                startActivity(intent);
            }
        });
    }
//    private void checked(){
//        if (edtNewPassWord_activity_change_password.length() ==0 ) {
//            edtNewPassWord_activity_change_password.setError("Vui lòng nhập đầy đủ thông tin!",null);
//        }else if (edtNewPassWord_activity_change_password.length() < 6) {
//            edtNewPassWord_activity_change_password.setError("Mật khẩu sai cú pháp",null);
//        }else if (edtReTypePassWord_activity_change_password.length() ==0 ) {
//            edtReTypePassWord_activity_change_password.setError("Vui lòng nhập đầy đủ thông tin",null);
//        }else if (edtReTypePassWord_activity_change_password.length() < 6) {
//            edtReTypePassWord_activity_change_password.setError("Mật khẩu sai cú pháp",null);
//        } else if (!edtNewPassWord_activity_change_password.getText().toString().equals(edtReTypePassWord_activity_change_password.getText().toString()) ) {
//            edtReTypePassWord_activity_change_password.setError("Mật khẩu không trùng khớp",null);
//        }
//
//    }

    private void GetData(){
        Intent intent = getIntent();
        String phonetook = intent.getStringExtra("phone");
        Cursor cursor = LoadingActivity.database.rawQuery("SELECT Phone FROM Account WHERE Phone =?",new String[]{"0123456789"});

        while (cursor.moveToNext()){
            String phone =cursor.getString(0);
            if(phonetook.equals(phone) ){
                ContentValues values = new ContentValues();
                values.put( "Phone" , phonetook);

//                    int updatedRows = LoadingActivity.database.update("Account", values, "Phone" + "=?", new String[]{phonet});

//                if (updatedRows > 0){
//                    Toast.makeText(EditActivity.this, "Success!", Toast.LENGTH_SHORT).show();
//                } else {
////                    Toast.makeText(EditActivity.this, "Fail!", Toast.LENGTH_SHORT).show();
//                }
//                finish();
            }
            }

    }

}