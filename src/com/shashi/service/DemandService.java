package com.shashi.service;

import java.util.List;

import com.shashi.beans.DemandBean;

public interface DemandService {

	// Adds a product demand for a user with the specified quantity
	public boolean addProduct(String userId, String prodId, int demandQty);

	// Adds a product demand using a DemandBean object
	public boolean addProduct(DemandBean userDemandBean);

	// Removes a product demand for a user
	public boolean removeProduct(String userId, String prodId);

	// Retrieves all demands for a specific product
	public List<DemandBean> haveDemanded(String prodId);

}
