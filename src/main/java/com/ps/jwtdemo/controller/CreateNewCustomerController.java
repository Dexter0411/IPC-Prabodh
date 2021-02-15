package com.ps.jwtdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.jwtdemo.model.LoginMasterEntity;
import com.ps.jwtdemo.service.LoginMasterService;

@RestController
public class CreateNewCustomerController {
	@Autowired
	private LoginMasterService lmServ;
	
	@PostMapping(path="/addNewUser")
	public ResponseEntity<LoginMasterEntity> addNewUser(@RequestBody LoginMasterEntity register){
		lmServ.addNewUser(register);
		return new ResponseEntity<LoginMasterEntity>(register,HttpStatus.CREATED);
	}
	
}
