package com.springbatch.SpringBatchLearning.writer;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelimitedFileWriterConfig {

    @Bean
    public ItemWriter<Client> delimitedFileWriter() {
        return items -> items.forEach(System.out::println);
    }

}
