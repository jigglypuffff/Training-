package com.cg.market.service;

import com.cg.market.model.Goods;
import com.cg.market.repository.GoodsDao;

/**
 * @author aishwarya
 *
 */
public class GoodsServiceImpl implements GoodsService {

	/**
	 * 
	 */
	public GoodsDao goodsDao;

	/**
	 * @param goodsDao
	 */
	public GoodsServiceImpl(final GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	public Goods addGoods(final Goods goods) {

		return goodsDao.addGoods(goods);
	}

	public Goods removeGoods(final Goods goods) {

		return goodsDao.removeGoods(goods);
	}

	public Goods updateGoods(final Goods goods) {

		return goodsDao.updateGoods(goods);
	}

}
