package com.cg.market.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Goods;

/**
 * @author aishwarya
 *
 */
public class GoodsDaoImpl implements GoodsDao {


	/**
	 * 
	 */
	private DataSource dataSource;
    /**
     * 
     */
    private JdbcTemplate jdbcTemplate;
    
	public GoodsDaoImpl(JdbcTemplate jdbcTemplate2) {
		// TODO Auto-generated constructor stub
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Goods addGoods(final Goods goods) {
		final String query = "INSERT INTO goods (goodsId, goodsName, goodsQuantity, goodsPrice) VALUES (?,?,?,?)"; 
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] {goods.getGoodsId(),goods.getGoodsName(),goods.getGoodsQuantity(),goods.getGoodsPrice()};
		jdbcTemplate.update(query,inputs);
		
		return goods;
	}

	
	public Goods removeGoods(final Goods goods) {

		final String query = "DELETE FROM goods WHERE goodsId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] input = new Object[] {goods.getGoodsId()};
		jdbcTemplate.update(query,input);
		
		return goods;
	}

	
	public Goods updateGoods(final Goods goods) {

		final String query = "UPDATE goods SET goodsName = ? WHERE goodsId=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		final Object[] inputs = new Object[] {goods.getGoodsName(),goods.getGoodsId()};
		jdbcTemplate.update(query,inputs);
		
		
		return goods;
	}

}
