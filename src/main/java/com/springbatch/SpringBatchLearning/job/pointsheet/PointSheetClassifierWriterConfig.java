package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointSheetClassifierWriterConfig {

    @Bean
    public ClassifierCompositeItemWriter<PointSheet> pointSheetClassifier(
            @Qualifier("employeeWithoutPointSheetWriter") FlatFileItemWriter<PointSheet> employeeWithoutPointSheetWriter,
            CompositeItemWriter<PointSheet> pointSheetCompositeWriter
    ) {
        return new ClassifierCompositeItemWriterBuilder<PointSheet>()
                .classifier(classifier(employeeWithoutPointSheetWriter, pointSheetCompositeWriter))
                .build();
    }

    private Classifier<PointSheet, ItemWriter<? super PointSheet>> classifier(FlatFileItemWriter<PointSheet> employeeWithoutPointSheetFileWriter, CompositeItemWriter<PointSheet> pointSheetCompositeWriter) {
        return new Classifier<PointSheet, ItemWriter<? super PointSheet>>() {
            @Override
            public ItemWriter<? super PointSheet> classify(PointSheet pointSheet) {
                if (pointSheet.getRegistryPoints().isEmpty()) {
                    return employeeWithoutPointSheetFileWriter;
                } else {
                    return pointSheetCompositeWriter;
                }
            }
        };
    }

}
