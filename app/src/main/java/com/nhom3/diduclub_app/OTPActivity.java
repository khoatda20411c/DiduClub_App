package com.nhom3.diduclub_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.diduclub_app.databinding.ActivityOtpactivityBinding;

public class OTPActivity extends AppCompatActivity {
    Button btnnext_otp;
    ActivityOtpactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnnext_otp=findViewById(R.id.btnnext_otp);
        btnnext_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent intent= new Intent(OTPActivity.this,ChangePasswordActivity.class);
                if(binding.OTP1.length() != 0 && binding.OTP2.length() != 0 && binding.OTP3.length() != 0 && binding.OTP4.length() != 0){
                    Intent intent=getIntent();
                    String phonetook = intent.getStringExtra("phone");
                    Boolean checkphone = checkOtpPhone(phonetook);
                    if (checkphone) {
                            Toast.makeText(OTPActivity.this, "OTP hợp lệ", Toast.LENGTH_SHORT).show();
                            Intent intent1  = new Intent(getApplicationContext(), ChangePasswordActivity.class);
                        startActivity(intent1);
                        Intent intent2 = new Intent(OTPActivity.this,ChangePasswordActivity.class);
                        startActivity(intent2);

                    } else {
                        Toast.makeText(OTPActivity.this, "OTP không hợp lệ, kiểm tra lại số điện thoại", Toast.LENGTH_SHORT).show();

                    }
                }else{
                    Toast.makeText(OTPActivity.this, "Vui lòng nhập OTP đầy đủ", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }


    public boolean checkOtpPhone(String phone) {
        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT * FROM Account WHERE Phone = ? ", new String[]{phone});
        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }
}