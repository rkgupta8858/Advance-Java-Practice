package com.zepto.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zepto.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	List<UserEntity> findByDob(LocalDate dob);

//	@Query("""
//			SELECT u FROM UserEntity u
//			WHERE DAY(u.dob) = DAY(CURRENT_DATE)
//			  AND MONTH(u.dob) = MONTH(CURRENT_DATE)
//			""")
//	List<UserEntity> findTodaysBirthdays();
}
