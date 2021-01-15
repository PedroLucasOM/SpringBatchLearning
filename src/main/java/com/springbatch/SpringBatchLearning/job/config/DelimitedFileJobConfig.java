package com.springbatch.SpringBatchLearning.job.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class DelimitedFileJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job delimitedFileJob(Step delimitedFileStep) {
        return jobBuilderFactory
                .get("delimitedFileJob")
                .start(delimitedFileStep)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}
