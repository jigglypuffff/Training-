package com.cg.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
