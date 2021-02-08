package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountGenerateStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step bankAccountGenerateStep(
            ItemReader<Client> bankAccountGenerateReader,
            ItemProcessor bankAccountGenerateProcessor,
            ItemWriter<BankAccount> bankAccountGenerateWriter
    ) {
        return stepBuilderFactory
                .get("bankAccountGenerateStep")
                .chunk(1)
                .reader(bankAccountGenerateReader)
                .processor(bankAccountGenerateProcessor)
                .writer(bankAccountGenerateWriter)
                .build();
    }

}
