package com.ps.jwtdemo.service.serviceImplementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.dao.MasterRoiDao;
import com.ps.jwtdemo.model.ROIEntity;
import com.ps.jwtdemo.service.RoiService;
@Service
public class MasterRoiServiceImpl implements RoiService {
	@Autowired
	private MasterRoiDao roiDao;
	
	@Override
	public List<ROIEntity> getAllRoi() {
		return roiDao.findAll();
	}

	@Override
	public void saveNewRoi(ROIEntity roi) {
		roiDao.save(roi);
	}

	@Override
	public ROIEntity updateRoi(ROIEntity roi,int id) throws ResourceNotFoundException {
		Optional<ROIEntity> obj = roiDao.findById(id);
		if(!obj.isPresent()) {
			throw new ResourceNotFoundException("ID : "+id+" is not found in the database");
		}else {
		ROIEntity temp = obj.get();
		temp.setI_Creator(roi.getI_Creator());
		temp.setIsActive(roi.getIsActive());
		temp.setRoi(roi.getRoi());
		roiDao.save(temp);
		return roiDao.findById(id).get();
		}
	}

}
