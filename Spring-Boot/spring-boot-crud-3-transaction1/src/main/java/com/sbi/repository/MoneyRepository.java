package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.entity.AccountEntity;

@Repository
public interface MoneyRepository extends JpaRepository<AccountEntity, Integer> {

	public AccountEntity findByAccountNo(String accountNo);
}
