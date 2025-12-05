package com.rahul.exception;

public class SamePasswordException extends RuntimeException{
	public SamePasswordException(String message) {
		super(message);
	}
}
