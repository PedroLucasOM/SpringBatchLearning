package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.batch.item.support.builder.CompositeItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Configuration
public class ClientInvalidWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<BankAccount> clientInvalidFileWriter(
            @Value("${spring-batch-learning.output}${spring-batch-learning.output-filename}Invalid" +
                    "${spring-batch-learning.output-extension}") Resource output
    ) {
        return new FlatFileItemWriterBuilder<BankAccount>()
                .name("clientInvalidFileWriter")
                .resource(output)
                .delimited()
                .names("clientId")
                .build();
    }

}
