package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.UserEntity;
import com.amazon.request.UserRequest;
import com.amazon.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/addUser")
	public ResponseEntity addUserController(@RequestBody UserRequest request) {
		UserEntity userService = service.addUserService(request);
		return ResponseEntity.ok(userService);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity updateUserController(@RequestBody UserRequest request) {
		UserEntity userService = service.updateUserService(request);
		return ResponseEntity.ok(userService);
	}
	
	
}
