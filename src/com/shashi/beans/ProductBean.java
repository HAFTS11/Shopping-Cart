package com.shashi.beans;

import java.io.InputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {

    public ProductBean() {
        // Default constructor
    }

    // Private fields to store product information
    private String prodId;           // Product ID
    private String prodName;         // Product name
    private String prodType;         // Product type
    private String prodInfo;         // Product information
    private double prodPrice;        // Product price
    private int prodQuantity;        // Product quantity
    private InputStream prodImage;   // Product image stored as InputStream

    // Constructor with all fields
    public ProductBean(String prodId, String prodName, String prodType, String prodInfo,
                       double prodPrice, int prodQuantity, InputStream prodImage) {
        super();
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodInfo = prodInfo;
        this.prodPrice = prodPrice;
        this.prodQuantity = prodQuantity;
        this.prodImage = prodImage;
    }

    // Getter method for prodId field
    public String getProdId() {
        return prodId;
    }

    // Setter method for prodId field
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    // Getter method for prodName field
    public String getProdName() {
        return prodName;
    }

    // Setter method for prodName field
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    // Getter method for prodType field
    public String getProdType() {
        return prodType;
    }

    // Setter method for prodType field
    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    // Getter method for prodInfo field
    public String getProdInfo() {
        return prodInfo;
    }

    // Setter method for prodInfo field
    public void setProdInfo(String prodInfo) {
        this.prodInfo = prodInfo;
    }

    // Getter method for prodPrice field
    public double getProdPrice() {
        return prodPrice;
    }

    // Setter method for prodPrice field
    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    // Getter method for prodQuantity field
    public int getProdQuantity() {
        return prodQuantity;
    }

    // Setter method for prodQuantity field
    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    // Getter method for prodImage field
    public InputStream getProdImage() {
        return prodImage;
    }

    // Setter method for prodImage field
    public void setProdImage(InputStream prodImage) {
        this.prodImage = prodImage;
    }

}
