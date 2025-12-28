package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.UserEntity;
import com.flipkart.exception.PasswordExcption;
import com.flipkart.exception.UpdatePasswordException;
import com.flipkart.repository.UserRepository;
import com.flipkart.request.UserRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserEntity createAccount(UserRequest request) {

		if (request.getPassword() == null | request.getPassword().trim().isEmpty()) {
			throw new PasswordExcption("Password can not be Empty !!");
		}
		if (!request.getPassword().matches("^(?=.*[A-Z])(?=.*[@]).{6,}$")) {
			throw new PasswordExcption(
					"Password must contain at least 6 characters, one uppercase letter, and one '@' symbol");
		}

		UserEntity entity = new UserEntity();
		entity.setUserName(request.getUserName());
		entity.setEmail(request.getEmail());
		entity.setPhoneNo(request.getPhoneNo());
		entity.setPassword(request.getPassword());
		System.out.println("PASSWORD=[" + request.getPassword() + "]");

		repository.save(entity);
		return entity;
	}

	public List<UserEntity> showUser() {
		List<UserEntity> all = repository.findAll();
		return all;
	}

	public UserEntity updatePassword(int id, UserRequest request) {
		UserEntity entity = repository.findById(id).orElseThrow(() -> new UpdatePasswordException("User Not Found !!"));

		if (request.getPassword() == null || request.getPassword().isBlank()) {
			throw new UpdatePasswordException("Password can not be Blank");
		}
		if (entity.getPassword().equals(request.getPassword())) {
			throw new UpdatePasswordException("New password cannot be same as old password !!");
		}

		entity.setPassword(request.getPassword());

		return repository.save(entity);
	}

}
