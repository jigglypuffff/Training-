package com.cg.market.repository;

import com.cg.market.model.Goods;

public interface GoodsDao {

	public Goods addGoods(Goods goods);
	public Goods removeGoods(Goods goods);
	public Goods updateGoods(Goods goods);
	
}
