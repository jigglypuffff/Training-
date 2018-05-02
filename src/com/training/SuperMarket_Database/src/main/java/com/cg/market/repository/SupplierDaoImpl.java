package com.cg.market.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Supplier;

/**
 * @author trainee
 *
 */
public class SupplierDaoImpl implements SupplierDao{


	/**
	 * 
	 */
	private DataSource dataSource;
    /**
     * 
     */
    private JdbcTemplate jdbcTemplate;
    
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Supplier addSupplier(final Supplier supplier) {
		final String query = "INSERT INTO supplier (supplierId, supplierName, supplierAddress, quantityOrder, orderId, amount) VALUES (?,?,?,?,?,?)"; 
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] {supplier.getSupplierId(),supplier.getSupplierName(),supplier.getSupplierAddress(),supplier.getQuantityOrder(),supplier.getOrderId(),supplier.getAmount()};
		jdbcTemplate.update(query,inputs);
		
		return supplier;
	}

	
	public Supplier removeSupplier(final Supplier supplier) {
		final String query = "DELETE FROM supplier WHERE supplierId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] input = new Object[] {supplier.getSupplierId()};
		jdbcTemplate.update(query,input);
		
		return supplier;
	}

	
	public Supplier updateSupplier(final Supplier supplier) {
		final String query = "UPDATE supplier SET supplierName = ? WHERE supplierId=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] {supplier.getSupplierName(),supplier.getSupplierId()};
		jdbcTemplate.update(query,inputs);
		
		
		return supplier;
	}

}
