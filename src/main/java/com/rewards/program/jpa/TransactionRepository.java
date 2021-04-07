package com.rewards.program.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.program.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String>, TransactionCustom{

}
