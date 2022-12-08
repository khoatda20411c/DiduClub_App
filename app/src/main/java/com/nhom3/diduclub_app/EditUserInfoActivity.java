package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class EditUserInfoActivity extends AppCompatActivity {

    ImageView imv_EditAvatar_EditUserInfoActivity;
    TextView txt_EditClass_EditUserInfoActivity;

    EditText
            edt_EditLastName_EditUserInfoActivity,
            edt_EditFirstName_EditUserInfoActivity,
            edt_EditUserSex_EditUserInfoActivity,
            edt_EditPhone_EditUserInfoActivity,
            edt_EditDate_EditUserInfoActivity;

    Button btn_EditUpdate_EditUserInfoActivity;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_info);

        linkViews();
        addEvents();
        getData();
    }

    private void getData() {

        intent = getIntent();
        String userClass = intent.getStringExtra("class");
        String lastName = intent.getStringExtra("lastName");
        String firstName = intent.getStringExtra("firstName");
        String gender = intent.getStringExtra("gender");
        String phone = intent.getStringExtra("phone");
        String date = intent.getStringExtra("date");

        byte[] userAvatar = intent.getByteArrayExtra("avatar");
        Bitmap bitmap = BitmapFactory.decodeByteArray(userAvatar, 0, userAvatar.length);
        imv_EditAvatar_EditUserInfoActivity.setImageBitmap(bitmap);

        txt_EditClass_EditUserInfoActivity.setText(userClass);
        edt_EditLastName_EditUserInfoActivity.setText(lastName);
        edt_EditFirstName_EditUserInfoActivity.setText(firstName);
        edt_EditUserSex_EditUserInfoActivity.setText(gender);
        edt_EditPhone_EditUserInfoActivity.setText(phone);
        edt_EditDate_EditUserInfoActivity.setText(date);
    }

    private void addEvents() {

        btn_EditUpdate_EditUserInfoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BitmapDrawable bitmapDrawable = (BitmapDrawable) imv_EditAvatar_EditUserInfoActivity.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] editedAvatar = byteArrayOutputStream.toByteArray();

                String updateLastName = edt_EditLastName_EditUserInfoActivity.getText().toString();
                String updateFirstName = edt_EditFirstName_EditUserInfoActivity.getText().toString();
                String updateGender = edt_EditUserSex_EditUserInfoActivity.getText().toString();
                String updatePhone = edt_EditPhone_EditUserInfoActivity.getText().toString();
                String updateDate = edt_EditDate_EditUserInfoActivity.getText().toString();
                LoadingActivity.database.rawQuery("UPDATE Account SET Last_Name=?, First_Name=?, Gender=?, Phone=?, DOB=? WHERE Account_ID=? ", new String[]{updateLastName, updateFirstName, updateGender, updatePhone, updateDate, "DC03"} );
                Toast.makeText(EditUserInfoActivity.this, "Cap nhat thanh cong", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }

    private void linkViews() {

        imv_EditAvatar_EditUserInfoActivity = findViewById(R.id.imv_EditAvatar_EditUserInfoActivity);
        txt_EditClass_EditUserInfoActivity = findViewById(R.id.txt_EditClass_EditUserInfoActivity);
        edt_EditLastName_EditUserInfoActivity = findViewById(R.id.edt_EditLastName_EditUserInfoActivity);
        edt_EditFirstName_EditUserInfoActivity = findViewById(R.id.edt_EditFirstName_EditUserInfoActivity);
        edt_EditUserSex_EditUserInfoActivity = findViewById(R.id.edt_EditUserSex_EditUserInfoActivity);
        edt_EditPhone_EditUserInfoActivity = findViewById(R.id.edt_EditPhone_EditUserInfoActivity);
        edt_EditDate_EditUserInfoActivity = findViewById(R.id.edt_EditDate_EditUserInfoActivity);

        btn_EditUpdate_EditUserInfoActivity = findViewById(R.id.btn_EditUpdate_EditUserInfoActivity);
    }
}