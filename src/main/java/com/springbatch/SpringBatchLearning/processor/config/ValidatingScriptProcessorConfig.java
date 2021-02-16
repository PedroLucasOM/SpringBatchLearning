package com.springbatch.SpringBatchLearning.processor.config;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ScriptItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptProcessorConfig {

    @Bean
    public ItemProcessor<Client, Client> validatingScriptProcessor() {
        return new ScriptItemProcessorBuilder<Client, Client>()
                .language("javascript")
                .scriptSource("function process(item) { return item; } process(item);")
                .build();
    }

}
