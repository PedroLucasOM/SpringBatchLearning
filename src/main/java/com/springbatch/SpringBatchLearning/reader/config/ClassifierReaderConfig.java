package com.springbatch.SpringBatchLearning.reader.config;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ClassifierReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader classifierReader(
            @Value("#{jobParameters['input']}") Resource input,
            LineMapper lineMapper
    ) {
        return new FlatFileItemReaderBuilder<>()
                .name("classifierReader")
                .resource(input)
                .lineMapper(lineMapper)
                .build();
    }

}
