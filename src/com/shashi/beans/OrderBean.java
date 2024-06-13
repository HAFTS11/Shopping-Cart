package com.shashi.beans;

import java.io.Serializable;

// Serializable interface indicates that instances of this class
// can be serialized, allowing them to be saved to a file or sent over the network
@SuppressWarnings("serial")
public class OrderBean implements Serializable {

    // Private fields to store transaction ID, product ID, quantity, amount, and shipping status
    private String transactionId;   // Transaction ID
    private String productId;       // Product ID
    private int quantity;           // Quantity of products
    private Double amount;          // Total amount of the order
    private int shipped;            // Shipping status (0 = not shipped, 1 = shipped)

    // Default constructor
    public OrderBean() {
        super();  // Call to superclass constructor
    }

    // Constructor with transactionId, productId, quantity, amount parameters
    public OrderBean(String transactionId, String productId, int quantity, Double amount) {
        super();  // Call to superclass constructor
        this.transactionId = transactionId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.shipped = 0;  // Default to not shipped
    }

    // Constructor with transactionId, productId, quantity, amount, shipped parameters
    public OrderBean(String transactionId, String productId, int quantity, Double amount, int shipped) {
        super();  // Call to superclass constructor
        this.transactionId = transactionId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.shipped = shipped;
    }

    // Getter method for transactionId field
    public String getTransactionId() {
        return transactionId;
    }

    // Setter method for transactionId field
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    // Getter method for productId field
    public String getProductId() {
        return productId;
    }

    // Setter method for productId field
    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Getter method for quantity field
    public int getQuantity() {
        return quantity;
    }

    // Setter method for quantity field
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter method for amount field
    public Double getAmount() {
        return amount;
    }

    // Setter method for amount field
    public void setAmount(Double amount) {
        this.amount = amount;
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
