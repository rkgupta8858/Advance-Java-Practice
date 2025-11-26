package com.rahul;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.model.Product;
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
	public String addProduct(Model model) {
		model.addAttribute("prod", new Product());
		return "addProductPage";
	}

	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("prod") Product product, Model model) {
		product.setId(ProductData.currentId++);
		ProductData.products.add(product);
		model.addAttribute("msg", "Product Added Successfully!");
		return "addProductSuccess";
	}

	@PostMapping("/editProduct")
	public String editProduct(@ModelAttribute Product prod, Model model) {

	    int id = prod.getId(); // ID received from hidden form

	    for (Product p : ProductData.products) {
	        if (p.getId() == id) {
	            model.addAttribute("prod", p);
	            return "updateProductPage";
	        }
	    }

	    model.addAttribute("msg", "Product Not Found!");
	    return "viewProductPage";
	}

	@PostMapping("/updateProduct")
	public String updateProduct(@ModelAttribute("prod") Product updatedProduct, Model model) {

	    for (Product p : ProductData.products) {
	        if (p.getId() == updatedProduct.getId()) {

	            p.setName(updatedProduct.getName());
	            p.setCategory(updatedProduct.getCategory());
	            p.setPrice(updatedProduct.getPrice());
	            p.setQuantity(updatedProduct.getQuantity());
	        }
	    }

	    model.addAttribute("msg", "Product Updated Successfully!");
	    return "updateSuccess";
	}


	@PostMapping("/deleteProduct")
	public String deleteProduct(@ModelAttribute Product prod, Model model) {

	    int id = prod.getId();

	    Product toRemove = null;

	    for (Product p : ProductData.products) {
	        if (p.getId() == id) {
	            toRemove = p;
	            break;
	        }
	    }

	    if (toRemove != null) {
	        ProductData.products.remove(toRemove);
	        model.addAttribute("msg", "Product Deleted Successfully!");
	        return "deleteSuccess";
	    }

	    model.addAttribute("msg", "Product Not Found!");
	    return "viewProducts";
	}


	@RequestMapping("/viewProducts")
	public String viewProducts(Model model) {
		model.addAttribute("productList", ProductData.products);
		return "viewProductPage";
	}

	@RequestMapping("/reSellerDashBoardContr")
	public String reSellerDash2() {
		return "reSellerDashBoard";
	}
}
