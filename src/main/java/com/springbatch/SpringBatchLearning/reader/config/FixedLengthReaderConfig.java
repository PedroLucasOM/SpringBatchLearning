package com.springbatch.SpringBatchLearning.reader.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class FixedLengthReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader<Client> fixedLengthReader(
            @Value("#{jobParameters['clientsFile']}") Resource clientsFile
    ) {
        return new FlatFileItemReaderBuilder<Client>()
                .name("fixedLengthReader")
                .resource(clientsFile)
                .fixedLength()
                .columns(new Range[]{new Range(1, 10), new Range(11, 20), new Range(21, 23), new Range(24, 43)})
                .names(new String[]{"name", "nickname", "age", "email"})
                .targetType(Client.class)
                .build();
    }

}
