package com.shashi.srv;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.shashi.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AddProductSrv
 */
@WebServlet("/AddProductSrv")
@MultipartConfig(maxFileSize = 16177215) // Specifies that this servlet handles multipart/form-data requests and sets max upload size
public class AddProductSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Retrieve user session to check user type and credentials
		HttpSession session = request.getSession();
		String userType = (String) session.getAttribute("usertype");
		String userName = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");

		// Redirect to login page if user is not an admin
		if (userType == null || !userType.equals("admin")) {
			response.sendRedirect("login.jsp?message=Access Denied!");
			return;
		}

		// Redirect to login page if session is expired
		if (userName == null || password == null) {
			response.sendRedirect("login.jsp?message=Session Expired, Login Again to Continue!");
			return;
		}

		// Initialize status message for product registration
		String status = "Product Registration Failed!";
		
		// Retrieve product details from request parameters
		String prodName = request.getParameter("name");
		String prodType = request.getParameter("type");
		String prodInfo = request.getParameter("info");
		double prodPrice = Double.parseDouble(request.getParameter("price"));
		int prodQuantity = Integer.parseInt(request.getParameter("quantity"));

		// Retrieve image part from multipart request
		Part part = request.getPart("image");
		InputStream inputStream = part.getInputStream();

		// Initialize product image input stream
		InputStream prodImage = inputStream;

		// Create instance of ProductServiceImpl to interact with product service layer
		ProductServiceImpl product = new ProductServiceImpl();

		// Attempt to add product using ProductServiceImpl
		status = product.addProduct(prodName, prodType, prodInfo, prodPrice, prodQuantity, prodImage);

		// Forward status message to addProduct.jsp for displaying result
		RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp?message=" + status);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Call doGet method to process GET and POST requests in the same way
		doGet(request, response);
	}

}
