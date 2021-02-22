package com.ps.jwtdemo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	
	int clientId;
	String prefix;
	String fullName;
	String jHolder1;
	String jHolder2;
	String Category;
	String type;
	double roi;
	String financialYr;
	String quarter;
	double openingBalance;
	LocalDate receiptDate;
	LocalDate deploymentDate;

}
