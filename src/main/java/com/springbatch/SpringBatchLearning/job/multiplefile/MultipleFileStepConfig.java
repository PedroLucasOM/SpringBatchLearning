package com.springbatch.SpringBatchLearning.job.multiplefile;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFileStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step multipleFileStep(
            MultiResourceItemReader<Object> multipleFileReader,
            ItemWriter<Object> multipleFileWriter
    ) {
        return stepBuilderFactory
                .get("multipleFileStep")
                .chunk(1)
                .reader(multipleFileReader)
                .writer(multipleFileWriter)
                .build();
    }

}
