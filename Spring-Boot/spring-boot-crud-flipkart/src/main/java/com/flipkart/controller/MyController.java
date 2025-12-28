package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.flipkart.SpringBootCrudFlipkartApplication;
import com.flipkart.entity.UserEntity;
import com.flipkart.request.UserRequest;
import com.flipkart.service.UserService;

import jakarta.validation.Valid;

@RestController
public class MyController {

	@Autowired
	private UserService service;

	@PostMapping("/createAcc")
	public ResponseEntity createAccount(@Valid @RequestBody UserRequest request) {
		UserEntity account = service.createAccount(request);
		return ResponseEntity.ok(account);

	}

	@GetMapping("/showUsers")
	public ResponseEntity showUsers() {
		List<UserEntity> account = service.showUser();
		return ResponseEntity.ok(account);

	}

	@PutMapping("/updatePass/{id}/password")
	public ResponseEntity updatePassword(@PathVariable int id, @RequestBody UserRequest request) {
		UserEntity updatePass = service.updatePassword(id, request);
		return ResponseEntity.ok(updatePass);
	}

}
