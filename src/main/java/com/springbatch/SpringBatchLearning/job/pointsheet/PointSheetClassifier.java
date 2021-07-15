package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.Employee;
import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.classify.Classifier;

public class PointSheetClassifier implements Classifier<Employee, ItemProcessor<?, ? extends PointSheet>> {

    private static final long serialVersionUID = 7376045285633686254L;

    @Override
    public ItemProcessor<Employee, PointSheet> classify(Employee employee) {
        if (employee.getPointRegistry().isEmpty()) {
            return new InvalidPointSheetItemProcessor();
        } else {
            return new PointSheetItemProcessor();
        }
    }

}
