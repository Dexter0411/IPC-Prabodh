package com.ps.jwtdemo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ClientMaster")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;

	private String prefix;

	private String firstName;

	private String lastName;

	private String middleName;

	private String fullName;

	private String gender;

	private LocalDate dob;

	private String pan;

	private long aadhar;

	private String email;

	private long mobileNo;

	private long landlineNo;

	private String correspondenceAddress;

	private String permanentAddress;

	private double roiPercentage;

	private String type;

	private String dispatchMode;

	private String firstJointHolderName;

	private String firstJointholderPan;

	private LocalDate firstJointholderDob;

	private long firstJointHolderAadhar;

	private String secondJointHolderName;

	private String secondJointholderPan;

	private LocalDate secondJointholderDob;

	private long secondJointHolderAadhar;

	private String category;

	private String cheque;

	private String neft;

	private String bankName;

	private String micrCode;

	private String ifscCode;

	private String branch;

	private long accNo;

	private String nameAsBankAcc;

	private String firstNomineeName;

	private String firstNomineePan;

	private String firstNomineeAadhar;

	private double firstNomineePercentage;

	private LocalDate firstNomineeDob;

	private String secondNomineeName;

	private String secondNomineePan;

	private String secondNomineeAadhar;

	private double secondNomineePercentage;

	private LocalDate secondNomineeDob;

	private String groupHeadA;

	private String familyHead;

	private String referencePersonName;

	private String remark;

	private String specialInstructions;

	private LocalDate registeredDate;

	@LastModifiedDate
	private LocalDateTime lastModificationDate;

	private String iCreator;

	private String status;

	private boolean isActive;
}
