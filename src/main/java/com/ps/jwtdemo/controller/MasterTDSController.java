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

import com.ps.jwtdemo.Exceptions.TDSNotFoundException;
import com.ps.jwtdemo.model.TDSEntity;
import com.ps.jwtdemo.service.TdsService;

@RestController
public class MasterTDSController {

	@Autowired
	TdsService tdsService;
	
	@GetMapping(path="/getAllTDS")
	List<TDSEntity> getAllTDS(){
		return tdsService.getAllTDS();
	}
	
	@PostMapping(path="/addTDS")
	ResponseEntity<TDSEntity> addTDS(@RequestBody TDSEntity tdsEntity){
		try {
		tdsService.addTDS(tdsEntity);
		return new ResponseEntity<TDSEntity>(tdsEntity,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<TDSEntity>(tdsEntity,HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	@PostMapping(path="/updateTDS/{id}")
	ResponseEntity<TDSEntity> updateTDS(@RequestBody TDSEntity tdsEntity,@PathVariable int id){
		try {
			TDSEntity udata=tdsService.updateTDS(tdsEntity, id);
			return new ResponseEntity<TDSEntity>(udata,HttpStatus.CREATED);
		} catch (TDSNotFoundException e) {
			return new ResponseEntity<TDSEntity>(tdsEntity,HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	
	
}
