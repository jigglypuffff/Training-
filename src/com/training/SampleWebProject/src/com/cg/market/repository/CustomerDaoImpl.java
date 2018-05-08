package com.cg.market.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private DataSource dataSource;
	/**
	 * 
	 */
	private JdbcTemplate jdbcTemplate;

	public CustomerDaoImpl(JdbcTemplate jdbcTemplate2) {
		// TODO Auto-generated constructor stub
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int addCustomer(final Customer customer) {

		final String query = "INSERT INTO customer (customerId, customerName, customerAddress, paymentMode) VALUES (?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] { customer.getCustomerId(), customer.getCustomerName(),
				customer.getCustomerAddress(), customer.getPaymentMode() };
		jdbcTemplate.update(query, inputs);

		return 1;
	}

	public Customer removeCustomer(final Customer customer) {

		final String query = "DELETE FROM customer WHERE customerId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] input = new Object[] { customer.getCustomerId() };
		jdbcTemplate.update(query, input);

		return customer;
	}

	public Customer updateCustomer(final Customer customer) {

		final String query = "UPDATE customer SET customerName = ? WHERE customerId=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] { customer.getCustomerName(), customer.getCustomerId() };
		jdbcTemplate.update(query, inputs);

		return customer;
	}

}
