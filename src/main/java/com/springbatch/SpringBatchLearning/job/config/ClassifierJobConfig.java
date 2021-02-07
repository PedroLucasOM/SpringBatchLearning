package com.springbatch.SpringBatchLearning.job.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassifierJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job classifierJob(Step classifierStep) {
        return jobBuilderFactory
                .get("classifierJob")
                .incrementer(new RunIdIncrementer())
                .start(classifierStep)
                .build();
    }
}
