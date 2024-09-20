package com.java.learning;

public class Product {
    private String productName;
    private double productPrice;
    private String slin;
    private String productId;
    private String categoryId;
    private String categoryName;
    private String catalogType;

    public Product(String productName, double productPrice, String slin, String productId, String categoryId, String categoryName, String catalogType) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.slin = slin;
        this.productId = productId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.catalogType = catalogType;
    }
}
