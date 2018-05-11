package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Goods;

public interface GoodsDao extends JpaRepository<Goods, Integer>{

}
