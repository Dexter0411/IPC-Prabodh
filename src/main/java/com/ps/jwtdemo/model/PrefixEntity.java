package com.ps.jwtdemo.model;

import javax.annotation.Generated;
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
@Table(name="tbl_master_prefix")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class PrefixEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int masterPId;
	private String prefixMasterName;
	private String iCreator;
	private int isActive;
	
	
//	public PrefixEntity() {
//		super();
//	}
//	public PrefixEntity(int masterPId, String prefixMasterName, String iCreator, int isActive) {
//		super();
//		this.masterPId = masterPId;
//		this.prefixMasterName = prefixMasterName;
//		this.iCreator = iCreator;
//		this.isActive = isActive;
//	}
//	public int getMasterPId() {
//		return masterPId;
//	}
//	public void setMasterPId(int masterPId) {
//		this.masterPId = masterPId;
//	}
//	public String getPrefixMasterName() {
//		return prefixMasterName;
//	}
//	public void setPrefixMasterName(String prefixMasterName) {
//		this.prefixMasterName = prefixMasterName;
//	}
//	public String getiCreator() {
//		return iCreator;
//	}
//	public void setiCreator(String iCreator) {
//		this.iCreator = iCreator;
//	}
//	public int getIsActive() {
//		return isActive;
//	}
//	public void setIsActive(int isActive) {
//		this.isActive = isActive;
//	}
//	@Override
//	public String toString() {
//		return "PrefixEntity [masterPId=" + masterPId + ", prefixMasterName=" + prefixMasterName + ", iCreator="
//				+ iCreator + ", isActive=" + isActive + "]";
//	}
	
	

}
