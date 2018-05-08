package com.cg.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.market.model.Customer;
import com.cg.market.service.CustomerService;
import com.cg.market.service.CustomerServiceImpl;

/**
 * Servlet implementation class SampleServlet
 */
//@WebServlet("*.do")
public class SampleServlet extends HttpServlet {
	final ApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
	
	CustomerService custService = (CustomerService) config.getBean("customerService");
	String target = null;
	String path = null;
	//private CustomerService iserv = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		path = request.getServletPath();
		switch (path) {
		case "/add.do":
			
			String ID = request.getParameter("id");
			
			int a = Integer.parseInt(ID);
			
			
			
			String cust_Id = request.getParameter("a");
			String name = request.getParameter("firstname");
			String address = request.getParameter("address");
			String payment = request.getParameter("payment type");
			Customer customer = new Customer(cust_Id, name, address, payment);
			
			custService.addCustomer(customer);

			//custService = new CustomerServiceImpl();
			
			/*HttpSession ses = request.getSession(true);
			ses.setAttribute("id", id1);
			target = "success.jsp";*/
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
