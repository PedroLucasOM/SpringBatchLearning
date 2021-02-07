package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.Transaction;
import org.springframework.batch.item.ItemProcessor;

public class TransactionProcessor implements ItemProcessor<Transaction, Transaction> {
    @Override
    public Transaction process(Transaction transaction) throws Exception {
        System.out.println("Running transaction processor");
        return transaction;
    }
}
