package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author aishwarya
 *
 */
@Entity
@Table
public class Goods {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int goodsId;
	
	@Column
	private String goodsName;
	
	@Column
	private String goodsQuantity;
	
	@Column
	private double goodsPrice;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(final int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(final String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(final String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(final double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + "]";
	}
	public Goods(final int goodsId, final String goodsName,final String goodsQuantity,final double goodsPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}




