package com.ps.jwtdemo.service;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.dto.TransactionDTO;
import com.ps.jwtdemo.model.TransactionEntity;

public interface TransactionService {

	TransactionDTO getTransDetailsByClientId(int id) throws ResourceNotFoundException;
	int callStoredProcedure(TransactionEntity tE);
}
