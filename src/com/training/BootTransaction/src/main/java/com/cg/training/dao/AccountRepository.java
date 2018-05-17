package com.cg.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
