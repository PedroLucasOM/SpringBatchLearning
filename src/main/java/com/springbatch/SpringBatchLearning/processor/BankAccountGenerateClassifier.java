package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.BankAccountType;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.classify.Classifier;

import java.util.HashMap;
import java.util.Map;

public class BankAccountGenerateClassifier implements Classifier<Client, ItemProcessor<?, ? extends BankAccount>> {

    private static final Map<BankAccountType, ItemProcessor<Client, BankAccount>> processors =
            new HashMap<BankAccountType, ItemProcessor<Client, BankAccount>>() {{
                put(BankAccountType.PRATA, new SilverBankAccountProcessor());
                put(BankAccountType.OURO, new GoldBankAccountProcessor());
                put(BankAccountType.PLATINA, new PlatinumBankAccountProcessor());
                put(BankAccountType.DIAMANTE, new DiamondBankAccountProcessor());
                put(BankAccountType.INVALID, new InvalidBankAccountProcessor());
            }};

    @Override
    public ItemProcessor<?, ? extends BankAccount> classify(Client client) {
        BankAccountType bankAccountType = BankAccountType.returnFromSalaryRange(client.getSalaryRange());
        return processors.get(bankAccountType);
    }
}
