package com.rewards.program.jpa;

import java.util.List;

import com.rewards.program.dto.ReportResponse;

public interface TransactionCustom {
	List<ReportResponse> getReport();
}
