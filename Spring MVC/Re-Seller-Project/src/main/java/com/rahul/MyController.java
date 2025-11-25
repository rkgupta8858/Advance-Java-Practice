package com.rahul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.model.User;

@Controller
public class MyController {

	@RequestMapping("/create")
	public String createAccount(Model model) {
		model.addAttribute("user", new User());
		return "createPage";
	}

	@PostMapping("/createAccount")
	public String createAccountSuccess(@ModelAttribute("user") User user, Model model) {
		
		UserData.savedUser = user;
		
		model.addAttribute("msg", "Account Created Successfully..");
		return "createSuccess";
	}

	@RequestMapping("/login")
	public String loginAccount(Model model) {
		model.addAttribute("loginUser", new User());
		return "loginPage";
	}

	@PostMapping("/reSellerDash")
	public String reSellerDash1(@ModelAttribute("loginUser") User loginUser, Model model) {

	    if (UserData.savedUser == null) {
	        model.addAttribute("error", "Please create an account first!");
	        return "loginPage";
	    }

	    if (loginUser.getEmail().equals(UserData.savedUser.getEmail())
	            && loginUser.getPassword().equals(UserData.savedUser.getPassword())) {
	        return "reSellerDashBoard";
	    }

	    model.addAttribute("error", "Invalid Email or Password!");
	    return "loginPage"; 
	}

	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addProductPage";
	}

	@RequestMapping("/updateProduct")
	public String updateProduct() {
		return "updateProductPage";
	}

	@RequestMapping("/deleteProduct")
	public String deleteProduct() {
		return "deleteProductPage";
	}

	@RequestMapping("/viewProducts")
	public String viewProduct() {
		return "viewProductPage";
	}
}
