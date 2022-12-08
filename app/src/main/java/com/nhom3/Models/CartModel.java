package com.nhom3.Models;

import java.io.Serializable;

public class CartModel implements Serializable {
    private String Card_ID;
    private String Account_ID;
    private String Product_Name;
    private Double Product_Quantity;
    private Double Product_Price;
    private String Product_Type;
    private byte[] Product_photo;

    public CartModel(String card_ID, String account_ID, String product_Name, Double product_Quantity, Double product_Price, String product_Type, byte[] product_photo) {
        Card_ID = card_ID;
        Account_ID = account_ID;
        Product_Name = product_Name;
        Product_Quantity = product_Quantity;
        Product_Price = product_Price;
        Product_Type = product_Type;
        Product_photo = product_photo;
    }

    public String getCard_ID() {
        return Card_ID;
    }

    public void setCard_ID(String card_ID) {
        Card_ID = card_ID;
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

    public Double getProduct_Quantity() {
        return Product_Quantity;
    }

    public void setProduct_Quantity(Double product_Quantity) {
        Product_Quantity = product_Quantity;
    }

    public Double getProduct_Price() {
        return Product_Price;
    }

    public void setProduct_Price(Double product_Price) {
        Product_Price = product_Price;
    }

    public String getProduct_Type() {
        return Product_Type;
    }

    public void setProduct_Type(String product_Type) {
        Product_Type = product_Type;
    }

    public byte[] getProduct_photo() {
        return Product_photo;
    }

    public void setProduct_photo(byte[] product_photo) {
        Product_photo = product_photo;
    }
}
