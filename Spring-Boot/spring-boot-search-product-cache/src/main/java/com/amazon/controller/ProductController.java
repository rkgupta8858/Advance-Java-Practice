package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.SpringBootSearchProductCacheApplication;
import com.amazon.entity.Product;
import com.amazon.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private final SpringBootSearchProductCacheApplication application;

	@Autowired
	ProductService productService;

	ProductController(SpringBootSearchProductCacheApplication application) {
		this.application = application;
	}

	@GetMapping("/search")
	public Product search(@RequestParam String name) {
		System.out.println("ProductController.search()..........................................");
		return productService.searchProduct(name);

	}
}