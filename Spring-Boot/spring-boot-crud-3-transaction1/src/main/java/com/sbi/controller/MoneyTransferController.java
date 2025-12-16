package com.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.entity.AccountEntity;
import com.sbi.request.AccountRequest;
import com.sbi.request.TransferRequest;
import com.sbi.service.MoneyService;

@RestController
public class MoneyTransferController {

	@Autowired
	MoneyService moneyService;

	@PostMapping("/createAccount")
	public ResponseEntity createAccount(@RequestBody AccountRequest accountRequest) {

		AccountEntity account = moneyService.createAccount(accountRequest);

		return ResponseEntity.ok(account);
	}

	@PutMapping("/update")
	public ResponseEntity updateAccount(@RequestBody AccountRequest accountRequest) {

		AccountEntity response = moneyService.update(accountRequest);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/moneyTransfer")
	public String moneyTransfer(@RequestBody TransferRequest transferRequest) {

		String response = moneyService.moneyTransfer(transferRequest);
		return response;
	}

}
