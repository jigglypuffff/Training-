package com.cg.supermarket.service;

import com.cg.supermarket.model.Goods;

/**
 * @author trainee
 *
 */
public interface GoodsService {

	int addGoods(Goods goods);
	int removeGoods(Goods goods);
	int orderGoods(Goods goods);
	int updateGoods(Goods goods);
	
}
