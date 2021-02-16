package com.ps.jwtdemo.service.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.dao.MasterTdsDao;
import com.ps.jwtdemo.model.TDSEntity;
import com.ps.jwtdemo.Exceptions.*;
import com.ps.jwtdemo.service.TdsService;

@Service
public class TdsServiceImpl implements TdsService {

	@Autowired
	MasterTdsDao tdsDao;

	@Override
	public List<TDSEntity> getAllTDS() {
		return tdsDao.findAll();
	}

	@Override
	public void addTDS(TDSEntity tds) {
		tdsDao.save(tds);

	}

	@Override
	public TDSEntity updateTDS(TDSEntity tds, int id) throws ResourceNotFoundException {
		Optional<TDSEntity> temp = tdsDao.findById(id);
		if (!temp.isPresent()) {
			throw new ResourceNotFoundException("ID : "+id+" not found in the database");
		} else {
			TDSEntity data = temp.get();
			data.setI_Creator(tds.getI_Creator());
			data.setIsActive(tds.getIsActive());
			data.setTds(tds.getTds());
			tdsDao.save(data);
			return tdsDao.findById(id).get();
		}

	}

}
