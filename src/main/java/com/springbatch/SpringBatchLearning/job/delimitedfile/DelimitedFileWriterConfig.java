package com.springbatch.SpringBatchLearning.job.delimitedfile;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class DelimitedFileWriterConfig {

    @StepScope
    @Bean
    public FlatFileItemWriter<Client> delimitedFileWriter(
            @Value("file:${spring-batch-learning.output-folder}delimitedFile.txt") Resource output
    ) {
        return new FlatFileItemWriterBuilder<Client>()
                .name("delimitedFileWriter")
                .resource(output)
                .delimited()
                .delimiter(";")
                .names("name", "nickname", "age", "email", "salaryRange")
                .build();
    }

}
