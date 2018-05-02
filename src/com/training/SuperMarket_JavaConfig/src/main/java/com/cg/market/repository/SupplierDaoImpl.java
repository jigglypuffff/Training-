package com.cg.market.repository;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Supplier;

/**
 * @author aishwarya
 *
 */
public class SupplierDaoImpl implements SupplierDao {

	/**
	 * 
	 */
	private final JdbcTemplate jdbcTemplate;

	public SupplierDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Supplier addSupplier(final Supplier supplier) {
		final String query = "INSERT INTO supplier (supplierId, supplierName, supplierAddress, quantityOrder, orderId, amount) VALUES (?,?,?,?,?,?)";

		final Object[] inputs = new Object[] { supplier.getSupplierId(), supplier.getSupplierName(),
				supplier.getSupplierAddress(), supplier.getQuantityOrder(), supplier.getOrderId(),
				supplier.getAmount() };
		jdbcTemplate.update(query, inputs);

		return supplier;
	}

	public Supplier removeSupplier(final Supplier supplier) {
		final String query = "DELETE FROM supplier WHERE supplierId = ?";

		final Object[] input = new Object[] { supplier.getSupplierId() };
		jdbcTemplate.update(query, input);

		return supplier;
	}

	public Supplier updateSupplier(final Supplier supplier) {
		final String query = "UPDATE supplier SET supplierName = ? WHERE supplierId=?";

		final Object[] inputs = new Object[] { supplier.getSupplierName(), supplier.getSupplierId() };
		jdbcTemplate.update(query, inputs);

		return supplier;
	}

}
