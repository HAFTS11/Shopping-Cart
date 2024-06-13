package com.shashi.beans;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Timestamp;

// Serializable interface indicates that instances of this class
// can be serialized, allowing them to be saved to a file or sent over the network
public class OrderDetails implements Serializable {

    private static final long serialVersionUID = 1L; // Unique identifier for serialization

    // Private fields to store order details
    private String orderId;       // Order ID
    private String productId;     // Product ID
    private String prodName;      // Product name
    private String qty;           // Quantity ordered
    private String amount;        // Total amount of the order
    private int shipped;          // Shipping status (0 = not shipped, 1 = shipped)
    private Timestamp time;       // Timestamp of the order
    private InputStream prodImage; // Image of the product (stored as InputStream)

    // Getter method for orderId field
    public String getOrderId() {
        return orderId;
    }

    // Setter method for orderId field
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Getter method for productId field
    public String getProductId() {
        return productId;
    }

    // Setter method for productId field
    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Getter method for prodName field
    public String getProdName() {
        return prodName;
    }

    // Setter method for prodName field
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    // Getter method for qty field
    public String getQty() {
        return qty;
    }

    // Setter method for qty field
    public void setQty(String qty) {
        this.qty = qty;
    }

    // Getter method for amount field
    public String getAmount() {
        return amount;
    }

    // Setter method for amount field
    public void setAmount(String amount) {
        this.amount = amount;
    }

    // Getter method for time field
    public Timestamp getTime() {
        return time;
    }

    // Setter method for time field
    public void setTime(Timestamp time) {
        this.time = time;
    }

    // Getter method for prodImage field
    public InputStream getProdImage() {
        return prodImage;
    }

    // Setter method for prodImage field
    public void setProdImage(InputStream prodImage) {
        this.prodImage = prodImage;
    }

    // Getter method for shipped field
    public int getShipped() {
        return shipped;
    }

    // Setter method for shipped field
    public void setShipped(int shipped) {
        this.shipped = shipped;
    }

}
