package com.shashi.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.shashi.utility.IDUtil;

@SuppressWarnings("serial")
public class TransactionBean implements Serializable {

	private String transactionId;    // Unique transaction ID
	private String userName;         // User associated with the transaction
	private Timestamp transDateTime; // Date and time of the transaction
	private double transAmount;      // Amount involved in the transaction

	public TransactionBean() {
		super();
		// Initialize transaction ID using utility method
		this.transactionId = IDUtil.generateTransId();

		// Get current timestamp and format it
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		sdf.format(timestamp);

		// Set transaction date and time
		this.transDateTime = timestamp;
	}

	public TransactionBean(String userName, double transAmount) {
		super();
		this.userName = userName;
		this.transAmount = transAmount;

		// Generate transaction ID
		this.transactionId = IDUtil.generateTransId();

		// Get current timestamp and format it
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		sdf.format(timestamp);

		// Set transaction date and time
		this.transDateTime = timestamp;
	}

	public TransactionBean(String transactionId, String userName, double transAmount) {
		super();
		this.transactionId = transactionId;
		this.userName = userName;
		this.transAmount = transAmount;

		// Get current timestamp and format it
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		sdf.format(timestamp);

		// Set transaction date and time
		this.transDateTime = timestamp;
	}

	public TransactionBean(String userName, Timestamp transDateTime, double transAmount) {
		super();
		this.userName = userName;
		this.transDateTime = transDateTime;
		this.transactionId = IDUtil.generateTransId();
		this.transAmount = transAmount;
	}

	public TransactionBean(String transactionId, String userName, Timestamp transDateTime, double transAmount) {
		super();
		this.transactionId = transactionId;
		this.userName = userName;
		this.transDateTime = transDateTime;
		this.transAmount = transAmount;
	}

	// Getter method for transactionId field
	public String getTransactionId() {
		return transactionId;
	}

	// Setter method for transactionId field
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	// Getter method for userName field
	public String getUserName() {
		return userName;
	}

	// Setter method for userName field
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Getter method for transDateTime field
	public Timestamp getTransDateTime() {
		return transDateTime;
	}

	// Setter method for transDateTime field
	public void setTransDateTime(Timestamp transDateTime) {
		this.transDateTime = transDateTime;
	}

	// Getter method for transAmount field
	public double getTransAmount() {
		return transAmount;
	}

	// Setter method for transAmount field
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

}
