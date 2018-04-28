package com.cg.supermarket.repository;

import java.util.HashMap;
import java.util.Map;

import com.cg.supermarket.model.Goods;

/**
 * @author trainee
 *
 */
public class GoodsDaoImpl implements GoodsDao {
	
	static Map<Integer,Goods> map3 = new HashMap<>();

	@Override
	public int addGoods(com.cg.supermarket.model.Goods goods) {
		map3.put(goods.getGoodsId(), goods);
		return 1;
	}

	@Override
	public int removeGoods(Goods goods) {
		map3.remove(goods.getGoodsId(), goods);
		return 1;
	}

	@Override
	public int orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Map<Integer, Goods> getMap() {
		// TODO Auto-generated method stub
		return map3;
	}
	

}
