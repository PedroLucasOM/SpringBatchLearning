package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompositeWriterConfig {

    @Bean
    public ItemWriter<Client> compositeWriter() {
        return items -> items.forEach(System.out::println);
    }

}
