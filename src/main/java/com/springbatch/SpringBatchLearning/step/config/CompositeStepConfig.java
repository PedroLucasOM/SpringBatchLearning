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
public class CompositeStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step compositeStep(
            FlatFileItemReader<Client> compositeReader,
            ItemProcessor<Client, Client> compositeProcessor,
            ItemWriter<Client> compositeWriter
    ) {
        return stepBuilderFactory
                .get("compositeStep")
                .<Client, Client>chunk(1)
                .reader(compositeReader)
                .processor(compositeProcessor)
                .writer(compositeWriter)
                .build();
    }
}
