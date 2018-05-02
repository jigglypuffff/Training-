package com.cg.market.repository;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Customer;

/**
 * @author aishwarya
 *
 */
public class CustomerDaoImpl implements CustomerDao {

	/**
	 * 
	 */
	private final JdbcTemplate jdbcTemplate;

	public CustomerDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Customer addCustomer(final Customer customer) {

		final String query = "INSERT INTO customer (customerId, customerName, customerAddress, paymentMode) VALUES (?,?,?,?)";
		final Object[] inputs = new Object[] { customer.getCustomerId(), customer.getCustomerName(),
				customer.getCustomerAddress(), customer.getPaymentMode() };
		jdbcTemplate.update(query, inputs);

		return customer;
	}

	public Customer removeCustomer(final Customer customer) {

		final String query = "DELETE FROM customer WHERE customerId = ?";
		final Object[] input = new Object[] { customer.getCustomerId() };
		jdbcTemplate.update(query, input);

		return customer;
	}

	public Customer updateCustomer(final Customer customer) {

		final String query = "UPDATE customer SET customerName = ? WHERE customerId=?";
		final Object[] inputs = new Object[] { customer.getCustomerName(), customer.getCustomerId() };
		jdbcTemplate.update(query, inputs);

		return customer;
	}

}
