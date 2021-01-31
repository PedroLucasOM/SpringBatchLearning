package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.reader.BudgetStatementReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BudgetStatementStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step budgetStatementStep(
            JdbcCursorItemReader budgetStatementReader,
            ItemWriter budgetStatementWriter
    ) {
        return stepBuilderFactory
                .get("budgetStatementStep")
                .chunk(1)
                .reader(new BudgetStatementReader(budgetStatementReader))
                .writer(budgetStatementWriter)
                .build();
    }
}
