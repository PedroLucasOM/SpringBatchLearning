package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.reader.MultipleLineFileReader;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MultipleFileReaderConfig {

    @StepScope
    @Bean
    public MultiResourceItemReader multipleFileReader(
            @Value("#{jobParameters['clientFiles']}") Resource[] clientFiles,
            FlatFileItemReader multipleFormatsFileReader
    ) {
        return new MultiResourceItemReaderBuilder<>()
                .name("multipleFileReader")
                .resources(clientFiles)
                .delegate(new MultipleLineFileReader(multipleFormatsFileReader))
                .build();
    }

}
