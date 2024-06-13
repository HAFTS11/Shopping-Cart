package com.shashi.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shashi.beans.DemandBean;
import com.shashi.beans.ProductBean;
import com.shashi.service.impl.CartServiceImpl;
import com.shashi.service.impl.DemandServiceImpl;
import com.shashi.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AddtoCart
 */
@WebServlet("/AddtoCart")
public class AddtoCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddtoCart() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Retrieve user session to check user credentials
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		String userType = (String) session.getAttribute("usertype");

		// Redirect to login page if session is expired or user is not a customer
		if (userName == null || password == null || userType == null || !userType.equalsIgnoreCase("customer")) {
			response.sendRedirect("login.jsp?message=Session Expired, Login Again to Continue!");
			return;
		}

		// Successful login check

		String userId = userName; // Assume userId is the same as userName for simplicity
		String prodId = request.getParameter("pid");
		int pQty = Integer.parseInt(request.getParameter("pqty")); // Quantity of product to add to cart

		CartServiceImpl cart = new CartServiceImpl(); // Initialize CartService implementation

		ProductServiceImpl productDao = new ProductServiceImpl(); // Initialize ProductService implementation

		ProductBean product = productDao.getProductDetails(prodId); // Fetch product details based on prodId

		int availableQty = product.getProdQuantity(); // Get available quantity of the product in stock

		int cartQty = cart.getProductCount(userId, prodId); // Get current quantity of the product in user's cart

		pQty += cartQty; // Total quantity to add to cart

		PrintWriter pw = response.getWriter(); // Prepare to write response

		response.setContentType("text/html"); // Set content type as HTML

		if (pQty == cartQty) { // If user wants to remove the product from cart
			String status = cart.removeProductFromCart(userId, prodId); // Remove product from cart

			RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp"); // Redirect to user home page
			rd.include(request, response); // Include the response

			pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>"); // Display status message
		} else if (availableQty < pQty) { // If user wants more quantity than available in stock

			String status = null;

			if (availableQty == 0) {
				status = "Product is Out of Stock!";
			} else {

				cart.updateProductToCart(userId, prodId, availableQty); // Update cart with available quantity

				status = "Only " + availableQty + " no of " + product.getProdName()
						+ " are available in the shop! So we are adding only " + availableQty
						+ " products into Your Cart" + "";
			}

			// Add demand for unavailable products
			DemandBean demandBean = new DemandBean(userName, product.getProdId(), pQty - availableQty);
			DemandServiceImpl demand = new DemandServiceImpl();
			boolean flag = demand.addProduct(demandBean); // Add demand for the unavailable products

			if (flag)
				status += "<br/>Later, We Will Mail You when " + product.getProdName()
						+ " will be available into the Store!";

			RequestDispatcher rd = request.getRequestDispatcher("cartDetails.jsp"); // Redirect to cart details page
			rd.include(request, response); // Include the response

			pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>"); // Display status message

		} else { // If user's cart can accommodate the requested quantity

			String status = cart.updateProductToCart(userId, prodId, pQty); // Update cart with requested quantity

			RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp"); // Redirect to user home page
			rd.include(request, response); // Include the response

			pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>"); // Display status message
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response); // Handle POST requests similar to GET requests
	}

}
