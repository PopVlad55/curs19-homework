package com.fasttrackit.BudgetApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByType(String type);
    List<Transaction> findByAmountGreaterThanEqual(double minAmount);
    List<Transaction> findByAmountLessThanEqual(double maxAmount);
    List<Transaction> findByTypeAndAmountGreaterThanEqual(String type, double minAmount);
    List<Transaction> findByTypeAndAmountLessThanEqual(String type, double maxAmount);
    List<Transaction> findByAmountBetween(double minAmount, double maxAmount);
    List<Transaction> findByTypeAndAmountBetween(String type, double minAmount, double maxAmount);
}
