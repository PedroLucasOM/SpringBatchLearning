package com.springbatch.SpringBatchLearning.processor.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.Client;
import com.springbatch.SpringBatchLearning.processor.BankAccountGenerateClassifier;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountGenerateProcessorConfig {

    @Bean
    public ItemProcessor<Client, BankAccount> bankAccountGenerateProcessor() {
        return new ClassifierCompositeItemProcessorBuilder<Client, BankAccount>()
                .classifier(new BankAccountGenerateClassifier())
                .build();
    }
}
