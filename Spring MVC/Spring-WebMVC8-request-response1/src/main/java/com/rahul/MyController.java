package com.rahul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.model.User;

@Controller
public class MyController {

	@RequestMapping("/create")
	public String createPageMethod() {
		return "createPage";
	}

	@GetMapping("createProfilePage")
	public String createUserProfile(User user, Model model) {
		System.out.println("First Name : " + user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		System.out.println("Email : " + user.getEmail());
		System.out.println("Phone : " + user.getPhone());

		String email = user.getEmail();
		String phone = user.getPhone();

		String userId = generateUserId(email, phone);
		model.addAttribute("userId", userId);

		System.out.println("Generated UserId : " + userId);

		return "profile-success";
	}

	public static String generateUserId(String email, String phone) {
		String userName = email.split("@")[0];

		String first5 = userName.length() >= 5 ? userName.substring(0, 5) : userName;
		String last4 = phone.substring(phone.length() - 4);
		return first5 + last4;

	}
}
