package com.cg.supermarket.service;

import com.cg.supermarket.model.Supplier;

/**
 * @author trainee
 *
 */
public interface SupplierService {


	int addSupplier(Supplier supplier);
	int removeSupplier(Supplier supplier);
	int updateSupplier(Supplier supplier);
}

