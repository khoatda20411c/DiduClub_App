package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.nhom3.Database.Database;

public class RegisterActivity extends AppCompatActivity {
    EditText edtUsername_activity_register, edtEmail_activity_register,
            edtPassword_activity_register, edtRetypePassword_activity_register;
    Button btnRegister_activity_register;
    CheckBox chkAccept_activity_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtUsername_activity_register = findViewById(R.id.edt_Username_activity_register);
        edtEmail_activity_register = findViewById(R.id.edt_Email_activity_register);
        edtPassword_activity_register = findViewById(R.id.edt_Password_activity_register);
        edtRetypePassword_activity_register=findViewById(R.id.edt_RetypePassword_activity_register);
        btnRegister_activity_register = findViewById(R.id.btn_Register_activity_register);
        chkAccept_activity_register = findViewById(R.id.chk_Accept_activity_register);
    }

    private void addEvents() {
        btnRegister_activity_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtUsername_activity_register.getText().toString().trim();
                String email= edtEmail_activity_register.getText().toString().trim();
                String pass = edtPassword_activity_register.getText().toString().trim();
                String repass = edtRetypePassword_activity_register.getText().toString().trim();

                if(user.equals("")||pass.equals("") || email.equals("") ||repass.equals(""))
                    Toast.makeText(RegisterActivity.this, "Vui lòng điền đủ thông tin", Toast.LENGTH_SHORT).show();
                else {
                    if(pass.equals(repass)) {
                        Boolean checkuser = checkUsername(user);
                        Boolean checkemail = checkEmail(email);
                        if (checkuser && checkemail == false) {
                            Boolean insert = insertData(user, pass, email);
                            if (insert == true) {
                                Toast.makeText(RegisterActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), RegisterSuccessfulActivity.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(RegisterActivity.this, "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(RegisterActivity.this, "Tài khoản đã tồn tại", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(RegisterActivity.this, "Mật khẩu không khớp nhau, vui lòng nhập lại", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    //check Username

    public boolean checkUsername(String username) {

        Cursor cursor= LoadingActivity.database.rawQuery(" SELECT * FROM Account WHERE User_Name = ? ",new String[]{username});
        if(cursor.getCount()>0) {
            return true;
        }
        else {
            return false;
        }
    }

    //check Email

    public boolean checkEmail(String email) {
        Cursor cursor= LoadingActivity.database.rawQuery(" SELECT * FROM Account WHERE Email = ? ",new String[]{email});
        if(cursor.getCount()>0) {
            return true;
        }
        else {
            return false;
        }
    }

    //Insert Data

    public Boolean insertData (String username, String password, String email) {
//        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("User_Name", username);
        contentValues.put("Email", email);
        contentValues.put("Password", password);
        long result = LoadingActivity.database.insert("Account", null, contentValues);
        if(result==-1) return false;
        else
            return true;
    }
}

