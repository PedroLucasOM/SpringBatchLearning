package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class FixedLengthWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<Client> fixedLengthWriter(
            @Value("${spring-batch-learning.output}") Resource output
    ) {

        return new FlatFileItemWriterBuilder<Client>()
                .name("fixedLengthWriter")
                .resource(output)
                .formatted()
                .format("%-9s %-9s %-2s %-19s %-5s")
                .names("name", "nickname", "age", "email", "salaryRange")
                .build();
    }

}
