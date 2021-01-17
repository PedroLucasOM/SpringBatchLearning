package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class CursorDataSourceReaderConfig {

    @Bean
    public JdbcCursorItemReader<Client> cursorDataSourceReader(
            @Qualifier("appDataSource")DataSource dataSource
            ) {
        return new JdbcCursorItemReaderBuilder<Client>()
                .name("cursorDataSourceReader")
                .dataSource(dataSource)
                .sql("select * from client")
                .rowMapper(new BeanPropertyRowMapper<Client>(Client.class))
                .build();
    }

}
