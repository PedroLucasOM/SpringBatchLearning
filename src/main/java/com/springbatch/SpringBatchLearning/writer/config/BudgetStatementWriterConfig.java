package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.model.Launch;
import com.springbatch.SpringBatchLearning.util.Util;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.*;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.builder.MultiResourceItemWriterBuilder;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.Writer;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class BudgetStatementWriterConfig {

    @Value("${spring-batch-learning.output-folder}")
    private String relativeOutput;

    @StepScope
    @Bean
    public MultiResourceItemWriter<BudgetStatement> budgetStatementMultiWriter(
            @Value("file:${spring-batch-learning.output-folder}/budgetStatement") Resource resource,
            FlatFileFooterCallback budgetStatementFooterCallback
    ) {
        Util.verifyOutputDirectory(resource, relativeOutput);

        return new MultiResourceItemWriterBuilder<BudgetStatement>()
                .name("budgetStatementMultiWriter")
                .resource(resource)
                .delegate(budgetStatementWriter(resource, budgetStatementFooterCallback))
                .resourceSuffixCreator(suffixCreator())
                .itemCountLimitPerResource(1)
                .build();
    }

    private ResourceSuffixCreator suffixCreator() {
        return new ResourceSuffixCreator() {
            @Override
            public String getSuffix(int i) {
                return i + ".txt";
            }
        };
    }

    private FlatFileItemWriter<BudgetStatement> budgetStatementWriter(
            Resource resource,
            FlatFileFooterCallback budgetStatementFooterCallback
    ) {
        return new FlatFileItemWriterBuilder<BudgetStatement>()
                .name("budgetStatementWriter")
                .resource(resource)
                .lineAggregator(lineAggregator())
                .headerCallback(headerCallback())
                .footerCallback(budgetStatementFooterCallback)
                .build();
    }

    private FlatFileHeaderCallback headerCallback() {
        return new FlatFileHeaderCallback() {
            @Override
            public void writeHeader(Writer writer) throws IOException {
                writer.append(String.format("SISTEMA INTEGRADO: XPTO \t\t\t\t DATA: %s\n", new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
                writer.append(String.format("MÓDULO: ORÇAMENTO \t\t\t\t\t\t HORA: %s\n", new SimpleDateFormat("HH:MM").format(new Date())));
                writer.append(String.format("\t\t\tDEMONSTRATIVO ORÇAMENTÁRIO\n"));
                writer.append("-------------------------------------------------------------------\n");
                writer.append("CODIGO NOME VALOR\n");
                writer.append(String.format("\t Data Descricao Valor\n"));
                writer.append("-------------------------------------------------------------------");
            }
        };
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
