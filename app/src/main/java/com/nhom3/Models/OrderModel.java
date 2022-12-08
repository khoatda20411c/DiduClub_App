package com.nhom3.Models;

import java.io.Serializable;

public class OrderModel implements Serializable {
    private String Order_ID;
    private String Account_ID;
    private String Address;
    private String Payment_Method;
    private String Applied_Voucher;
    private Double Total_Price;
    private String First_name;
    private String Phone;

    public OrderModel(String order_ID, String account_ID, String address, String payment_Method, String applied_Voucher, Double total_Price, String first_name, String phone) {
        Order_ID = order_ID;
        Account_ID = account_ID;
        Address = address;
        Payment_Method = payment_Method;
        Applied_Voucher = applied_Voucher;
        Total_Price = total_Price;
        First_name = first_name;
        Phone = phone;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(String account_ID) {
        Account_ID = account_ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPayment_Method() {
        return Payment_Method;
    }

    public void setPayment_Method(String payment_Method) {
        Payment_Method = payment_Method;
    }

    public String getApplied_Voucher() {
        return Applied_Voucher;
    }

    public void setApplied_Voucher(String applied_Voucher) {
        Applied_Voucher = applied_Voucher;
    }

    public Double getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(Double total_Price) {
        Total_Price = total_Price;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
