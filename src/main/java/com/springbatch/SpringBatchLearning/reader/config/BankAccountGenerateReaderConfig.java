package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.PagingQueryProvider;
import org.springframework.batch.item.database.builder.JdbcPagingItemReaderBuilder;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class BankAccountGenerateReaderConfig {

    @Bean
    public JdbcPagingItemReader<Client> bankAccountGenerateReader(
            @Qualifier("appDataSource") DataSource dataSource,
            PagingQueryProvider bankAccountGenerateQueryProvider
    ) {
        return new JdbcPagingItemReaderBuilder<Client>()
                .name("bankAccountGenerateReader")
                .dataSource(dataSource)
                .queryProvider(bankAccountGenerateQueryProvider)
                .pageSize(1)
                .rowMapper(new BeanPropertyRowMapper<Client>(Client.class))
                .build();
    }

    @Bean
    public SqlPagingQueryProviderFactoryBean bankAccountGenerateQueryProvider(
            @Qualifier("appDataSource") DataSource dataSource
    ) {
        SqlPagingQueryProviderFactoryBean sqlPagingQueryProviderFactoryBean = new SqlPagingQueryProviderFactoryBean();
        sqlPagingQueryProviderFactoryBean.setDataSource(dataSource);
        sqlPagingQueryProviderFactoryBean.setSelectClause("select *");
        sqlPagingQueryProviderFactoryBean.setFromClause("from client");
        sqlPagingQueryProviderFactoryBean.setSortKey("email");
        return sqlPagingQueryProviderFactoryBean;
    }

}
