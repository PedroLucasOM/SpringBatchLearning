package com.springbatch.SpringBatchLearning.step.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step validatingScriptStep(
            FlatFileItemReader validatingScriptReader,
            ItemProcessor validatingScriptProcessor,
            ItemWriter validatingScriptWriter
    ) {
        return stepBuilderFactory
                .get("validatingScriptStep")
                .chunk(1)
                .reader(validatingScriptReader)
                .processor(validatingScriptProcessor)
                .writer(validatingScriptWriter)
                .build();
    }
}
