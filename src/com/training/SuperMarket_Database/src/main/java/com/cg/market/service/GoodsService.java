package com.cg.market.service;

import com.cg.market.model.Goods;

public interface GoodsService {


	/**
	 * @param goods
	 * @return
	 */
	public Goods addGoods(Goods goods);
	/**
	 * @param goods
	 * @return
	 */
	public Goods removeGoods(Goods goods);
	/**
	 * @param goods
	 * @return
	 */
	public Goods updateGoods(Goods goods);
}
