package com.rewards.program.service.imp;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewards.program.dto.ReportResponse;
import com.rewards.program.dto.TransactionRequest;
import com.rewards.program.entities.Transaction;
import com.rewards.program.jpa.TransactionRepository;
import com.rewards.program.mapper.TransactionMapper;
import com.rewards.program.service.RewardService;

@Service
public class RewardServiceImpl implements RewardService{

	@Autowired
	TransactionRepository transactionRepository;
	
	TransactionMapper trasactionMapper = Mappers.getMapper( TransactionMapper.class );
	
	/**
	 * Saves all transactions
	 */
	@Override
	public void saveTransaction(List<TransactionRequest> transactionRequests) {
		List<Transaction> transactions = trasactionMapper.mapToTransactions(transactionRequests);
		transactionRepository.saveAll(transactions);
	}
	
	/**
	 * Get report in required format
	 */
	@Override
	public List<ReportResponse> getReport() {
		return transactionRepository.getReport();
	}
}
