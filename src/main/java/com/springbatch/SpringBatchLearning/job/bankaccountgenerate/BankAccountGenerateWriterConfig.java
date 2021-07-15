package com.springbatch.SpringBatchLearning.job.bankaccountgenerate;

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
public class BankAccountGenerateWriterConfig {

    @Bean
    public CompositeItemWriter<BankAccount> bankAccountGenerateCompositeWriter(
            @Qualifier("bankAccountGenerateFileWriter") FlatFileItemWriter<BankAccount> bankAccountGenerateFileWriter,
            JdbcBatchItemWriter<BankAccount> bankAccountGenerateJdbcWriter
    ) {
        return new CompositeItemWriterBuilder<BankAccount>()
                .delegates(bankAccountGenerateFileWriter, bankAccountGenerateJdbcWriter)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemWriter<BankAccount> bankAccountGenerateFileWriter(
            @Value("file:${spring-batch-learning.output-folder}bankAccounts.txt") Resource output
    ) {
        return new FlatFileItemWriterBuilder<BankAccount>()
                .name("bankAccountGenerateFileWriter")
                .resource(output)
                .delimited()
                .names("bankAccountType", "maxLimit", "clientId")
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<BankAccount> bankAccountGenerateJdbcWriter(
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
