package com.springbatch.SpringBatchLearning.job.budgetstatement;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.model.Launch;
import org.springframework.batch.core.annotation.BeforeChunk;
import org.springframework.batch.core.annotation.BeforeWrite;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.*;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Writer;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class CustomMultiBudgetStatementWriter extends MultiResourceItemWriter<BudgetStatement> {

    private ExecutionContext executionContext;
    private BudgetStatement budgetStatement;

    @Value("${spring-batch-learning.output-folder}")
    private String filePath;

    public CustomMultiBudgetStatementWriter(
            FlatFileFooterCallback budgetStatementFooterCallback
    ) {
        setName("customMultiResourceItemWriter");
        setDelegate(budgetStatementWriter(budgetStatementFooterCallback));
        setItemCountLimitPerResource(1);
        setResourceSuffixCreator(suffixCreator());
    }

    @BeforeWrite
    public void beforeWrite(List<BudgetStatement> budgetStatementList) {
        budgetStatement = budgetStatementList.get(0);
        setResource(new FileSystemResource(filePath + budgetStatement.getCodeNatureExpense()));
        open(executionContext);
    }

    @BeforeChunk
    private void beforeChunk(ChunkContext context) {
        executionContext = context.getStepContext().getStepExecution().getExecutionContext();
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        if (budgetStatement != null) {
            super.open(executionContext);
        }
    }

    private ResourceSuffixCreator suffixCreator() {
        return new ResourceSuffixCreator() {
            @Override
            public String getSuffix(int i) {
                return ".txt";
            }
        };
    }

    private FlatFileItemWriter<BudgetStatement> budgetStatementWriter(
            FlatFileFooterCallback budgetStatementFooterCallback
    ) {
        return new FlatFileItemWriterBuilder<BudgetStatement>()
                .name("budgetStatementWriter")
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
