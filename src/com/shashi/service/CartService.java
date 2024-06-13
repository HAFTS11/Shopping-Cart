package com.shashi.service;

import java.util.List;

import com.shashi.beans.CartBean;

public interface CartService {

	// Adds a product to the user's cart with the specified quantity
	public String addProductToCart(String userId, String prodId, int prodQty);

	// Updates the quantity of a product in the user's cart
	public String updateProductToCart(String userId, String prodId, int prodQty);

	// Retrieves all cart items for a given user
	public List<CartBean> getAllCartItems(String userId);

	// Retrieves the total count of items in the user's cart
	public int getCartCount(String userId);

	// Retrieves the quantity of a specific item in the user's cart
	public int getCartItemCount(String userId, String itemId);

	// Removes a specific product from the user's cart
	public String removeProductFromCart(String userId, String prodId);

	// Removes all quantities of a specific product from the user's cart
	public boolean removeAProduct(String userId, String prodId);

}
