package com.nhom3.Models;

import java.io.Serializable;

public class NotificationModel implements Serializable {
    private String Noti_ID;
    private String Noti_Name;
    private String Noti_Description;
    private String Noti_Type;

    public NotificationModel(String noti_ID, String noti_Name, String noti_Description, String noti_Type) {
        Noti_ID = noti_ID;
        Noti_Name = noti_Name;
        Noti_Description = noti_Description;
        Noti_Type = noti_Type;
    }

    public String getNoti_ID() {
        return Noti_ID;
    }

    public void setNoti_ID(String noti_ID) {
        Noti_ID = noti_ID;
    }

    public String getNoti_Name() {
        return Noti_Name;
    }

    public void setNoti_Name(String noti_Name) {
        Noti_Name = noti_Name;
    }

    public String getNoti_Description() {
        return Noti_Description;
    }

    public void setNoti_Description(String noti_Description) {
        Noti_Description = noti_Description;
    }

    public String getNoti_Type() {
        return Noti_Type;
    }

    public void setNoti_Type(String noti_Type) {
        Noti_Type = noti_Type;
    }
}
