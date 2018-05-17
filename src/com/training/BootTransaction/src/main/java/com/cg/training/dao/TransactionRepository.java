package com.cg.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
