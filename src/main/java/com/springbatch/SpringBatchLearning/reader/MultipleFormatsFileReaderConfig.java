package com.springbatch.SpringBatchLearning.reader;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MultipleFormatsFileReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader multipleFormatsFileReader(
            @Value("#{jobParameters['clientsFile']}") Resource clientsFile,
            LineMapper lineMapper
    ) {
        return new FlatFileItemReaderBuilder<>()
                .name("multipleFormatsFileReader")
                .resource(clientsFile)
                .lineMapper(lineMapper)
                .build();
    }

}
