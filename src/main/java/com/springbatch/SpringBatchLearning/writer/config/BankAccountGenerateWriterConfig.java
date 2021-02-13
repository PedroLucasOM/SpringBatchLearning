package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Configuration
public class BankAccountGenerateWriterConfig {

    @Bean
    public JdbcBatchItemWriter<BankAccount> bankAccountGenerateWriter(
            @Qualifier("appDataSource") DataSource dataSource
            ) {
        return new JdbcBatchItemWriterBuilder<BankAccount>()
                .dataSource(dataSource)
                .sql("INSERT INTO bank_account (account_type, max_limit, client_id) VALUES (?, ?, ?)")
                .itemPreparedStatementSetter(itemPreparedStatementSetter())
                .build();
    }

    private ItemPreparedStatementSetter<BankAccount> itemPreparedStatementSetter() {
        return new ItemPreparedStatementSetter<BankAccount>() {
            @Override
            public void setValues(BankAccount bankAccount, PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1, bankAccount.getBankAccountType().name());
                preparedStatement.setDouble(2, bankAccount.getMaxLimit());
                preparedStatement.setString(3, bankAccount.getClientId());
            }
        };
    }

}
