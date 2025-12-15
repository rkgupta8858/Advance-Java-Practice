package com.amazon.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity handleOrderNotFoundException(OrderNotFoundException onf) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("ONF-401");
		errorResponse.setErrorMessage(onf.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
}
