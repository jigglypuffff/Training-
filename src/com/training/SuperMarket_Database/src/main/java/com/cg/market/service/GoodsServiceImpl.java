package com.cg.market.service;

import com.cg.market.model.Goods;
import com.cg.market.repository.GoodsDao;

public class GoodsServiceImpl implements GoodsService {

GoodsDao goodsDao;

GoodsServiceImpl(GoodsDao goodsDao)
{
	this.goodsDao=goodsDao;
}
	public Goods addGoods(Goods goods) {
	
		return goodsDao.addGoods(goods);
	}

	
	public Goods removeGoods(Goods goods) {
		
		return goodsDao.removeGoods(goods);
	}

	
	public Goods updateGoods(Goods goods) {
		
		return goodsDao.updateGoods(goods);
	}

}
