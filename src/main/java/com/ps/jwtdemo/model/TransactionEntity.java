package com.ps.jwtdemo.model;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="tbl_transactionmaster")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NamedStoredProcedureQuery(name="triggerStoredProcedure",procedureName = "Usp_Ins_TransactionMaster",parameters = {
		@StoredProcedureParameter(mode=ParameterMode.IN,name="clientId",type=Integer.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="prefix",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="accHolderName",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="jointHolderName1",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="jointHolderName2",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="formType",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="category",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="financialYear",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="bankName",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="checkNumber",type=BigInteger.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="transactionDate",type=LocalDate.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="deploymentDate",type=LocalDate.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="openingBalance",type=Double.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="financialQuarter",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="amountDeposit",type=Double.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="amountWithdraw",type=Double.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="iCreator",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.IN,name="currentStatus",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.OUT,name="Result",type=String.class)	
})
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
	@Column(name="formType")
	String formType;
	@Column(name="Category")
	String category;
	@Column(name="Roi")
	Double roi;
	@Column(name="FinancialYear")
	String financialYear;
	@Column(name="FinancialQuarter")
	String financialQuarter;
	@Column(name="BankName")
	String bankName;
	@Column(name="CheckNumber")
	BigInteger checkNumber;
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
	String i_Creator;
	@Column(name="currentStatus")
	String currentStatus;

}
