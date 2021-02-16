package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ValidatingScriptReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader<Client> validatingScriptReader(
            @Value("file:${spring-batch-learning.input-folder}clients-validating-script.txt") Resource resource
    ) {
        return new FlatFileItemReaderBuilder<Client>()
                .name("validatingScriptReader")
                .resource(resource)
                .delimited()
                .names("name", "nickname", "age", "email", "salaryRange")
                .targetType(Client.class)
                .build();
    }

}
