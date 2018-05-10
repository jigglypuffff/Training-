package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {



}
