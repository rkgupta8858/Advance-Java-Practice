package com.zepto.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zepto.entity.UserEntity;
import com.zepto.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	@Scheduled(cron = "20 32 17 * * ?") 
    public void sendWishes() {
		
		LocalDate date = LocalDate.now();

        List<UserEntity> users = repository.findByDob(date);
//        List<UserEntity> users = repository.findTodaysBirthdays();

        if (users.isEmpty()) {
            System.out.println("No birthdays today");
            return;
        }

        for (UserEntity u : users) {
            System.out.println("Happy Birthday : " + u.getName());
        }
    }
}
