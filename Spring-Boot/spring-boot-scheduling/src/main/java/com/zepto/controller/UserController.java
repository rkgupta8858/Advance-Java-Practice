package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.entity.UserEntity;
import com.zepto.request.UserRequest;
import com.zepto.seevice.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/createAccount")
	public ResponseEntity createAccount(@RequestBody UserRequest request) {

		UserEntity account = service.createAccount(request);

		return ResponseEntity.ok(account);
	}
}
