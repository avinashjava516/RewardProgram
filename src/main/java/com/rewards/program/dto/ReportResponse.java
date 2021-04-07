package com.rewards.program.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor 
public class ReportResponse {

	List<MonthReport> monthReports;
	int totalReward;
	String name;
}

