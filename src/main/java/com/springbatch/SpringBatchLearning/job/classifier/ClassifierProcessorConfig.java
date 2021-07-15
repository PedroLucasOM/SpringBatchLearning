package com.springbatch.SpringBatchLearning.job.classifier;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassifierProcessorConfig {

    @Bean
    public ItemProcessor<Object, Object> classifierProcessor() {
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
