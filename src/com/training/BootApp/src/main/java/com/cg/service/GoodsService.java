package com.cg.service;

import java.util.List;

import com.cg.model.Goods;

public interface GoodsService {

	
	public Goods addGoods(Goods goods);
	
	public List<Goods> viewGoods();
	
	public Goods viewGoodsById(int id);
	
	public int deleteGoods(Goods goods);
	
	public Goods updateGoods(Goods goods);
	
	
}
