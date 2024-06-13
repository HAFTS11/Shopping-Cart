package com.shashi.service;

import java.util.List;

import com.shashi.beans.OrderBean;
import com.shashi.beans.OrderDetails;
import com.shashi.beans.TransactionBean;

public interface OrderService {

	// Processes payment success for a user with the specified amount
	public String paymentSuccess(String userName, double paidAmount);

	// Adds an order to the system
	public boolean addOrder(OrderBean order);

	// Adds a transaction record to the system
	public boolean addTransaction(TransactionBean transaction);

	// Counts the total sold items for a specific product
	public int countSoldItem(String prodId);

	// Retrieves all orders from the system
	public List<OrderBean> getAllOrders();

	// Retrieves orders for a specific user based on their email ID
	public List<OrderBean> getOrdersByUserId(String emailId);

	// Retrieves all order details for a specific user based on their email ID
	public List<OrderDetails> getAllOrderDetails(String userEmailId);

	// Updates the shipping status of an order for a specific product
	public String shipNow(String orderId, String prodId);
}
