package com.shashi.beans;

import java.io.Serializable;

// Serializable interface indicates that instances of this class
// can be serialized, allowing them to be saved to a file or sent over the network
@SuppressWarnings("serial")
public class CartBean implements Serializable {

    // Default constructor
    public CartBean() {
    }

    // Properties of CartBean class
    public String userId;   // Stores the user ID associated with the cart
    public String prodId;   // Stores the product ID of the item in the cart
    public int quantity;    // Stores the quantity of the product in the cart

    // Getter method for userId property
    public String getUserId() {
        return userId;
    }

    // Setter method for userId property
    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Getter method for prodId property
    public String getProdId() {
        return prodId;
    }

    // Setter method for prodId property
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    // Getter method for quantity property
    public int getQuantity() {
        return quantity;
    }

    // Setter method for quantity property
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Parameterized constructor initializing all properties
    public CartBean(String userId, String prodId, int quantity) {
        super();
        this.userId = userId;
        this.prodId = prodId;
        this.quantity = quantity;
    }

}
