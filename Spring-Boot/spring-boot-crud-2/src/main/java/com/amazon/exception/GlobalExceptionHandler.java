package com.amazon.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity handleUserNotFoundException(UserNotFoundException unf) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(unf.getMessage());
		errorResponse.setMessage("UNF-400");
		return ResponseEntity.ok(errorResponse);
	}

	@ExceptionHandler(EmailAlreadyExistException.class)
	public ResponseEntity handleUserNotFoundException(EmailAlreadyExistException eae) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(eae.getMessage());
		errorResponse.setMessage("EAE-401");
		return ResponseEntity.ok(errorResponse);
	}
}
