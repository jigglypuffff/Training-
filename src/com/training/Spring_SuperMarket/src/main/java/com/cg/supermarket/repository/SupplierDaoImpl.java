package com.cg.supermarket.repository;

import java.util.HashMap;
import java.util.Map;

import com.cg.supermarket.model.Supplier;

/**
 * @author trainee
 *
 */
public class SupplierDaoImpl implements SupplierDao {

	static Map<Integer,Supplier> map2 = new HashMap<>();
	@Override
	public int addSupplier(Supplier supplier) {
		map2.put(supplier.getSupplierId(), supplier);
		return 1;
	}

	@Override
	public int removeSupplier(Supplier supplier) {
		map2.remove(supplier.getSupplierId(), supplier);

		System.out.println(map2.size());
	
		return 1;
		
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Map<Integer, Supplier> getMap() {
		// TODO Auto-generated method stub
		return map2;
	}
	

}
