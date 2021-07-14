package com.springbatch.SpringBatchLearning.job.budgetstatement;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.model.Launch;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
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
            JdbcCursorItemReader<Launch> budgetStatementReader,
            CustomMultiBudgetStatementWriter budgetStatementMultiWriter,
            BudgetStatementFooterCallback budgetStatementFooterCallback
    ) {
        return stepBuilderFactory
                .get("budgetStatementStep")
                .<Object, BudgetStatement>chunk(1)
                .reader(new BudgetStatementReader(budgetStatementReader))
                .writer(budgetStatementMultiWriter)
                .listener(budgetStatementMultiWriter)
                .listener(budgetStatementFooterCallback)
                .build();
    }
}
