package com.cg.supermarket.repository;

import com.cg.supermarket.model.Supplier;

/**
 * @author trainee
 *
 */
public interface SupplierDao {

	int addSupplier(Supplier supplier);
	int removeSupplier(Supplier supplier);
	int updateSupplier(Supplier supplier);
}
