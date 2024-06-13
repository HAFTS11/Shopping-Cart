package com.shashi.service;

import java.io.InputStream;
import java.util.List;

import com.shashi.beans.ProductBean;

public interface ProductService {

	// Adds a new product with details and image
	public String addProduct(String prodName, String prodType, String prodInfo, double prodPrice, int prodQuantity,
			InputStream prodImage);

	// Adds a new product using a ProductBean object
	public String addProduct(ProductBean product);

	// Removes a product from the system based on product ID
	public String removeProduct(String prodId);

	// Updates an existing product with new details and image
	public String updateProduct(ProductBean prevProduct, ProductBean updatedProduct);

	// Updates the price of a product identified by product ID
	public String updateProductPrice(String prodId, double updatedPrice);

	// Retrieves all products available in the system
	public List<ProductBean> getAllProducts();

	// Retrieves all products of a specific type (e.g., category)
	public
