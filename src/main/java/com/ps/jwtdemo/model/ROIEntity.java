package com.ps.jwtdemo.model;

import java.security.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_master_roi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ROIEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roiMasterId;
	private double roi;
	private String i_Creator;
	@Column(name="c_date_time",updatable = false)
	@CreationTimestamp
	private LocalDateTime cDateTime;
	@UpdateTimestamp
	private LocalDateTime uDateTime;
	private String isActive;
	
	

}
