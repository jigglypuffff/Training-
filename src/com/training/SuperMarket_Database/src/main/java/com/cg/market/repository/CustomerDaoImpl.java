package com.cg.market.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Customer addCustomer(Customer customer) {
		
		String query = "INSERT INTO customer (customerId, customerName, customerAddress, paymentMode) VALUES (?,?,?,?)"; 
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] {customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerAddress(),customer.getPaymentMode()};
		jdbcTemplate.update(query,inputs);
		
		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		
		String query = "DELETE FROM customer WHERE customerId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] input = new Object[] {customer.getCustomerId()};
		jdbcTemplate.update(query,input);
		
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		
		String query = "UPDATE customer SET customerName = ? WHERE customerId=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] {customer.getCustomerName(),customer.getCustomerId()};
		jdbcTemplate.update(query,inputs);
		
		
		return customer;
	}

}
