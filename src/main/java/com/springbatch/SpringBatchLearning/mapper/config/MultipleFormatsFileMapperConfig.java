package com.springbatch.SpringBatchLearning.mapper.config;

import com.springbatch.SpringBatchLearning.model.Client;
import com.springbatch.SpringBatchLearning.model.Transaction;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MultipleFormatsFileMapperConfig {

    @Bean
    public PatternMatchingCompositeLineMapper lineMapper() {
        PatternMatchingCompositeLineMapper patternMatchingCompositeLineMapper = new PatternMatchingCompositeLineMapper();
        patternMatchingCompositeLineMapper.setTokenizers(tokenizers());
        patternMatchingCompositeLineMapper.setFieldSetMappers(fieldSetMappers());
        return patternMatchingCompositeLineMapper;
    }

    private Map<String, FieldSetMapper> fieldSetMappers() {
        Map<String, FieldSetMapper> fieldSetMapperMap = new HashMap<>();
        fieldSetMapperMap.put("0*", fieldSetMapper(Client.class));
        fieldSetMapperMap.put("1*", fieldSetMapper(Transaction.class));
        return fieldSetMapperMap;
    }

    private FieldSetMapper fieldSetMapper(Class classReference) {
        BeanWrapperFieldSetMapper fieldSetMapper = new BeanWrapperFieldSetMapper();
        fieldSetMapper.setTargetType(classReference);
        return fieldSetMapper;
    }

    private Map<String, LineTokenizer> tokenizers() {
        Map<String, LineTokenizer> lineTokenizerMap = new HashMap<>();
        lineTokenizerMap.put("0*", clientLineTokenizer());
        lineTokenizerMap.put("1*", transactionLineTokenizer());
        return lineTokenizerMap;
    }

    private LineTokenizer transactionLineTokenizer() {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setNames("id", "description", "value");
        delimitedLineTokenizer.setIncludedFields(1, 2, 3);
        return delimitedLineTokenizer;
    }

    private LineTokenizer clientLineTokenizer() {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setNames("name", "nickname", "age", "email");
        delimitedLineTokenizer.setIncludedFields(1, 2, 3, 4);
        return delimitedLineTokenizer;
    }

}
