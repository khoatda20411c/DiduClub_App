package com.nhom3.Models;

import java.io.Serializable;

public class OrderHistoryModel implements Serializable {
    private String Orhis_ID;
    private String Account_ID;
    private String Product_Name;
    private String Order_ID;
    private String Order_Time;
    private int Product_Quantity;
    private String Product_Color;
    private String Size;
    private double Total_Price;
    private String Category;

    public OrderHistoryModel(String orhis_ID, String account_ID, String product_Name, String order_ID, String order_Time, int product_Quantity, String product_Color, String size, double total_Price, String category) {
        Orhis_ID = orhis_ID;
        Account_ID = account_ID;
        Product_Name = product_Name;
        Order_ID = order_ID;
        Order_Time = order_Time;
        Product_Quantity = product_Quantity;
        Product_Color = product_Color;
        Size = size;
        Total_Price = total_Price;
        Category = category;
    }

    public String getOrhis_ID() {
        return Orhis_ID;
    }

    public void setOrhis_ID(String orhis_ID) {
        Orhis_ID = orhis_ID;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(String account_ID) {
        Account_ID = account_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }

    public String getOrder_Time() {
        return Order_Time;
    }

    public void setOrder_Time(String order_Time) {
        Order_Time = order_Time;
    }

    public int getProduct_Quantity() {
        return Product_Quantity;
    }

    public void setProduct_Quantity(int product_Quantity) {
        Product_Quantity = product_Quantity;
    }

    public String getProduct_Color() {
        return Product_Color;
    }

    public void setProduct_Color(String product_Color) {
        Product_Color = product_Color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public double getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(double total_Price) {
        Total_Price = total_Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
