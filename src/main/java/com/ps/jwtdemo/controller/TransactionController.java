package com.ps.jwtdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.dao.MasterTransactionDao;
import com.ps.jwtdemo.dto.TransactionDTO;
import com.ps.jwtdemo.model.TransactionEntity;
import com.ps.jwtdemo.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private MasterTransactionDao test;
	@Autowired
	private TransactionService transService;
	@GetMapping(path="/getTransactionDetailsByClientId/{id}")
	public ResponseEntity<TransactionDTO> getTransactionDetails(@PathVariable int id) throws ResourceNotFoundException{
		return new ResponseEntity<TransactionDTO>(transService.getTransDetailsByClientId(id),HttpStatus.OK);
		
	}
	
	@PostMapping(path="/callStoredProcedure")
	public ResponseEntity<TransactionEntity> getTransactionDetails(@RequestBody TransactionEntity tE){
		try {
		String success = transService.callStoredProcedure(tE);
		if(success.equals("True")) {
			return new ResponseEntity<TransactionEntity>(tE,HttpStatus.OK);
		}else {
			return new ResponseEntity<TransactionEntity>(tE,HttpStatus.NOT_IMPLEMENTED);
		}
		}catch(Exception e) {
			return new ResponseEntity<TransactionEntity>(tE,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
