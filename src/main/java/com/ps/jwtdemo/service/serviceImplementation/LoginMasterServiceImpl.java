package com.ps.jwtdemo.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.dao.LoginMasterDao;
import com.ps.jwtdemo.model.LoginMasterEntity;
import com.ps.jwtdemo.service.LoginMasterService;
@Service
public class LoginMasterServiceImpl implements LoginMasterService {
	@Autowired
	private LoginMasterDao loginDao;
	
	@Override
	public void addNewUser(LoginMasterEntity register) {
		loginDao.save(register);
	}

}
