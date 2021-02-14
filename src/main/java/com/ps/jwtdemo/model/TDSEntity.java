package com.ps.jwtdemo.model;

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
import lombok.ToString;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="tbl_master_TDS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TDSEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	double tds;
	String iCreator;
	@Column(name="c_date_time",updatable = false)
	@CreationTimestamp
	LocalDateTime cDateTime;
	@UpdateTimestamp
	LocalDateTime uDateTime;
	String isActive;
	
	
}
