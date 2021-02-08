package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.BankAccountType;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;

import java.util.Random;

public class BankAccountGenerateProcessor implements ItemProcessor<Client, BankAccount> {
    @Override
    public BankAccount process(Client client) throws Exception {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setId(new Random().nextInt());
        bankAccount.setClientId(client.getEmail());

        if (client.getSalaryRange() <= 3000) {
            bankAccount.setBankAccountType(BankAccountType.PRATA);
            bankAccount.setMaxLimit(500D);
        } else if (client.getSalaryRange() >= 3001 && client.getSalaryRange() <= 5000) {
            bankAccount.setBankAccountType(BankAccountType.OURO);
            bankAccount.setMaxLimit(1000D);
        } else if (client.getSalaryRange() >= 5000 && client.getSalaryRange() <= 10000) {
            bankAccount.setBankAccountType(BankAccountType.PLATINA);
            bankAccount.setMaxLimit(2500D);
        } else {
            bankAccount.setBankAccountType(BankAccountType.DIAMANTE);
            bankAccount.setMaxLimit(5000D);
        }

        return  bankAccount;
    }
}
