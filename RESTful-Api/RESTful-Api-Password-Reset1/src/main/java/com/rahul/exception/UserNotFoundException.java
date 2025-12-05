package com.rahul.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String _message) {
		super(_message);
	}

}
