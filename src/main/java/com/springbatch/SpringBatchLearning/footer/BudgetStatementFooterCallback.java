package com.springbatch.SpringBatchLearning.footer;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import org.springframework.batch.core.annotation.AfterChunk;
import org.springframework.batch.core.annotation.BeforeWrite;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.item.file.FlatFileFooterCallback;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Writer;
import java.text.NumberFormat;
import java.util.List;

@Component
public class BudgetStatementFooterCallback implements FlatFileFooterCallback {
    private Double totalValue = 0.0;

    @Override
    public void writeFooter(Writer writer) throws IOException {
        writer.append("\n");
        writer.append(
                String.format("\t\t\t\t\t\t\t Total: %s\n", NumberFormat.getCurrencyInstance().format(totalValue))
        );
        writer.append(String.format("\t\t\t\t\t\t\t Código de Autenticação: %s\n", "d41d8cd98f00b204e9800998ecf8427e"));
    }

    @BeforeWrite
    public void beforeWrite(List<BudgetStatement> budgetStatementList) {
        for (BudgetStatement budgetStatement : budgetStatementList) {
            totalValue += budgetStatement.getTotalValue();
        }
    }

    @AfterChunk
    public void afterChunk(ChunkContext context) {
        totalValue = 0.0;
    }
}
