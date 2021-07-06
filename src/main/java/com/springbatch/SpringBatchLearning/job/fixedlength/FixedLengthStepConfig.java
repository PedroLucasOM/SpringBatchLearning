package com.springbatch.SpringBatchLearning.job.fixedlength;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FixedLengthStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step fixedLengthStep(ItemReader<Client> fixedLengthReader,
                                ItemWriter<Client> fixedLengthWriter) {
        return stepBuilderFactory
                .get("fixedLengthStep")
                .<Client, Client>chunk(1)
                .reader(fixedLengthReader)
                .writer(fixedLengthWriter)
                .build();
    }
}
