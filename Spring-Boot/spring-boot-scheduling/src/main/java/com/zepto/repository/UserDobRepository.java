package com.zepto.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepto.entity.UserDob;

public interface UserDobRepository extends JpaRepository<UserDob, Integer> {
	List<UserDob> findByDob(LocalDate dob);

}
