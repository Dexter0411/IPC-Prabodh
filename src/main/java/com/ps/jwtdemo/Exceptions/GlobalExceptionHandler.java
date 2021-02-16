package com.ps.jwtdemo.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	//handle specific exception
	@ExceptionHandler(ResourceNotFoundException.class)
	ResponseEntity<?> HandleResourceNotFoundException(ResourceNotFoundException exception,WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails((java.util.Date) new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	//handle Global Exception
	@ExceptionHandler(Exception.class)
	ResponseEntity<?> HandleGlobalException(Exception exception,WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails((java.util.Date) new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
}
}
