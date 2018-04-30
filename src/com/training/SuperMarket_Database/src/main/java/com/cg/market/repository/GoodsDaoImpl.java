package com.cg.market.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.market.model.Goods;

public class GoodsDaoImpl implements GoodsDao {


	private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Goods addGoods(Goods goods) {
		String query = "INSERT INTO goods (goodsId, goodsName, goodsQuantity, goodsPrice) VALUES (?,?,?,?)"; 
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] {goods.getGoodsId(),goods.getGoodsName(),goods.getGoodsQuantity(),goods.getGoodsPrice()};
		jdbcTemplate.update(query,inputs);
		
		return goods;
	}

	
	public Goods removeGoods(Goods goods) {

		String query = "DELETE FROM goods WHERE goodsId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] input = new Object[] {goods.getGoodsId()};
		jdbcTemplate.update(query,input);
		
		return goods;
	}

	
	public Goods updateGoods(Goods goods) {

		String query = "UPDATE goods SET goodsName = ? WHERE goodsId=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] {goods.getGoodsName(),goods.getGoodsId()};
		jdbcTemplate.update(query,inputs);
		
		
		return goods;
	}

}
