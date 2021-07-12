package com.springbatch.SpringBatchLearning.job.multipleformatsfile;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFormatsFileWriterConfig {

    @Bean
    public ItemWriter<Object> multipleFormatsFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
