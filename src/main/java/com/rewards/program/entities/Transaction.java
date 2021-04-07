package com.rewards.program.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @Entity @NoArgsConstructor 
public class Transaction {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",
	  strategy = "uuid")
	private String id;
	
	private String customerName;
	
	private Date transactionDate;
	
	private int transactionAmount;
}
