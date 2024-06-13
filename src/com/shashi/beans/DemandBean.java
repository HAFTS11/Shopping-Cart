package com.shashi.beans;

import java.io.Serializable;

// Serializable interface indicates that instances of this class
// can be serialized, allowing them to be saved to a file or sent over the network
@SuppressWarnings("serial")
public class DemandBean implements Serializable {

    // Private fields to store user name, product ID, and demand quantity
    private String userName;   // User's name
    private String prodId;     // Product ID
    private int demandQty;     // Demand quantity

    // Default constructor
    public DemandBean() {
        super();  // Call to superclass constructor
    }

    // Parameterized constructor to initialize all fields
    public DemandBean(String userName, String prodId, int demandQty) {
        super();  // Call to superclass constructor
        this.userName = userName;
        this.prodId = prodId;
        this.demandQty = demandQty;
    }

    // Getter method for userName field
    public String getUserName() {
        return userName;
    }

    // Setter method for userName field
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter method for prodId field
    public String getProdId() {
        return prodId;
    }

    // Setter method for prodId field
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    // Getter method for demandQty field
    public int getDemandQty() {
        return demandQty;
    }

    // Setter method for demandQty field
    public void setDemandQty(int demandQty) {
        this.demandQty = demandQty;
    }

}
