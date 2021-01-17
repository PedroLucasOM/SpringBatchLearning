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
public class CursorDataSourceStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step cursorDataSourceStep(
            ItemReader<Client> cursorDataSourceReader,
            ItemWriter<Client> cursorDataSourceWriter) {
        return stepBuilderFactory
                .get("cursorDataSourceStep")
                .<Client, Client>chunk(1)
                .reader(cursorDataSourceReader)
                .writer(cursorDataSourceWriter)
                .build();
    }
}
