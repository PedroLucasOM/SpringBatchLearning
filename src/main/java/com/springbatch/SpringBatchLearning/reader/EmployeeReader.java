package com.springbatch.SpringBatchLearning.reader;

import com.springbatch.SpringBatchLearning.model.Employee;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;

public class EmployeeReader implements ItemStreamReader<Employee> {

    private Employee currentEmployee;
    private JdbcCursorItemReader<Employee> delegate;

    public EmployeeReader(JdbcCursorItemReader<Employee> delegate) {
        this.delegate = delegate;
    }

    @Override
    public Employee read() throws Exception {
        if (currentEmployee == null)
            currentEmployee = delegate.read();

        Employee employee = currentEmployee;

        if (currentEmployee != null) {
            if (currentEmployee.getDate() != null)
                employee.getPointRegistry().add(currentEmployee.getDate());


            Employee nextEmployee = peek();
            while (nextEmployee != null && nextEmployee.getRegistration() == employee.getRegistration()) {
                employee.getPointRegistry().add(nextEmployee.getDate());
                nextEmployee = peek();
            }
        }
        return employee;
    }

    private Employee peek() throws Exception {
        currentEmployee = delegate.read();
        return currentEmployee;
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
