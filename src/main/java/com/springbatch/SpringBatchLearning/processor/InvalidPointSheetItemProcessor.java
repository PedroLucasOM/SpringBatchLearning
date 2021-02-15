package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.Employee;
import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.item.ItemProcessor;

public class InvalidPointSheetItemProcessor implements ItemProcessor<Employee, PointSheet> {

    @Override
    public PointSheet process(Employee employee) throws Exception {
        PointSheet pointSheet = new PointSheet();
        pointSheet.setRegistration(employee.getRegistration());
        return pointSheet;
    }

}