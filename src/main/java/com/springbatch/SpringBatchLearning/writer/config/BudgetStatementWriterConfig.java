package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.model.Launch;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

@Configuration
public class BudgetStatementWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<BudgetStatement> budgetStatementWriter(
            @Value("${spring-batch-learning.output}") Resource output
    ) {
        return new FlatFileItemWriterBuilder<BudgetStatement>()
                .name("budgetStatementWriter")
                .resource(output)
                .lineAggregator(lineAggregator())
                .build();
    }

    private LineAggregator<BudgetStatement> lineAggregator() {
        return new LineAggregator<BudgetStatement>() {
            @Override
            public String aggregate(BudgetStatement budgetStatement) {
                String formatBudgetStatement = String.format("[%d] %s - %s\n",
                        budgetStatement.getCodeNatureExpense(),
                        budgetStatement.getDescriptionNatureExpense(),
                        NumberFormat.getCurrencyInstance().format(budgetStatement.getTotalValue()));

                StringBuilder stringBuilder = new StringBuilder();
                for (Launch launch : budgetStatement.getLaunchs()) {
                    stringBuilder.append(String.format("\t [%s] %s - %s\n",
                            new SimpleDateFormat("dd/MM/yyyy").format(launch.getLaunchDate()),
                            launch.getLaunchDescription(),
                            NumberFormat.getCurrencyInstance().format(launch.getLaunchValue())));
                }
                String formatLaunch = stringBuilder.toString();
                return formatBudgetStatement + formatLaunch;
            }
        };
    }

}
