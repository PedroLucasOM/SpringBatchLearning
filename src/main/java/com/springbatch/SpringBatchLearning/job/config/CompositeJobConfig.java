package com.springbatch.SpringBatchLearning.job.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompositeJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job compositeJob(Step compositeStep) {
        return jobBuilderFactory
                .get("compositeJob")
                .incrementer(new RunIdIncrementer())
                .start(compositeStep)
                .build();
    }
}
