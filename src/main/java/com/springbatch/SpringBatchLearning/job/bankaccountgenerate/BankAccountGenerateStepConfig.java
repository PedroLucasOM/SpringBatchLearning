package com.springbatch.SpringBatchLearning.job.bankaccountgenerate;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountGenerateStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step bankAccountGenerateStep(
            ItemReader<Client> bankAccountGenerateReader,
            ItemProcessor<Client, BankAccount> bankAccountGenerateProcessor,
            ClassifierCompositeItemWriter<BankAccount> bankAccountClassifier,
            @Qualifier("clientInvalidFileWriter") FlatFileItemWriter<BankAccount> clientInvalidFileWriter,
            @Qualifier("bankAccountGenerateFileWriter") FlatFileItemWriter<BankAccount> bankAccountGenerateFileWriter
    ) {
        return stepBuilderFactory
                .get("bankAccountGenerateStep")
                .<Client, BankAccount>chunk(1)
                .reader(bankAccountGenerateReader)
                .processor(bankAccountGenerateProcessor)
                .writer(bankAccountClassifier)
                .stream(clientInvalidFileWriter)
                .stream(bankAccountGenerateFileWriter)
                .build();
    }

}
