package com.springbatch.SpringBatchLearning.job.bankaccountgenerate;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.BankAccountType;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;

public class PlatinumBankAccountProcessor implements ItemProcessor<Client, BankAccount> {
    @Override
    public BankAccount process(Client client) throws Exception {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setClientId(client.getEmail());
        bankAccount.setMaxLimit(2500.0);
        bankAccount.setBankAccountType(BankAccountType.PLATINA);
        return bankAccount;
    }
}
