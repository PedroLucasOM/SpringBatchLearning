package com.springbatch.SpringBatchLearning.job.multiplefile;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFileWriterConfig {

    @Bean
    public ItemWriter<Object> multipleFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
