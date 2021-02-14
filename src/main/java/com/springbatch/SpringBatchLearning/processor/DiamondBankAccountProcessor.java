package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.BankAccountType;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;

public class DiamondBankAccountProcessor implements ItemProcessor<Client, BankAccount> {
    @Override
    public BankAccount process(Client client) throws Exception {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setClientId(client.getEmail());
        bankAccount.setMaxLimit(5000.0);
        bankAccount.setBankAccountType(BankAccountType.DIAMANTE);
        return bankAccount;
    }
}
