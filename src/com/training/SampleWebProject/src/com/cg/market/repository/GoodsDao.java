package com.cg.market.repository;

import com.cg.market.model.Goods;

/**
 * @author aishwarya
 *
 */
public interface GoodsDao {

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
