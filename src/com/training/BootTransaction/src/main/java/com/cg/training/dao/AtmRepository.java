package com.cg.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.model.ATM;

public interface AtmRepository extends JpaRepository<ATM, Integer> {

	
}
