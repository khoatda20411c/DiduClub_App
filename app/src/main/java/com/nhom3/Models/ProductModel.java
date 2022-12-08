package com.nhom3.Models;

import java.io.Serializable;

public class ProductModel implements Serializable {
    private String Product_ID;
    private String Product_Name;
    private String Category;
    private Double Promoted_Price;
    private String Size;
    private Double Stock_Price;
    private Double Star;
    private String Description;
    private int Rating_Number;
    private byte[] Product_Photo;
    private String Product_Color;

    public ProductModel(String product_ID, String product_Name, String category, Double promoted_Price, String size, Double stock_Price, Double star, String description, int rating_Number, byte[] product_Photo, String product_Color) {
        Product_ID = product_ID;
        Product_Name = product_Name;
        Category = category;
        Promoted_Price = promoted_Price;
        Size = size;
        Stock_Price = stock_Price;
        Star = star;
        Description = description;
        Rating_Number = rating_Number;
        Product_Photo = product_Photo;
        Product_Color = product_Color;
    }

    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String product_ID) {
        Product_ID = product_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Double getPromoted_Price() {
        return Promoted_Price;
    }

    public void setPromoted_Price(Double promoted_Price) {
        Promoted_Price = promoted_Price;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public Double getStock_Price() {
        return Stock_Price;
    }

    public void setStock_Price(Double stock_Price) {
        Stock_Price = stock_Price;
    }

    public Double getStar() {
        return Star;
    }

    public void setStar(Double star) {
        Star = star;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getRating_Number() {
        return Rating_Number;
    }

    public void setRating_Number(int rating_Number) {
        Rating_Number = rating_Number;
    }

    public byte[] getProduct_Photo() {
        return Product_Photo;
    }

    public void setProduct_Photo(byte[] product_Photo) {
        Product_Photo = product_Photo;
    }

    public String getProduct_Color() {
        return Product_Color;
    }

    public void setProduct_Color(String product_Color) {
        Product_Color = product_Color;
    }
}
