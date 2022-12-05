package com.nhom3.Models;

import java.io.Serializable;

public class VoucherModel implements Serializable {
    private String Voucher_ID;
    private String Voucher_Name;
    private Double Voucher_Values;
    private String Voucher_Date;
    private byte[] Voucher_Image;

    public VoucherModel(String voucher_ID, String voucher_Name, Double voucher_Values, String voucher_Date, byte[] voucher_Image) {
        Voucher_ID = voucher_ID;
        Voucher_Name = voucher_Name;
        Voucher_Values = voucher_Values;
        Voucher_Date = voucher_Date;
        Voucher_Image = voucher_Image;
    }

    public String getVoucher_ID() {
        return Voucher_ID;
    }

    public void setVoucher_ID(String voucher_ID) {
        Voucher_ID = voucher_ID;
    }

    public String getVoucher_Name() {
        return Voucher_Name;
    }

    public void setVoucher_Name(String voucher_Name) {
        Voucher_Name = voucher_Name;
    }

    public Double getVoucher_Values() {
        return Voucher_Values;
    }

    public void setVoucher_Values(Double voucher_Values) {
        Voucher_Values = voucher_Values;
    }

    public String getVoucher_Date() {
        return Voucher_Date;
    }

    public void setVoucher_Date(String voucher_Date) {
        Voucher_Date = voucher_Date;
    }

    public byte[] getVoucher_Image() {
        return Voucher_Image;
    }

    public void setVoucher_Image(byte[] voucher_Image) {
        Voucher_Image = voucher_Image;
    }
}
