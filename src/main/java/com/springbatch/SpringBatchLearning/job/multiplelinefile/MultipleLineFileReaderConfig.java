package com.springbatch.SpringBatchLearning.job.multiplelinefile;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MultipleLineFileReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader<Object> multipleLineFileReader(
            @Value("file:${spring-batch-learning.input-folder}clients-multiple-file1.txt") Resource resource,
            LineMapper<Object> lineMapper
    ) {
        return new FlatFileItemReaderBuilder<Object>()
                .name("multipleLineFileReader")
                .resource(resource)
                .lineMapper(lineMapper)
                .build();
    }

}
