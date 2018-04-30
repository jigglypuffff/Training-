package com.cg.market.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

public class RetailerDaoImpl implements RetailerDao{

	private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Customer> clist() {
		/*String query = "SELECT * FROM customer";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Customer customer = new Customer ();
		Object[] inputs = new Object[] {customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerAddress(),customer.getPaymentMode()};
		jdbcTemplate.update(query,inputs);
		*/
		
		
		    String sql = "SELECT * FROM customer";
		    List<Customer> customerList = jdbcTemplate.query(sql, new RowMapper<Customer>() {
		 
		        @Override
		        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
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
	public Retailer addRetailer(Retailer retailer) {
		String query = "INSERT INTO retailer (retailerId, retailerName, retailerAddress) VALUES (?,?,?)"; 
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] {retailer.getRetailerId(),retailer.getRetailerName(),retailer.getRetailerAddress()};
		jdbcTemplate.update(query,inputs);
		return retailer;
	}

}
