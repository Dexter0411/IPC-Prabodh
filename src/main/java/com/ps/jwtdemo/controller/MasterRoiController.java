package com.ps.jwtdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.jwtdemo.Exceptions.ROINotFoundException;
import com.ps.jwtdemo.model.ROIEntity;
import com.ps.jwtdemo.service.RoiService;

@RestController
public class MasterRoiController {
	@Autowired
	private RoiService rSer;
	
	@GetMapping(path="/getAllRoi")
	List<ROIEntity> getAllRoi(){
		return rSer.getAllRoi();
	}
	
	@PostMapping(path="/addNewRoi")
	ResponseEntity<ROIEntity> addNewRoi(@RequestBody ROIEntity roi){
		try {
		rSer.saveNewRoi(roi);
		return new ResponseEntity<ROIEntity>(roi,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<ROIEntity>(roi,HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	@PostMapping(path="/updateRoi/{id}")
	ResponseEntity<ROIEntity> updateNewRoi (@RequestBody ROIEntity roi,@PathVariable int id){
		try {
		ROIEntity uData = rSer.updateRoi(roi, id);
		return new ResponseEntity<ROIEntity>(uData,HttpStatus.ACCEPTED);
		}catch(ROINotFoundException e) {
			return new ResponseEntity<ROIEntity>(roi,HttpStatus.NOT_MODIFIED);
		}
	}

}
