package com.springbatch.SpringBatchLearning.job.paginatordatasource;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaginatorDataSourceWriterConfig {

    @Bean
    public ItemWriter<Client> paginatorDataSourceWriter() {
        return items -> items.forEach(System.out::println);
    }

}
