package com.ps.jwtdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.dao.ClientMasterDao;
import com.ps.jwtdemo.model.ClientMaster;

@Service
public class ClientMasterService {

	@Autowired
	private ClientMasterDao clientMasterDao;

	public List<ClientMaster> getAllClientList() {
		return clientMasterDao.findAll();
	}

	public void addClient(ClientMaster clientMaster) {
		clientMasterDao.save(clientMaster);
	}

}
