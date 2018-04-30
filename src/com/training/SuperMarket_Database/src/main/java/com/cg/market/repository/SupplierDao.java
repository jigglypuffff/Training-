package com.cg.market.repository;

import com.cg.market.model.Supplier;

public interface SupplierDao {

	public Supplier addSupplier(Supplier supplier);
	public Supplier removeSupplier(Supplier supplier);
	public Supplier updateSupplier(Supplier supplier);
}
