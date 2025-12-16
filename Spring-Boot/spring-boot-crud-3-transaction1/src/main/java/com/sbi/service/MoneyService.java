package com.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.entity.AccountEntity;
import com.sbi.repository.MoneyRepository;
import com.sbi.request.AccountRequest;
import com.sbi.request.TransferRequest;

import jakarta.transaction.Transactional;

@Service
public class MoneyService {

	@Autowired
	MoneyRepository moneyRepository;

	public AccountEntity createAccount(AccountRequest accountRequest) {

		AccountEntity accountEntity = new AccountEntity();

		accountEntity.setAccountNo(accountRequest.getAccountNo());
		accountEntity.setBalance(accountRequest.getBalance());
		accountEntity.setPassword(accountRequest.getPassword());
		accountEntity.setStatus(accountRequest.getStatus());

		moneyRepository.save(accountEntity);
		return accountEntity;
	}

	@Transactional
	public String moneyTransfer(TransferRequest transferRequest) {
		int moneyToBeTransfer = transferRequest.getAmount();
		String fromAccountNo = transferRequest.getFromAccount();

		AccountEntity fromAccount = moneyRepository.findByAccountNo(fromAccountNo);
		fromAccount.setBalance(fromAccount.getBalance() - moneyToBeTransfer);
		moneyRepository.save(fromAccount);
//		
//		String s1 = null;
//		s1.length();

		String toAccountNo = transferRequest.getToAccount();
		AccountEntity toAccount = moneyRepository.findByAccountNo(toAccountNo);
		toAccount.setBalance(toAccount.getBalance() + moneyToBeTransfer);

		moneyRepository.save(toAccount);

		return "Fund has been transferred successfully...";
	}

	public AccountEntity update(AccountRequest accountRequest) {
		AccountEntity accountEntity = moneyRepository.findByAccountNo(accountRequest.getAccountNo());
		accountEntity.setPassword(accountRequest.getPassword());
		moneyRepository.save(accountEntity);
		return accountEntity;
	}
}
