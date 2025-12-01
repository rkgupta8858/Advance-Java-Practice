package com.rahul.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rahul.response.ErrorResponse;

@RestControllerAdvice
public class ZeptoExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(ProductNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ZEC-001");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ZEC-002");
		return ResponseEntity.ok(errorResponse);
	}
	
}
