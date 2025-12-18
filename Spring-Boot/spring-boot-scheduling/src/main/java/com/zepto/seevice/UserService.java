package com.zepto.seevice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zepto.entity.UserDob;
import com.zepto.entity.UserEntity;
import com.zepto.repository.UserDobRepository;
import com.zepto.repository.UserRepository;
import com.zepto.request.UserRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserDobRepository repository2;

	public UserEntity createAccount(UserRequest request) {
		UserEntity entity = new UserEntity();
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		entity.setDob(request.getDob());
		entity.setPhone(request.getPhone());

		UserEntity save = repository.save(entity);

		return save;
	}

	public void sendWishes() {
		LocalDate date = LocalDate.now();
		List<UserDob> users = repository2.findByDob(date);

		if (users == null || users.isEmpty()) {
			System.out.println("No birthdays today");
			return;
		}

		users.forEach(user -> System.out.println("Happy birthday : " + user.getName()));
	}

	@Scheduled(cron = "0 30 16 * * ?")
	public void sendBirthdayWishes() {
		sendWishes();
	}

}
