package com.nhom3.diduclub_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom3.diduclub_app.databinding.ActivityForgetPasswordBinding;

public class ForgetPasswordActivity extends AppCompatActivity {
    ActivityForgetPasswordBinding binding;
    Button btn_forgotpassword_acctivity;
    EditText edtPhonenumber1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btn_forgotpassword_acctivity=findViewById(R.id.btnforhotpassnext);
        btn_forgotpassword_acctivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgetPasswordActivity.this,OTPActivity.class);
                if(!binding.chkDieukhoan.isChecked()){
                    Toast.makeText(ForgetPasswordActivity.this, "Vui lòng đồng ý điều khoản của chúng tôi", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(ForgetPasswordActivity.this, "Bạn đã đồng ý điều khoản của chúng tôi", Toast.LENGTH_SHORT).show();

                }
                if(binding.edtPhonenumber1.length() ==  10 && binding.chkDieukhoan.isChecked()){
                    intent.putExtra("phone",binding.edtPhonenumber1.getText().toString());
                    startActivity(intent);
                }else
                    Toast.makeText(ForgetPasswordActivity.this, "Số điện thoại không hợp lệ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}