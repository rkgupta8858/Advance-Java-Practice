package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.UserEntity;
import com.amazon.exception.EmailAlreadyExistException;
import com.amazon.exception.UserNotFoundException;
import com.amazon.repositories.UserRepository;
import com.amazon.request.UserRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserEntity addUserService(UserRequest request) {

		if (repository.existsByUserEmail(request.getUserEmail())) {
			throw new EmailAlreadyExistException("Email Already Exist!! --> Please use Another Email...");
		}

		UserEntity entity = new UserEntity();

		entity.setUserName(request.getUserName());
		entity.setUserEmail(request.getUserEmail());
		entity.setUserPass(request.getUserPass());
		entity.setUserPhone(request.getUserPhone());
		entity.setUserAddress(request.getUserAddress());

		return repository.save(entity);
	}

	public UserEntity updateUserService(UserRequest request) {
		UserEntity entity = repository.findById(request.getUserId())
				.orElseThrow(() -> new UserNotFoundException("User Not Found !!!"));

		entity.setUserId(request.getUserId());
		entity.setUserName(request.getUserName());
		entity.setUserPass(request.getUserPass());
		entity.setUserPhone(request.getUserPhone());
		entity.setUserAddress(request.getUserAddress());

		return repository.save(entity);
	}
}
