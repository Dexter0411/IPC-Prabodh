package com.ps.jwtdemo.service;

import java.util.List;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.model.PrefixEntity;

public interface PrefixService {
	List<PrefixEntity> getAllPrefix();
//	void saveNewPrefix(PrefixEntity pE);
//	void updatePrefix(PrefixEntity upE,int id) throws ResourceNotFoundException;
	void saveUpdatePrefix(PrefixEntity upE);

}
