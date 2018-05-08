package com.cg.market.repository;

import com.cg.market.model.Supplier;

/**
 * @author aishwarya
 *
 */
public interface SupplierDao {

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
