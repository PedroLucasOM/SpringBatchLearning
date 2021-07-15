package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.Employee;
import com.springbatch.SpringBatchLearning.model.PointSheet;
import com.springbatch.SpringBatchLearning.job.pointsheet.EmployeeReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointSheetStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step pointSheetStep(
            JdbcCursorItemReader<Employee> employeeReader,
            ItemProcessor<Employee, PointSheet> pointSheetProcessor,
            ClassifierCompositeItemWriter<PointSheet> pointSheetClassifier,
            @Qualifier("pointSheetWriter") FlatFileItemWriter<PointSheet> pointSheetWriter,
            @Qualifier("employeeWithoutPointSheetWriter") FlatFileItemWriter<PointSheet> employeeWithoutPointSheetWriter) {

        return stepBuilderFactory
                .get("pointSheetStep")
                .<Employee, PointSheet>chunk(100)
                .reader(new EmployeeReader(employeeReader))
                .processor(pointSheetProcessor)
                .writer(pointSheetClassifier)
                .stream(pointSheetWriter)
                .stream(employeeWithoutPointSheetWriter)
                .build();
    }

}
