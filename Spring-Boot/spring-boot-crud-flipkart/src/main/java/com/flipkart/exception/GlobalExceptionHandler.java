package com.flipkart.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PasswordExcption.class)
	public ResponseEntity handlePasswordException(PasswordExcption pe) {

		ErrorMessage er = new ErrorMessage();
		er.setErrCode("PE-404");
		er.setErrMsg(pe.getMessage());

		return ResponseEntity.ok(er);
	}

	@ExceptionHandler(UpdatePasswordException.class)
	public ResponseEntity handleUpdatePasswordException(UpdatePasswordException pe) {

		ErrorMessage er = new ErrorMessage();
		er.setErrCode("UPE-405");
		er.setErrMsg(pe.getMessage());

		return ResponseEntity.ok(er);
	}

}
