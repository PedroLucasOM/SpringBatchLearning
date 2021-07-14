package com.springbatch.SpringBatchLearning.job.validating;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingWriterConfig {

    @Bean
    public ItemWriter<Client> validatingWriter() {
        return items -> items.forEach(System.out::println);
    }

}
