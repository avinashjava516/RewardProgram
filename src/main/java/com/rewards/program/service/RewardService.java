package com.rewards.program.service;

import java.util.List;

import com.rewards.program.dto.ReportResponse;
import com.rewards.program.dto.TransactionRequest;

public interface RewardService {

	void saveTransaction(List<TransactionRequest> transactionRequest);

	List<ReportResponse> getReport();

}
