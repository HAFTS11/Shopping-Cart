package com.shashi.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable {

	public UserBean() {
		// Default constructor
	}

	// Parameterized constructor to initialize all fields
	public UserBean(String userName, Long mobileNo, String emailId, String address, int pinCode, String password) {
		super();
		this.name = userName;
		this.mobile = mobileNo;
		this.email = emailId;
		this.address = address;
		this.pinCode = pinCode;
		this.password = password;
	}

	// Instance variables
	private String name;      // User's name
	private Long mobile;      // User's mobile number
	private String email;     // User's email address
	private String address;   // User's address
	private int pinCode;      // User's PIN code
	private String password;  // User's password

	// Getter method for name field
	public String getName() {
		return name;
	}

	// Setter method for name field
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for mobile field
	public Long getMobile() {
		return mobile;
	}

	// Setter method for mobile field
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	// Getter method for email field
	public String getEmail() {
		return email;
	}

	// Setter method for email field
	public void setEmail(String email) {
		this.email = email;
	}

	// Getter method for address field
	public String getAddress() {
		return address;
	}

	// Setter method for address field
	public void setAddress(String address) {
		this.address = address;
	}

	// Getter method for pinCode field
	public int getPinCode() {
		return pinCode;
	}

	// Setter method for pinCode field
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	// Getter method for password field
	public String getPassword() {
		return password;
	}

	// Setter method for password field
	public void setPassword(String password) {
		this.password = password;
	}

}
