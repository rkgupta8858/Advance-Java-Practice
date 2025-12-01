package com.rahul.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.request.SearchRequest;
import com.rahul.service.ProductService;

@RestController
public class ProductSearchController {

	@Autowired
	ProductService productService;

	@GetMapping("searchProduct")
	public ResponseEntity searchProduct(@RequestBody SearchRequest searchRequest) {

		Map<String, Object> body = new HashMap<>();

		productService.findProductBySearchString(searchRequest.getSearchString());

		return ResponseEntity.ok(body);

	}
}