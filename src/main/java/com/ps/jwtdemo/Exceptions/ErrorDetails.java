package com.ps.jwtdemo.Exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor

public class ErrorDetails {
	
	private Date timestamp;
	private String msg;
	private String details;
	public ErrorDetails(Date timestamp, String msg, String details) {
		super();
		this.timestamp = timestamp;
		this.msg = msg;
		this.details = details;
	}
	
	

}
