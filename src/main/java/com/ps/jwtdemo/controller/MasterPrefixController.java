package com.ps.jwtdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.jwtdemo.Exceptions.PrefixIdNotFoundException;
import com.ps.jwtdemo.model.PrefixEntity;
import com.ps.jwtdemo.service.PrefixService;
@RestController
public class MasterPrefixController {
	@Autowired
	private PrefixService prefixSer;
	
	@GetMapping(path="/getAllPrefix")
	public List<PrefixEntity> getAllPrefix(){
		System.out.println(prefixSer.getAllPrefix());
		return prefixSer.getAllPrefix();
	}
	
	@PostMapping(path="/addPrefix")
	public ResponseEntity<PrefixEntity> addNewPrefix(@RequestBody PrefixEntity prefix){
		try {
		prefixSer.saveNewPrefix(prefix);
		return new ResponseEntity<>(prefix,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<PrefixEntity>(HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	@PostMapping(path="/updatePrefix/{id}")
	public ResponseEntity<PrefixEntity> updatePrefix(@RequestBody PrefixEntity prefix,@PathVariable int id ){
		try {
			prefixSer.updatePrefix(prefix,id);
			return new ResponseEntity<PrefixEntity>(prefix,HttpStatus.ACCEPTED);
		} catch (PrefixIdNotFoundException e) {
			return new ResponseEntity<PrefixEntity>(prefix,HttpStatus.NOT_MODIFIED);
		}
		
	}

}
