package com.springbatch.SpringBatchLearning.reader;

import com.springbatch.SpringBatchLearning.model.BudgetStatement;
import com.springbatch.SpringBatchLearning.model.Launch;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;

@RequiredArgsConstructor
public class BudgetStatementReader implements ItemStreamReader<Object> {

    private Object currentObject;

    @NonNull
    private JdbcCursorItemReader<Object> delegate;

    @Override
    public Object read() throws Exception {
        if (currentObject == null) {
            currentObject = delegate.read();
        }

        Launch launch = (Launch) currentObject;
        BudgetStatement budgetStatement = null;

        if (launch != null) {
            budgetStatement = new BudgetStatement();
            budgetStatement.setCodeNatureExpense(launch.getCodeNatureExpense());
            budgetStatement.setDescriptionNatureExpense(launch.getDescriptionNatureExpense());
            budgetStatement.setTotalValue(launch.getLaunchValue());
            budgetStatement.getLaunchs().add(launch);

            currentObject = null;

            while (true) {
                peek();
                if (currentObject != null) {
                    Launch nextLaunch = (Launch) currentObject;
                    if (budgetStatement.getCodeNatureExpense().equals(nextLaunch.getCodeNatureExpense())) {
                        budgetStatement.getLaunchs().add(nextLaunch);
                        budgetStatement.setTotalValue(Double.sum(budgetStatement.getTotalValue(), nextLaunch.getLaunchValue()));
                    } else {
                        break;
                    }
                } else {
                    break;
                }

            }
        }

        return budgetStatement;
    }

    private Object peek() throws Exception {
        currentObject = delegate.read();
        return currentObject;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        delegate.open(executionContext);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        delegate.update(executionContext);
    }

    @Override
    public void close() throws ItemStreamException {
        delegate.close();
    }
}
