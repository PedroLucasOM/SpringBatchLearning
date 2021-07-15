package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.Employee;
import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointSheetProcessorConfig {

    @Bean
    public ItemProcessor<Employee, PointSheet> pointSheetProcessor() {
        return new ClassifierCompositeItemProcessorBuilder<Employee, PointSheet>()
                .classifier(new PointSheetClassifier()).build();
    }

}
