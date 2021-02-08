package com.springbatch.SpringBatchLearning.processor.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ValidatingProcessorConfig {

    private List<String> emails = new ArrayList<>();

    @Bean
    public ItemProcessor validatingProcessor() {
        ValidatingItemProcessor<Client> validatingItemProcessor = new ValidatingItemProcessor<>();
        validatingItemProcessor.setValidator(validator());
        validatingItemProcessor.setFilter(true);
        return validatingItemProcessor;
    }

    private Validator<Client> validator() {
        return new Validator<>() {
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
