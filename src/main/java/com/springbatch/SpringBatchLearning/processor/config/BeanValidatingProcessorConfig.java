package com.springbatch.SpringBatchLearning.processor.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.BeanValidatingItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanValidatingProcessorConfig {

    @Bean
    public ItemProcessor<Client, Client> beanValidatingProcessor() {
        BeanValidatingItemProcessor<Client> processor = new BeanValidatingItemProcessor<>();
        processor.setFilter(true);
        return processor;
    }

}
