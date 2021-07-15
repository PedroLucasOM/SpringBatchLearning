package com.springbatch.SpringBatchLearning.job.composite;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.CompositeItemProcessorBuilder;
import org.springframework.batch.item.validator.BeanValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CompositeProcessorConfig {

    private List<String> emails = new ArrayList<>();

    @Bean
    public ItemProcessor<Client, Client> compositeProcessor() throws Exception {
        return new CompositeItemProcessorBuilder<Client, Client>()
                .delegates(beanValidatingProcessor(), validatingProcessor())
                .build();
    }

    private ItemProcessor<Client, Client> beanValidatingProcessor() throws Exception {
        BeanValidatingItemProcessor<Client> processor = new BeanValidatingItemProcessor<>();
        processor.setFilter(true);
        processor.afterPropertiesSet();
        return processor;
    }

    private ItemProcessor<Client, Client> validatingProcessor() {
        ValidatingItemProcessor<Client> validatingItemProcessor = new ValidatingItemProcessor<>();
        validatingItemProcessor.setValidator(validator());
        validatingItemProcessor.setFilter(true);
        return validatingItemProcessor;
    }

    private Validator<Client> validator() {
        return new Validator<Client>() {
            @Override
            public void validate(Client client) throws ValidationException {
                if (emails.contains(client.getEmail())) {
                    throw new ValidationException(String.format("The email %s is duplicate", client.getEmail()));
                } else {
                    emails.add(client.getEmail());
                }
            }
        };
    }

}
