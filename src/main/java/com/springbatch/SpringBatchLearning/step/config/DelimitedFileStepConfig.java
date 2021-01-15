package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class DelimitedFileStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step delimitedFileStep(ItemReader<Client> delimitedFileReader,
                                  ItemWriter<Client> delimitedFileWriter) {
        return stepBuilderFactory
                .get("delimitedFileStep")
                .<Client, Client>chunk(1)
                .reader(delimitedFileReader)
                .writer(delimitedFileWriter)
                .build();
    }
}
