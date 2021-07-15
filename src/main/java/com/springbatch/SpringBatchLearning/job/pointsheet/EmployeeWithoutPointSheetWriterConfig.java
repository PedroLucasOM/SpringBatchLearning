package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class EmployeeWithoutPointSheetWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<PointSheet> employeeWithoutPointSheetWriter(
            @Value("file:${spring-batch-learning.output-folder}employeeWithoutPointSheet.txt") Resource output
    ) {
        return new FlatFileItemWriterBuilder<PointSheet>()
                .name("employeeWithoutPointSheetWriter")
                .resource(output)
                .delimited()
                .names("registration")
                .build();
    }

}
