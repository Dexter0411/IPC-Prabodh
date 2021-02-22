package com.ps.jwtdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
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
	
	public ClientMaster getClientByid(int id) throws ResourceNotFoundException {
		Optional<ClientMaster> cobj = clientMasterDao.findById(id);
		if(!cobj.isPresent()) {
			throw new ResourceNotFoundException("ID :"+ id + "not found");
		}else {
		return cobj.get() ;
		}
	}

}
