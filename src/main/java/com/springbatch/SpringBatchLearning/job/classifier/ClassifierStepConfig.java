package com.springbatch.SpringBatchLearning.job.classifier;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassifierStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step classifierStep(
            FlatFileItemReader<Object> classifierReader,
            ItemProcessor<Object, Object> classifierProcessor,
            ItemWriter<Object> classifierWriter
    ) {
        return stepBuilderFactory
                .get("classifierStep")
                .<Object, Object>chunk(1)
                .reader(classifierReader)
                .processor(classifierProcessor)
                .writer(classifierWriter)
                .build();
    }
}
