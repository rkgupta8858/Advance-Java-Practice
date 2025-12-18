package com.zepto.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepto.entity.UserDob;
import com.zepto.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	List<UserDob> findByDob(LocalDate dob);

}
