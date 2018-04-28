package com.cg.supermarket.repository;

import com.cg.supermarket.model.Goods;

/**
 * @author trainee
 *
 */
public interface GoodsDao {
	int addGoods(Goods goods);
	int removeGoods(Goods goods);
	int orderGoods(Goods goods);
	int updateGoods(Goods goods);
}
