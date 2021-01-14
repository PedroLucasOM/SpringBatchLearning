package com.springbatch.SpringBatchLearning.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFormatsFileWriterConfig {

    @Bean
    public ItemWriter multipleFormatsFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
