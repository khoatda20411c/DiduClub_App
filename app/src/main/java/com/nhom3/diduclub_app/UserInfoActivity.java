package com.nhom3.diduclub_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class UserInfoActivity extends AppCompatActivity {

    ImageView imv_UserAvatar_UserInfoActivity;
    TextView

            txt_UserClass_UserInfoActivity,
            txt_LastName_UserInfoActivity,
            txt_FirstName_UserInfoActivity,
            txt_UserSex_UserInfoActivity,
            txt_UserPhone_UserInfoActivity,
            txt_UserDate_UserInfoActivity;

    Button btn_Modify_UserInfoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        linkViews();
        getData();

        addEvents();
    }

    private void addEvents() {

        btn_Modify_UserInfoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BitmapDrawable bitmapDrawable = (BitmapDrawable) imv_UserAvatar_UserInfoActivity.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] avatar = byteArrayOutputStream.toByteArray();

                Intent intent = new Intent(UserInfoActivity.this ,EditUserInfoActivity.class);
                intent.putExtra("class", txt_UserClass_UserInfoActivity.getText().toString());
                intent.putExtra("lastName", txt_LastName_UserInfoActivity.getText().toString());
                intent.putExtra("firstName", txt_FirstName_UserInfoActivity.getText().toString());
                intent.putExtra("gender", txt_UserSex_UserInfoActivity.getText().toString());
                intent.putExtra("phone",txt_UserPhone_UserInfoActivity.getText().toString());
                intent.putExtra("date", txt_UserDate_UserInfoActivity.getText().toString());

                intent.putExtra("avatar", avatar);

                startActivity(intent);

            }
        });
    }

    private void getData() {

        Cursor cursor = LoadingActivity.database.rawQuery(" SELECT Customer_Type, Last_Name, First_Name, Gender, Phone, DOB, Avatar FROM Account WHERE Account_ID = ? ",
                new String[]{"DC03"});
        while (cursor.moveToNext()) {
            String CustomerType = cursor.getString(0);
            String LastName = cursor.getString(1);
            String FirstName = cursor.getString(2);
            String Gender = cursor.getString(3);
            String Phone = cursor.getString(4);
            String DOB = cursor.getString(5);
            byte[] UserImage = cursor.getBlob(6);
            Bitmap bitmap = BitmapFactory.decodeByteArray(UserImage, 0, UserImage.length);
            imv_UserAvatar_UserInfoActivity.setImageBitmap(bitmap);

            txt_UserClass_UserInfoActivity.setText(CustomerType);
            txt_LastName_UserInfoActivity.setText(LastName);
            txt_FirstName_UserInfoActivity.setText(FirstName);
            txt_UserSex_UserInfoActivity.setText(Gender);
            txt_UserPhone_UserInfoActivity.setText(Phone);
            txt_UserDate_UserInfoActivity.setText(DOB);

        }
        cursor.close();
    }

    private void linkViews() {

        imv_UserAvatar_UserInfoActivity = findViewById(R.id.imv_UserAvatar_UserInfoActivity);

        txt_UserClass_UserInfoActivity = findViewById(R.id.txt_UserClass_UserInfoActivity);
        txt_LastName_UserInfoActivity = findViewById(R.id.txt_LastName_UserInfoActivity);
        txt_FirstName_UserInfoActivity = findViewById(R.id.txt_FirstName_UserInfoActivity);
        txt_UserSex_UserInfoActivity = findViewById(R.id.txt_UserSex_UserInfoActivity);
        txt_UserPhone_UserInfoActivity = findViewById(R.id.txt_UserPhone_UserInfoActivity);
        txt_UserDate_UserInfoActivity = findViewById(R.id.txt_UserDate_UserInfoActivity);

        btn_Modify_UserInfoActivity = findViewById(R.id.btn_Modify_UserInfoActivity);
    }
}