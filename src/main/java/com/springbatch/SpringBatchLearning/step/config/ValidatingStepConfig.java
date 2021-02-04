package com.springbatch.SpringBatchLearning.step.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step validatingStep(
            FlatFileItemReader validatingReader,
            ItemProcessor validatingProcessor,
            ItemWriter validatingWriter
    ) {
        return stepBuilderFactory
                .get("validatingStep")
                .chunk(1)
                .reader(validatingReader)
                .processor(validatingProcessor)
                .writer(validatingWriter)
                .build();
    }
}
