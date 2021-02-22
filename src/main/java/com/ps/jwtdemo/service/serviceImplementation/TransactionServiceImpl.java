package com.ps.jwtdemo.service.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.jwtdemo.Exceptions.ResourceNotFoundException;
import com.ps.jwtdemo.dao.MasterTransactionDao;
import com.ps.jwtdemo.dto.TransactionDTO;
import com.ps.jwtdemo.mapper.TransactionDTOMapper;
import com.ps.jwtdemo.model.ClientMaster;
import com.ps.jwtdemo.model.TransactionEntity;
import com.ps.jwtdemo.service.ClientMasterService;
import com.ps.jwtdemo.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private MasterTransactionDao tRepo;
	@Autowired
	private ClientMasterService cServ;

	@Override
	public TransactionDTO getTransDetailsByClientId(int id) throws ResourceNotFoundException {
		ClientMaster clientObj = cServ.getClientByid(id);
		TransactionEntity latestTrans = tRepo.findLatestTransactionByClientId(id);
		TransactionDTOMapper transResponseDTO = new TransactionDTOMapper();
		TransactionDTO response = transResponseDTO.TransactionResponseDTO(clientObj, latestTrans);
		return response;
	}

	@Override
	public int callStoredProcedure(TransactionEntity tE) {
		tRepo.ExecuteStoredProcedure(tE.getClientId(), tE.getPrefix(), tE.getAccHolderName(), tE.getJointHolderName1(), 
				tE.getJointHolderName2(), tE.getType(), tE.getCategory(), tE.getFinancialYear(), 
				tE.getBankName(), tE.getCheckNumber(), tE.getTransactionDate(), tE.getDeploymentDate(), 
				tE.getOpeningBalance(), tE.getFinancialQuarter(), tE.getDepositAmount(), tE.getAmountWithdraw(), 
				tE.getICreator(), tE.getStatus());
		return 0;
	}

}
