package com.ps.jwtdemo.service;

import java.util.List;

import com.ps.jwtdemo.Exceptions.TDSNotFoundException;
import com.ps.jwtdemo.model.TDSEntity;

public interface TdsService {
	List<TDSEntity> getAllTDS();
	void addTDS(TDSEntity tds);
	TDSEntity updateTDS(TDSEntity tds,int id) throws TDSNotFoundException;
}
