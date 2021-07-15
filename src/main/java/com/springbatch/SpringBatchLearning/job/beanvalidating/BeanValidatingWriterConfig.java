package com.springbatch.SpringBatchLearning.job.beanvalidating;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanValidatingWriterConfig {

    @Bean
    public ItemWriter<Client> beanValidatingWriter() {
        return items -> items.forEach(System.out::println);
    }

}
