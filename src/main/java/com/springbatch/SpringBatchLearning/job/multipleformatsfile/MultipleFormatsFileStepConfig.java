package com.springbatch.SpringBatchLearning.job.multipleformatsfile;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFormatsFileStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step multipleFormatsFileStep(
            FlatFileItemReader<Object> multipleFormatsFileReader,
            ItemWriter<Object> multipleFormatsFileWriter
    ) {
        return stepBuilderFactory
                .get("multipleFormatsFileStep")
                .chunk(1)
                .reader(multipleFormatsFileReader)
                .writer(multipleFormatsFileWriter)
                .build();
    }
}
