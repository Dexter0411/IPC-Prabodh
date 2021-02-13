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

	public int getClientID() {
		return ClientID;
	}

	public void setClientID(int clientID) {
		ClientID = clientID;
	}

	public String getPrefix() {
		return Prefix;
	}

	public void setPrefix(String prefix) {
		Prefix = prefix;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public long getAadhar() {
		return Aadhar;
	}

	public void setAadhar(long aadhar) {
		Aadhar = aadhar;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public long getLandlineNo() {
		return LandlineNo;
	}

	public void setLandlineNo(long landlineNo) {
		LandlineNo = landlineNo;
	}

	public String getCorrespondenceAddress() {
		return CorrespondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		CorrespondenceAddress = correspondenceAddress;
	}

	public String getPermanentAddress() {
		return PermanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}

	public double getROI_Percentage() {
		return ROI_Percentage;
	}

	public void setROI_Percentage(double rOI_Percentage) {
		ROI_Percentage = rOI_Percentage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDispatchMode() {
		return DispatchMode;
	}

	public void setDispatchMode(String dispatchMode) {
		DispatchMode = dispatchMode;
	}

	public String getJointHolderName_1() {
		return JointHolderName_1;
	}

	public void setJointHolderName_1(String jointHolderName_1) {
		JointHolderName_1 = jointHolderName_1;
	}

	public String getJointhold1_PAN() {
		return Jointhold1_PAN;
	}

	public void setJointhold1_PAN(String jointhold1_PAN) {
		Jointhold1_PAN = jointhold1_PAN;
	}

	public long getJointhold1_Aadhar() {
		return Jointhold1_Aadhar;
	}

	public void setJointhold1_Aadhar(long jointhold1_Aadhar) {
		Jointhold1_Aadhar = jointhold1_Aadhar;
	}

	public String getJointHolderName_2() {
		return JointHolderName_2;
	}

	public void setJointHolderName_2(String jointHolderName_2) {
		JointHolderName_2 = jointHolderName_2;
	}

	public String getJointhold2_PAN() {
		return Jointhold2_PAN;
	}

	public void setJointhold2_PAN(String jointhold2_PAN) {
		Jointhold2_PAN = jointhold2_PAN;
	}

	public long getJointhold2_Aadhar() {
		return Jointhold2_Aadhar;
	}

	public void setJointhold2_Aadhar(long jointhold2_Aadhar) {
		Jointhold2_Aadhar = jointhold2_Aadhar;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getCHEQUE_NEFT() {
		return CHEQUE_NEFT;
	}

	public void setCHEQUE_NEFT(String cHEQUE_NEFT) {
		CHEQUE_NEFT = cHEQUE_NEFT;
	}

	public String getBank_Name() {
		return Bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}

	public String getMICR_Code() {
		return MICR_Code;
	}

	public void setMICR_Code(String mICR_Code) {
		MICR_Code = mICR_Code;
	}

	public String getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public long getAccNo() {
		return AccNo;
	}

	public void setAccNo(long accNo) {
		AccNo = accNo;
	}

	public String getName_As_BankAcc() {
		return Name_As_BankAcc;
	}

	public void setName_As_BankAcc(String name_As_BankAcc) {
		Name_As_BankAcc = name_As_BankAcc;
	}

	public String getNomineeName_1() {
		return NomineeName_1;
	}

	public void setNomineeName_1(String nomineeName_1) {
		NomineeName_1 = nomineeName_1;
	}

	public String getNominee1_PAN() {
		return Nominee1_PAN;
	}

	public void setNominee1_PAN(String nominee1_PAN) {
		Nominee1_PAN = nominee1_PAN;
	}

	public String getNominee1_Aadhar() {
		return Nominee1_Aadhar;
	}

	public void setNominee1_Aadhar(String nominee1_Aadhar) {
		Nominee1_Aadhar = nominee1_Aadhar;
	}

	public double getNominee1_Percentage() {
		return Nominee1_Percentage;
	}

	public void setNominee1_Percentage(double nominee1_Percentage) {
		Nominee1_Percentage = nominee1_Percentage;
	}

	public String getNomineeName_2() {
		return NomineeName_2;
	}

	public void setNomineeName_2(String nomineeName_2) {
		NomineeName_2 = nomineeName_2;
	}

	public String getNominee2_PAN() {
		return Nominee2_PAN;
	}

	public void setNominee2_PAN(String nominee2_PAN) {
		Nominee2_PAN = nominee2_PAN;
	}

	public String getNominee2_Aadhar() {
		return Nominee2_Aadhar;
	}

	public void setNominee2_Aadhar(String nominee2_Aadhar) {
		Nominee2_Aadhar = nominee2_Aadhar;
	}

	public double getNominee2_Percentage() {
		return Nominee2_Percentage;
	}

	public void setNominee2_Percentage(double nominee2_Percentage) {
		Nominee2_Percentage = nominee2_Percentage;
	}

	public String getGroupHeadA() {
		return GroupHeadA;
	}

	public void setGroupHeadA(String groupHeadA) {
		GroupHeadA = groupHeadA;
	}

	public String getFamilyHead() {
		return FamilyHead;
	}

	public void setFamilyHead(String familyHead) {
		FamilyHead = familyHead;
	}

	public String getReferencePersonName() {
		return ReferencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		ReferencePersonName = referencePersonName;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getSpecial_Instructions() {
		return Special_Instructions;
	}

	public void setSpecial_Instructions(String special_Instructions) {
		Special_Instructions = special_Instructions;
	}

	public LocalDate getRegisteredDate() {
		return RegisteredDate;
	}

	public void setRegisteredDate(LocalDate registeredDate) {
		RegisteredDate = registeredDate;
	}

	public LocalDateTime getLast_Modification_Date() {
		return Last_Modification_Date;
	}

	public void setLast_Modification_Date(LocalDateTime last_Modification_Date) {
		Last_Modification_Date = last_Modification_Date;
	}

	public String getiCreator() {
		return iCreator;
	}

	public void setiCreator(String iCreator) {
		this.iCreator = iCreator;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "ClientMaster [ClientID=" + ClientID + ", Prefix=" + Prefix + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", MiddleName=" + MiddleName + ", FullName=" + FullName + ", Gender=" + Gender + ", DOB="
				+ DOB + ", PAN=" + PAN + ", Aadhar=" + Aadhar + ", Email=" + Email + ", MobileNo=" + MobileNo
				+ ", LandlineNo=" + LandlineNo + ", CorrespondenceAddress=" + CorrespondenceAddress
				+ ", PermanentAddress=" + PermanentAddress + ", ROI_Percentage=" + ROI_Percentage + ", type=" + type
				+ ", DispatchMode=" + DispatchMode + ", JointHolderName_1=" + JointHolderName_1 + ", Jointhold1_PAN="
				+ Jointhold1_PAN + ", Jointhold1_Aadhar=" + Jointhold1_Aadhar + ", JointHolderName_2="
				+ JointHolderName_2 + ", Jointhold2_PAN=" + Jointhold2_PAN + ", Jointhold2_Aadhar=" + Jointhold2_Aadhar
				+ ", Category=" + Category + ", CHEQUE_NEFT=" + CHEQUE_NEFT + ", Bank_Name=" + Bank_Name
				+ ", MICR_Code=" + MICR_Code + ", IFSC_Code=" + IFSC_Code + ", Branch=" + Branch + ", AccNo=" + AccNo
				+ ", Name_As_BankAcc=" + Name_As_BankAcc + ", NomineeName_1=" + NomineeName_1 + ", Nominee1_PAN="
				+ Nominee1_PAN + ", Nominee1_Aadhar=" + Nominee1_Aadhar + ", Nominee1_Percentage=" + Nominee1_Percentage
				+ ", NomineeName_2=" + NomineeName_2 + ", Nominee2_PAN=" + Nominee2_PAN + ", Nominee2_Aadhar="
				+ Nominee2_Aadhar + ", Nominee2_Percentage=" + Nominee2_Percentage + ", GroupHeadA=" + GroupHeadA
				+ ", FamilyHead=" + FamilyHead + ", ReferencePersonName=" + ReferencePersonName + ", Remark=" + Remark
				+ ", Special_Instructions=" + Special_Instructions + ", RegisteredDate=" + RegisteredDate
				+ ", Last_Modification_Date=" + Last_Modification_Date + ", iCreator=" + iCreator + ", Status=" + Status
				+ "]";
	}
	
	

}
