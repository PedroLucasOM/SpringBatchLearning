package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.model.Client;
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
            FlatFileItemReader<Client> validatingReader,
            ItemProcessor<Client, Client> validatingProcessor,
            ItemWriter<Client> validatingWriter
    ) {
        return stepBuilderFactory
                .get("validatingStep")
                .<Client, Client>chunk(1)
                .reader(validatingReader)
                .processor(validatingProcessor)
                .writer(validatingWriter)
                .build();
    }
}
