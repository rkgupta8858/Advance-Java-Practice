package com.amazon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	public boolean existsByUserEmail(String userEmail);
}
