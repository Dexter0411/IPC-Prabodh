package com.ps.jwtdemo.dao;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.ps.jwtdemo.model.TransactionEntity;;

public interface MasterTransactionDao extends JpaRepository<TransactionEntity, Integer> {

	@Query(value = "select * from tbl_transactionmaster tm where tm.TransactionID =(select max(TransactionID) from tbl_transactionmaster tm1 where tm1.ClientID=?1)", nativeQuery = true)
	TransactionEntity findLatestTransactionByClientId(int id);

//	@Query(value = "USE [FD_Proj];\r\n"
//			+ "EXEC [dbo].[Usp_Ins_TransactionMaster] 1,'Mr','Komal','Nirbhay','Narkhede','Nirbhay','Nirbhay','Nirbhay','Nirbhay',5345345,'2021-02-22','2021-02-22',324324,'Q2',12000,1000,'Nirbhay','Submitted'\r\n"
//			, nativeQuery = true)
//	String ExecuteStoredProcedure(@Param("clientId") int clientId, @Param("prefix") String prefix,
//			@Param("accHolderName") String accHolderName, @Param("jointHolderName1") String jointHolderName1,
//			@Param("jointHolderName2") String jointHolderName2, @Param("type") String type,
//			@Param("category") String category, @Param("financialYear") String financialYear,
//			@Param("bankName") String bankName, @Param("checkNumber") Long long1,
//			@Param("transactionDate") LocalDate localDate, @Param("deploymentDate") LocalDate localDate2,
//			@Param("openingBalance") Double openingBalance, @Param("financialQuarter") String fQuarter,
//			@Param("amountDeposit") Double amountDeposit, @Param("amountWithdraw") Double double1,
//			@Param("iCreator") String iCreator, @Param("status") String status);
	
	@Procedure(name="triggerStoredProcedure")
	@Transactional
	String ExecuteStoredProcedure(@Param("clientId") int clientId, @Param("prefix") String prefix,
			@Param("accHolderName") String accHolderName, @Param("jointHolderName1") String jointHolderName1,
			@Param("jointHolderName2") String jointHolderName2, @Param("formType") String type,
			@Param("category") String category, @Param("financialYear") String financialYear,
			@Param("bankName") String bankName, @Param("checkNumber") BigInteger bigInteger,
			@Param("transactionDate") LocalDate localDate, @Param("deploymentDate") LocalDate localDate2,
			@Param("openingBalance") Double openingBalance, @Param("financialQuarter") String fQuarter,
			@Param("amountDeposit") Double amountDeposit, @Param("amountWithdraw") Double double1,
			@Param("iCreator") String iCreator, @Param("currentStatus") String status);

}
