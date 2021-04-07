package com.rewards.program.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor 
public class TransactionRequest{
	
	@NotBlank
	private String customerName;

	@NotBlank
	private Date transactionDate;

	@NotBlank
	private int transactionAmount;
}
