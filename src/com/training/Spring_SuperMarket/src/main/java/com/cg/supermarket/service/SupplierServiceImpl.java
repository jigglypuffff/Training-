package com.cg.supermarket.service;

import com.cg.supermarket.model.Supplier;
import com.cg.supermarket.repository.SupplierDao;

/**
 * @author trainee
 *
 */
public class SupplierServiceImpl implements SupplierService {

	SupplierDao sDao;
	@Override
	public int addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return sDao.addSupplier(supplier);
	}

	@Override
	public int removeSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return sDao.removeSupplier(supplier);
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return sDao.updateSupplier(supplier);
	}
	
	SupplierServiceImpl(SupplierDao sDao)
	{
		this.sDao=sDao;
	}

}
