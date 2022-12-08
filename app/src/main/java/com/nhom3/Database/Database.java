package com.nhom3.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.nhom3.diduclub_app.MainActivity;

public class Database extends SQLiteOpenHelper {
    public static Database database;
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // truy van tra ket qua UPDATE,INSERT,DELETE
    public void Querrydata(String sql){
        SQLiteDatabase database=getWritableDatabase();
        database.execSQL(sql);

    }

    // truy van tra ket qua SELECT
    public Cursor Getdata(String sql){
        SQLiteDatabase database=getReadableDatabase();
        return database.rawQuery(sql,null);

    }
}
