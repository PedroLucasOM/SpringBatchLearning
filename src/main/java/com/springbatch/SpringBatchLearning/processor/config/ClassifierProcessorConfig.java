package com.springbatch.SpringBatchLearning.processor.config;

import com.springbatch.SpringBatchLearning.model.Client;
import com.springbatch.SpringBatchLearning.processor.ClientProcessor;
import com.springbatch.SpringBatchLearning.processor.TransactionProcessor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassifierProcessorConfig {

    @Bean
    public ItemProcessor classifierProcessor() {
        return new ClassifierCompositeItemProcessorBuilder<>()
                .classifier(classifier())
                .build();
    }

    private Classifier<? super Object, ItemProcessor<?, ?>> classifier() {
        return new Classifier<Object, ItemProcessor<?, ?>>() {
            @Override
            public ItemProcessor<?, ?> classify(Object object) {
                if (object instanceof Client) {
                    return new ClientProcessor();
                } else {
                    return new TransactionProcessor();
                }
            }
        };
    }

}
