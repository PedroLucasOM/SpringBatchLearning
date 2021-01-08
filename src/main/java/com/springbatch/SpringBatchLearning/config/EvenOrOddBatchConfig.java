package com.springbatch.SpringBatchLearning.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@EnableBatchProcessing
@Configuration
public class EvenOrOddBatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job evenOrOdd() {
        return jobBuilderFactory
                .get("evenOrOdd")
                .start(printEvenOrOddStep())
                .build();
    }


    public Step printEvenOrOddStep() {
        return stepBuilderFactory
                .get("printEvenOrOddStep")
                .<Integer, String>chunk(1)
                .reader(countToTenReader())
                .processor(evenOrOddProcessor())
                .writer(printWriter())
                .build();
    }

    private ItemWriter<String> printWriter() {
        return itens -> itens.forEach(System.out::println);
    }

    private FunctionItemProcessor<Integer, String> evenOrOddProcessor() {
        return new FunctionItemProcessor<>
                (item -> item % 2 == 0 ? String.format("Item %s é par", item) : String.format("Item %s é ímpar", item));
    }

    private IteratorItemReader<Integer> countToTenReader() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return new IteratorItemReader<Integer>(numbers.iterator());
    }
}
