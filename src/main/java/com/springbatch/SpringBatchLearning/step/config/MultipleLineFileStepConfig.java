package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.reader.MultipleLineFileReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleLineFileStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step multipleLineFileStep(
            FlatFileItemReader<Object> multipleLineFileReader,
            ItemWriter<Object> multipleLineFileWriter
    ) {
        return stepBuilderFactory
                .get("stepBuilderFactory")
                .chunk(1)
                .reader(new MultipleLineFileReader(multipleLineFileReader))
                .writer(multipleLineFileWriter)
                .build();
    }
}
