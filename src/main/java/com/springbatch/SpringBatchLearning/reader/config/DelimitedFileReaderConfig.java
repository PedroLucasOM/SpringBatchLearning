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
public class DelimitedFileReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader<Client> delimitedFileReader(
            @Value("${spring-batch-learning.input}#{jobParameters['file']}") Resource input
    ) {
        return new FlatFileItemReaderBuilder<Client>()
                .name("delimitedFileReader")
                .resource(input)
                .delimited()
                .names(new String[]{"name", "nickname", "age", "email", "salaryRange"})
                .targetType(Client.class)
                .build();
    }

}
