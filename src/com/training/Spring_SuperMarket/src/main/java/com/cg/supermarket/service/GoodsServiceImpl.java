package com.cg.supermarket.service;

import com.cg.supermarket.model.Goods;
import com.cg.supermarket.repository.GoodsDao;

/**
 * @author trainee
 *
 */
public class GoodsServiceImpl implements GoodsService {
	
	GoodsDao goodsDao;

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.addGoods(goods);
	}

	@Override
	public int removeGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.removeGoods(goods);
	}

	@Override
	public int orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.orderGoods(goods);
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.updateGoods(goods);
	}
	
	GoodsServiceImpl(GoodsDao goodsDao)
	{
		this.goodsDao= goodsDao;
	}

}
