package com.cg.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
