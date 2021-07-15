package com.springbatch.SpringBatchLearning.job.bankaccountgenerate;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountGenerateJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job bankAccountGenerateJob(Step bankAccountGenerateStep) {
        return jobBuilderFactory
                .get("bankAccountGenerateJob")
                .incrementer(new RunIdIncrementer())
                .start(bankAccountGenerateStep)
                .build();
    }
}
