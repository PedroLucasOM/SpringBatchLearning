package com.springbatch.SpringBatchLearning.step.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFileStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step multipleFileStep(
            MultiResourceItemReader multipleFileReader,
            ItemWriter multipleFileWriter
    ) {
        return stepBuilderFactory
                .get("multipleFileStep")
                .chunk(1)
                .reader(multipleFileReader)
                .writer(multipleFileWriter)
                .build();
    }

}
