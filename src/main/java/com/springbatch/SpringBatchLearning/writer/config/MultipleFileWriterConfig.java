package com.springbatch.SpringBatchLearning.writer.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFileWriterConfig {

    @Bean
    public ItemWriter multipleFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
