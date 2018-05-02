package com.cg.market.repository;

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
	private final JdbcTemplate jdbcTemplate;
	 
	 public GoodsDaoImpl(final JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
	
	public Goods addGoods(final Goods goods) {
		final String query = "INSERT INTO goods (goodsId, goodsName, goodsQuantity, goodsPrice) VALUES (?,?,?,?)"; 
		
		final Object[] inputs = new Object[] {goods.getGoodsId(),goods.getGoodsName(),goods.getGoodsQuantity(),goods.getGoodsPrice()};
		jdbcTemplate.update(query,inputs);
		
		return goods;
	}

	
	public Goods removeGoods(final Goods goods) {

		final String query = "DELETE FROM goods WHERE goodsId = ?";
		
		final Object[] input = new Object[] {goods.getGoodsId()};
		jdbcTemplate.update(query,input);
		
		return goods;
	}

	
	public Goods updateGoods(final Goods goods) {

		final String query = "UPDATE goods SET goodsName = ? WHERE goodsId=?";
		
		final Object[] inputs = new Object[] {goods.getGoodsName(),goods.getGoodsId()};
		jdbcTemplate.update(query,inputs);
		
		
		return goods;
	}

}
