package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountGenerateWriterConfig {

    @Bean
    public ItemWriter<BankAccount> bankAccountGenerateWriter() {
        return items -> items.forEach(System.out::println);
    }

}
