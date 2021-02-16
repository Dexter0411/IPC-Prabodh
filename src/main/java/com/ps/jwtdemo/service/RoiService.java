package com.ps.jwtdemo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.model.ROIEntity;

public interface RoiService{
	
	List<ROIEntity> getAllRoi();
	void saveNewRoi(ROIEntity roi);
	ROIEntity updateRoi(ROIEntity roi,int id) throws ResourceNotFoundException;

}
