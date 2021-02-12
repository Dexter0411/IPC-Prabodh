package com.ps.jwtdemo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblClientmaster")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ClientID;

	private String Prefix;

	private String FirstName;

	private String LastName;

	private String MiddleName;

	private String FullName;

	private String Gender;

	private LocalDate DOB;

	private String PAN;

	private long Aadhar;

	private String Email;

	private long MobileNo;

	private long LandlineNo;

	private String CorrespondenceAddress;

	private String PermanentAddress;

	private double ROI_Percentage;

	private String type;

	private String DispatchMode;

	private String JointHolderName_1;

	private String Jointhold1_PAN;

	private long Jointhold1_Aadhar;

	private String JointHolderName_2;

	private String Jointhold2_PAN;

	private long Jointhold2_Aadhar;

	private String Category;

	private String CHEQUE_NEFT;

	private String Bank_Name;

	private String MICR_Code;

	private String IFSC_Code;

	private String Branch;

	private long AccNo;

	private String Name_As_BankAcc;

	private String NomineeName_1;

	private String Nominee1_PAN;

	private String Nominee1_Aadhar;

	private double Nominee1_Percentage;

	private String NomineeName_2;

	private String Nominee2_PAN;

	private String Nominee2_Aadhar;

	private double Nominee2_Percentage;

	private String GroupHeadA;

	private String FamilyHead;

	private String ReferencePersonName;

	private String Remark;

	private String Special_Instructions;

	private LocalDate RegisteredDate;

	private LocalDateTime Last_Modification_Date;

	private String iCreator;

	private String Status;

}
