package com.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.amazon.SpringBootCrud2Application;
import com.amazon.entity.UserEntity;
import com.amazon.request.UserRequest;
import com.amazon.service.UserService;

@RestController
public class UserController {

	private final SpringBootCrud2Application springBootCrud2Application;

	@Autowired
	private UserService service;

	UserController(SpringBootCrud2Application springBootCrud2Application) {
		this.springBootCrud2Application = springBootCrud2Application;
	}

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

	@DeleteMapping("/deleteUser")
	public ResponseEntity deleteUserController(@RequestBody UserRequest request) {
		service.deleteUserService(request);
		return ResponseEntity.ok("Employee Deleted Successfully....");
	}

	@GetMapping("/showAllUser")
	public ResponseEntity showAllUser() {
		List<UserEntity> showAllUser = service.showAllUser();
		return ResponseEntity.ok(showAllUser);
	}

}
