package com.shashi.service;

import com.shashi.beans.UserBean;

public interface UserService {

	// Registers a new user with provided details
	public String registerUser(String userName, Long mobileNo, String emailId, String address, int pinCode,
			String password);

	// Registers a new user using a UserBean object
	public String registerUser(UserBean user);

	// Checks if a user with the given email ID is already registered
	public boolean isRegistered(String emailId);

	// Validates user credentials (email ID and password)
	public String isValidCredential(String emailId, String password);

	// Retrieves details of a user based on email ID and password
	public UserBean getUserDetails(String emailId, String password);

	// Retrieves the first name of a user based on email ID
	public String getFName(String emailId);

	// Retrieves the address of a user based on user ID
	public String getUserAddr(String userId);

}
