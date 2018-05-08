package com.cg.market.service;

import com.cg.market.model.Supplier;
import com.cg.market.repository.SupplierDao;

public class SupplierServiceImpl implements SupplierService {

	
	/**
	 * 
	 */
	public SupplierDao suppDao;
	public SupplierServiceImpl (final SupplierDao suppDao)
	{
		this.suppDao=suppDao;
	}
	

	public Supplier addSupplier(final Supplier supplier) {
		
		return suppDao.addSupplier(supplier);
	}

	
	public Supplier removeSupplier(final Supplier supplier) {
		
		return suppDao.removeSupplier(supplier);
	}

	
	public Supplier updateSupplier(final Supplier supplier) {
		
		return suppDao.updateSupplier(supplier);
	}

}
