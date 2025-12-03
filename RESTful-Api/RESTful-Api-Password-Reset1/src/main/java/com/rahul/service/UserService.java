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

	public String resetPassoword(String email, String newPassword) {
		User user = userDao.getUserByEmail(email);

		if (user == null) {
			return "User not found";
		}

		String currentPassword = user.getPassword();

		if (currentPassword.equals(newPassword)) {
			return "New password must be different from current password!!!!";
		}

		List<PasswordHistory> lastPasswords = userDao.getLastThreePasswordsByEmail(email);

		for (PasswordHistory p : lastPasswords) {
			if (p.getOldPassword().equals(newPassword)) {
				return "New password cannot match last 3 old passwords!!!";
			}
		}

		PasswordHistory history = new PasswordHistory();
		history.setEmail(email);
		history.setOldPassword(user.getPassword());
		userDao.saveOldPassword(history);

		user.setPassword(newPassword);
		userDao.updatePassword(user);

		return "Password updated successfully";

	}
}
