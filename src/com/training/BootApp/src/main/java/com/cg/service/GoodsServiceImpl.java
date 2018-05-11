package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Goods;
import com.cg.repo.GoodsDao;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsDao goodsDao;

	@Override
	public Goods addGoods(Goods goods) {
		
		return goodsDao.save(goods);
	}

	@Override
	public List<Goods> viewGoods() {
		
		return goodsDao.findAll();
	}

	@Override
	public int deleteGoods(Goods goods) {
	
		 goodsDao.deleteById(goods.getGoodsId());
		 return 1;
	}

	@Override
	public Goods viewGoodsById(int id) {
		Object ob = goodsDao.findById(id);
		return (Goods) ob;
	}

	@Override
	public Goods updateGoods(Goods goods) {
		Goods updatedGoods = goodsDao.findById(goods.getGoodsId()).get();
		updatedGoods.setGoodsQuantity("4");
		return updatedGoods;
	}
	
	
}
