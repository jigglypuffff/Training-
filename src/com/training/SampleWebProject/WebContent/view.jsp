<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.cg.market.model.Customer"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
		List<Customer> customerList = (ArrayList<Customer>) request.getAttribute("list");
		for (Customer ref : customerList) {
			out.print("Id: " + ref.getCustomerId());
			out.print("<br/>");
			out.print("Name: " + ref.getCustomerName());
			out.print("<br/>");
			out.print("Address: " + ref.getCustomerAddress());
			out.print("<br/>");
			out.print("PaymentMode: " + ref.getPaymentMode());
			out.print("<br/>");
		}
	%>




</body>
</html>