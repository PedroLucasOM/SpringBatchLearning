package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaginatorDataSourceStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step paginatorDataSourceStep(
            ItemReader<Client> paginatorDataSourceReader,
            ItemWriter<Client> paginatorDataSourceWriter) {
        return stepBuilderFactory
                .get("paginatorDataSourceStep")
                .<Client, Client>chunk(1)
                .reader(paginatorDataSourceReader)
                .writer(paginatorDataSourceWriter)
                .build();
    }

}
