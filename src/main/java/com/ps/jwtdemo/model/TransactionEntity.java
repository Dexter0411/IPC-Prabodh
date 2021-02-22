package com.ps.jwtdemo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_transactionmaster")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TransactionID")
	Integer transactionId;
	@Column(name="ClientID")
	Integer clientId;
	@Column(name="Prefix")
	String prefix;
	@Column(name="AccholderName")
	String accHolderName;
	@Column(name="JointholderName1")
	String jointHolderName1;
	@Column(name="JointholderName2")
	String jointHolderName2;
	@Column(name="type")
	String type;
	@Column(name="Category")
	String Category;
	@Column(name="Roi")
	Double roi;
	@Column(name="FinancialYear")
	String financialYear;
	@Column(name="FinancialQuarter")
	String financialQuarter;
	@Column(name="BankName")
	String bankName;
	@Column(name="CheckNumber")
	Long checkNumber;
	@Column(name="TransactionDate")
	LocalDate transactionDate;
	@Column(name="DeploymentDate")
	LocalDate deploymentDate;
	@Column(name="OpeningBalance")
	Double openingBalance;
	@Column(name="AmountDeposit")
	Double depositAmount;
	@Column(name="AmountWithdraw")
	Double amountWithdraw;
	@Column(name="ClosingBalance")
	Double closingBalance;
	@Column(name="Interest")
	Double interest;
	@Column(name="NetInterest")
	Double netInterest;
	@Column(name="TotalAmount")
	Double totalAmount;
	@Column(name="TransStatus")
	String tranStatus;
	@Column(name="iCreator")
	String iCreator;
	@Column(name="Status")
	String status;

}
