package com.cg.market.service;

import com.cg.market.model.Supplier;
import com.cg.market.repository.SupplierDao;

/**
 * @author aishwarya
 *
 */
public class SupplierServiceImpl implements SupplierService {

	
	/**
	 * 
	 */
	public SupplierDao supplierDao;
	public SupplierServiceImpl (final SupplierDao supplierDao)
	{
		this.supplierDao=supplierDao;
	}
	 

	public Supplier addSupplier(final Supplier supplier) {
		
		return supplierDao.addSupplier(supplier);
	}

	
	public Supplier removeSupplier(final Supplier supplier) {
		
		return supplierDao.removeSupplier(supplier);
	}

	
	public Supplier updateSupplier(final Supplier supplier) {
		
		return supplierDao.updateSupplier(supplier);
	}

}
