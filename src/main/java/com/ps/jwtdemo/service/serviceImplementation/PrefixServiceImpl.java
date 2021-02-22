package com.ps.jwtdemo.service.serviceImplementation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.dao.PrefixDao;
import com.ps.jwtdemo.service.PrefixService;
import com.ps.jwtdemo.model.PrefixEntity;
@Service
public class PrefixServiceImpl implements PrefixService {
	@Autowired
	private PrefixDao prefixDao;
	
	@Override
	public List<PrefixEntity> getAllPrefix() {
		return prefixDao.findAll();
	}

	@Override
	public void saveUpdatePrefix(PrefixEntity upE) {
		Optional<PrefixEntity> obj = prefixDao.findById(upE.getMasterPId());
		if(!obj.isPresent()) {
//			throw new ResourceNotFoundException("ID : "+ id +" not found in the data base");
			prefixDao.save(upE);
		}else {
			PrefixEntity temp = obj.get();
			temp.setIsActive(upE.getIsActive());
			temp.setPrefixMasterName(upE.getPrefixMasterName());
			temp.setI_Creator(upE.getI_Creator());
			prefixDao.save(temp);
		}
		
	}

}
