package com.rewards.program.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.program.dto.ReportResponse;
import com.rewards.program.dto.TransactionRequest;
import com.rewards.program.service.RewardService;

@RestController
public class RewardController {

	@Autowired
	private RewardService rewardService;
	
	@PostMapping
	public ResponseEntity<Void> saveTransaction(@RequestBody @Validated List<TransactionRequest> transactionRequests) {
		rewardService.saveTransaction(transactionRequests);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/report")
	public List<ReportResponse> getReport() {
		return rewardService.getReport();
	}
	
}
