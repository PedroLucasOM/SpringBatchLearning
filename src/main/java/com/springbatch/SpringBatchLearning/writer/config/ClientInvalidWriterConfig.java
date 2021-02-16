package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ClientInvalidWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<BankAccount> clientInvalidFileWriter(
            @Value("${spring-batch-learning.output-folder}invalidClients.txt") Resource output
    ) {
        return new FlatFileItemWriterBuilder<BankAccount>()
                .name("clientInvalidFileWriter")
                .resource(output)
                .delimited()
                .names("clientId")
                .build();
    }

}
