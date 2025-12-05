package com.rahul.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rahul.entity.ExceptionResponse;

@RestControllerAdvice
public class HandlerException {

	ExceptionResponse exceptionResponse;

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ExceptionResponse> userNotFoundException(UserNotFoundException ex) {
		exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode("UNF-505");
		exceptionResponse.setMessage(ex.getMessage());

		return ResponseEntity.ok(exceptionResponse);
	}

	@ExceptionHandler(SamePasswordException.class)
	public ResponseEntity<ExceptionResponse> samePassword(SamePasswordException spe) {
		exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode("SPE-506");
		exceptionResponse.setMessage(spe.getMessage());
		return ResponseEntity.ok(exceptionResponse);
	}
}
