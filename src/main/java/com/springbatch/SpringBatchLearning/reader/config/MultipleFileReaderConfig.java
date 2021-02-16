package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.reader.MultipleLineFileReader;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

@Configuration
public class MultipleFileReaderConfig {

    @Value("${spring-batch-learning.input-folder}")
    private String outputFolderPath;

    @StepScope
    @Bean
    public MultiResourceItemReader<Object> multipleFileReader(
            FlatFileItemReader<Object> multipleFormatsFileReader
    ) throws IOException {
        ResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = patternResolver
                .getResources("file:" + outputFolderPath + "clients-multiple-file*.txt");

        return new MultiResourceItemReaderBuilder<>()
                .name("multipleFileReader")
                .resources(resources)
                .delegate(new MultipleLineFileReader(multipleFormatsFileReader))
                .build();
    }

}
