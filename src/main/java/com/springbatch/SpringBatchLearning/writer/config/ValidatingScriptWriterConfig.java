package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptWriterConfig {

    @Bean
    public ItemWriter<Client> validatingScriptWriter() {
        return items -> items.forEach(System.out::println);
    }

}
