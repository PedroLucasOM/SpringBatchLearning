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
public class BeanValidatingStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step beanValidatingStep(
            FlatFileItemReader<Client> beanValidatingReader,
            ItemProcessor<Client, Client> beanValidatingProcessor,
            ItemWriter<Client> beanValidatingWriter
    ) {
        return stepBuilderFactory
                .get("beanValidatingStep")
                .<Client, Client>chunk(1)
                .reader(beanValidatingReader)
                .processor(beanValidatingProcessor)
                .writer(beanValidatingWriter)
                .build();
    }
}
