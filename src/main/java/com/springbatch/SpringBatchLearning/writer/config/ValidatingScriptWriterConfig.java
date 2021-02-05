package com.springbatch.SpringBatchLearning.writer.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptWriterConfig {

    @Bean
    public ItemWriter validatingScriptWriter() {
        return items -> items.forEach(System.out::println);
    }

}
