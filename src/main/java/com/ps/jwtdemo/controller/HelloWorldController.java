package com.ps.jwtdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.jwtdemo.model.ClientMaster;
import com.ps.jwtdemo.service.ClientMasterService;

@RestController
public class HelloWorldController {

	@Autowired
	private ClientMasterService clientMasterService;

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello Welcome to PaySquare ";
	}

	@RequestMapping({ "/getAllClient" })
	public List<ClientMaster> getAllClientList() {
		return clientMasterService.getAllClientList();
	}

	@PostMapping({ "/addClient" })
	public String addClient(@RequestBody ClientMaster clientMaster) {
		clientMasterService.addClient(clientMaster);
		return "Client Added Successfully";
	}

}