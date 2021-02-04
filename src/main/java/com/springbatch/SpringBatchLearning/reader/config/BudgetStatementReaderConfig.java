package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.model.Launch;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class BudgetStatementReaderConfig {

    @Bean
    public JdbcCursorItemReader<Launch> budgetStatementReader(
            @Qualifier("appDataSource") DataSource dataSource
    ) {
        return new JdbcCursorItemReaderBuilder<Launch>()
                .name("budgetStatementReader")
                .dataSource(dataSource)
                .sql("select * from launch")
                .rowMapper(new BeanPropertyRowMapper<Launch>(Launch.class))
                .build();
    }

}
