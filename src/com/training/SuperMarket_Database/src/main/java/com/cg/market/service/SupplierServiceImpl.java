package com.cg.market.service;

import com.cg.market.model.Supplier;
import com.cg.market.repository.SupplierDao;

public class SupplierServiceImpl implements SupplierService {

	
	SupplierDao suppDao;
	SupplierServiceImpl (SupplierDao suppDao)
	{
		this.suppDao=suppDao;
	}
	

	public Supplier addSupplier(Supplier supplier) {
		
		return suppDao.addSupplier(supplier);
	}

	
	public Supplier removeSupplier(Supplier supplier) {
		
		return suppDao.removeSupplier(supplier);
	}

	
	public Supplier updateSupplier(Supplier supplier) {
		
		return suppDao.updateSupplier(supplier);
	}

}
