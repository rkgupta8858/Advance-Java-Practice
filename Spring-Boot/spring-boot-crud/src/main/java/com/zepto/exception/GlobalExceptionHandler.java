package com.zepto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity handlerEmployeeNotFound(EmployeeNotFoundException enf) {
		ErrorResponse errorResponse = new ErrorResponse("Employee Not Found", enf.getMessage());

		return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
	}

}
