package com.springbatch.SpringBatchLearning.job.multiplelinefile;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleLineFileWriterConfig {

    @Bean
    public ItemWriter<Object> multipleLineFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
