package com.springbatch.SpringBatchLearning.step.config;

import com.springbatch.SpringBatchLearning.footer.BudgetStatementFooterCallback;
import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.reader.BudgetStatementReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.MultiResourceItemWriter;
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
            MultiResourceItemWriter budgetStatementMultiWriter,
            BudgetStatementFooterCallback budgetStatementFooterCallback
    ) {
        return stepBuilderFactory
                .get("budgetStatementStep")
                .chunk(1)
                .reader(new BudgetStatementReader(budgetStatementReader))
                .writer(budgetStatementMultiWriter)
                .listener(budgetStatementFooterCallback)
                .build();
    }
}
