package com.rewards.program.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.rewards.program.dto.TransactionRequest;
import com.rewards.program.entities.Transaction;

@Mapper
public interface TransactionMapper {

	List<Transaction> mapToTransactions(List<TransactionRequest> transactionRequests);

}
