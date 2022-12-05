package com.nhom3.Models;

import java.io.Serializable;

public class AccountModel implements Serializable {
    String Account_ID;
    String User_name;
    String Password;
    String Email;
    String Phone;
    String Last_Name;
    String First_Name;
    String DOB;
    byte[] Avatar;
    String Customer_type;
    String Gender;
    String Address;
    String Bank_Account;
    String Bank_Number;
    String Momo_Name;

    public AccountModel(String account_ID, String user_name, String password, String email, String phone, String last_Name, String first_Name, String DOB, byte[] avatar, String customer_type, String gender, String address, String bank_Account, String bank_Number, String momo_Name) {
        Account_ID = account_ID;
        User_name = user_name;
        Password = password;
        Email = email;
        Phone = phone;
        Last_Name = last_Name;
        First_Name = first_Name;
        this.DOB = DOB;
        Avatar = avatar;
        Customer_type = customer_type;
        Gender = gender;
        Address = address;
        Bank_Account = bank_Account;
        Bank_Number = bank_Number;
        Momo_Name = momo_Name;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(String account_ID) {
        Account_ID = account_ID;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public byte[] getAvatar() {
        return Avatar;
    }

    public void setAvatar(byte[] avatar) {
        Avatar = avatar;
    }

    public String getCustomer_type() {
        return Customer_type;
    }

    public void setCustomer_type(String customer_type) {
        Customer_type = customer_type;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBank_Account() {
        return Bank_Account;
    }

    public void setBank_Account(String bank_Account) {
        Bank_Account = bank_Account;
    }

    public String getBank_Number() {
        return Bank_Number;
    }

    public void setBank_Number(String bank_Number) {
        Bank_Number = bank_Number;
    }

    public String getMomo_Name() {
        return Momo_Name;
    }

    public void setMomo_Name(String momo_Name) {
        Momo_Name = momo_Name;
    }
}
