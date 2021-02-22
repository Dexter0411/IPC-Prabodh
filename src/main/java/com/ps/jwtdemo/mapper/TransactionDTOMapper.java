package com.ps.jwtdemo.mapper;

import java.time.LocalDate;

import com.ps.jwtdemo.dto.TransactionDTO;
import com.ps.jwtdemo.model.ClientMaster;
import com.ps.jwtdemo.model.TransactionEntity;
import com.ps.jwtdemo.util.ResourceUtil;

public class TransactionDTOMapper {
	
	public TransactionDTO TransactionResponseDTO(ClientMaster cM , TransactionEntity tE) {
		TransactionDTO tDTO = new TransactionDTO();
		tDTO.setClientId(cM.getClientID());
		tDTO.setPrefix(cM.getPrefix());
		tDTO.setFullName(cM.getFullName());
		tDTO.setJHolder1(cM.getJointHolderName_1());
		tDTO.setJHolder2(cM.getJointHolderName_2());
		tDTO.setCategory(cM.getCategory());
		tDTO.setType(cM.getType());
		tDTO.setRoi(cM.getROI_Percentage());
		tDTO.setFinancialYr(tE.getFinancialYear());
		tDTO.setQuarter(ResourceUtil.getQuarter(LocalDate.now()));
		tDTO.setOpeningBalance(tE.getOpeningBalance());
		tDTO.setReceiptDate(LocalDate.now());
		tDTO.setDeploymentDate(ResourceUtil.getDeploymentDate(LocalDate.now()));
		return tDTO;
	}

}
