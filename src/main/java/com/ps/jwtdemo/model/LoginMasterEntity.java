package com.ps.jwtdemo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_login_master")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String fullName;
	String userName;
	String password;
	String userType;
	LocalDateTime lstLogin;
	String i_Creator;
	String isActive;
	
}
