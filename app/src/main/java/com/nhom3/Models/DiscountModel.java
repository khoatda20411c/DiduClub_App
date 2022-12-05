package com.nhom3.Models;

import java.io.Serializable;

public class DiscountModel implements Serializable {
    private String Discount_ID;
    private String Product_Name;
    private String Percent;
    private Double Price;
    private byte[] Discount_Image;

    public DiscountModel(String discount_ID, String product_Name, String percent, Double price, byte[] discount_Image) {
        Discount_ID = discount_ID;
        Product_Name = product_Name;
        Percent = percent;
        Price = price;
        Discount_Image = discount_Image;
    }

    public String getDiscount_ID() {
        return Discount_ID;
    }

    public void setDiscount_ID(String discount_ID) {
        Discount_ID = discount_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public String getPercent() {
        return Percent;
    }

    public void setPercent(String percent) {
        Percent = percent;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public byte[] getDiscount_Image() {
        return Discount_Image;
    }

    public void setDiscount_Image(byte[] discount_Image) {
        Discount_Image = discount_Image;
    }
}
