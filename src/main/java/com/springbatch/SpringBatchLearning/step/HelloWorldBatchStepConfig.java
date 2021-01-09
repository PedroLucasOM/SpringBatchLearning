package com.springbatch.SpringBatchLearning.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class HelloWorldBatchStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step stepToSayHelloWorld(Tasklet sayHelloWorldTasklet) {
        return stepBuilderFactory
                .get("stepToSayHelloWorld")
                .tasklet(sayHelloWorldTasklet)
                .build();
    }

}
