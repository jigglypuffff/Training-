package com.cg.market.service;

import com.cg.market.model.Supplier;

public interface SupplierService {

	/**
	 * @param supplier
	 * @return
	 */
	public Supplier addSupplier(Supplier supplier);
	/**
	 * @param supplier
	 * @return
	 */
	public Supplier removeSupplier(Supplier supplier);
	/**
	 * @param supplier
	 * @return
	 */
	public Supplier updateSupplier(Supplier supplier);
}
