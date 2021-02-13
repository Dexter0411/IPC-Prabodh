package com.ps.jwtdemo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PrefixIdNotFoundException extends Exception {
	
	public PrefixIdNotFoundException() {
	super();
	}

}
