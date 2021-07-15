package com.springbatch.SpringBatchLearning.job.validatingscript;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job validatingScriptJob(Step validatingScriptStep) {
        return jobBuilderFactory
                .get("validatingScriptJob")
                .incrementer(new RunIdIncrementer())
                .start(validatingScriptStep)
                .build();
    }
}
