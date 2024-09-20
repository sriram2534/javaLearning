package com.java.learning;

import java.util.ArrayList;

public class Store {
    private String storeId;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String phone;
    private final ArrayList<String> products = new ArrayList<String>();

    public Store(String storeId, String address, String city, String state, String zipCode, String country, String phone) {
        this.storeId = storeId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.phone = phone;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addProduct(String productId) {
        products.add(productId);
    }

    public ArrayList<String> getProducts() {
        return products;
    }
}
