package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.UserDao;
import com.rahul.entity.PasswordHistory;
import com.rahul.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public String resetPassoword(int useId, String newPassword) {
			User user = userDao.getUserById(useId);
			
			if (user==null) {
				return "User not found";
			}
			
			List<PasswordHistory> lastPasswords = userDao.getLastThreePasswords(useId);
			
			for (PasswordHistory p : lastPasswords) {
				if (p.getOldPassword().equals(newPassword)) {
					return "New password can not be same as last three password !!";
				}
			}
			
			PasswordHistory history = new PasswordHistory();
			history.setUserId(useId);
			history.setOldPassword(user.getPassword());
			userDao.saveOldPassword(history);
			
			
			user.setPassword(newPassword);
			userDao.updatePassword(user);
			
	        return "Password updated successfully";

	}
}
