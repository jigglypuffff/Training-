package com.cg.market.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

public class RetailerDaoImpl implements RetailerDao {

	/**
	 * 
	 */
	private final JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 */
	public RetailerDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Customer> clist() {
		/*
		 * String query = "SELECT * FROM customer"; jdbcTemplate = new
		 * JdbcTemplate(dataSource); Customer customer = new Customer (); Object[]
		 * inputs = new Object[] {customer.getCustomerId(),customer.getCustomerName(),
		 * customer.getCustomerAddress(),customer.getPaymentMode()};
		 * jdbcTemplate.update(query,inputs);
		 */

		final String sql = "SELECT * FROM customer";
		List<Customer> customerList = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(final ResultSet rs, final int rowNum) throws SQLException {
				Customer customer = new Customer();

				customer.setCustomerId(rs.getInt("customerId"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setCustomerAddress(rs.getString("customerAddress"));
				customer.setPaymentMode(rs.getString("paymentMode"));

				return customer;
			}

		});

		return customerList;
	}

	@Override
	public List<Supplier> slist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> glist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retailer addRetailer(final Retailer retailer) {
		final String query = "INSERT INTO retailer (retailerId, retailerName, retailerAddress) VALUES (?,?,?)";

		final Object[] inputs = new Object[] { retailer.getRetailerId(), retailer.getRetailerName(),
				retailer.getRetailerAddress() };
		jdbcTemplate.update(query, inputs);
		return retailer;
	}

	@Override
	public Retailer removeRetailer(final Retailer retailer) {
		final String query = "DELETE FROM supplier WHERE supplierId = ?";

		final Object[] input = new Object[] { retailer.getRetailerId() };
		jdbcTemplate.update(query, input);

		return retailer;
	}

	@Override
	public Retailer updateRetailer(final Retailer retailer) {
		final String query = "UPDATE supplier SET supplierName = ? WHERE supplierId=?";

		final Object[] inputList = new Object[] { retailer.getRetailerName(), retailer.getRetailerId() };
		jdbcTemplate.update(query, inputList);

		return retailer;
	}

}
