package com.springbatch.SpringBatchLearning.processor.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ScriptItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatingScriptProcessorConfig {

    @Bean
    public ItemProcessor validatingScriptProcessor() {
        return new ScriptItemProcessorBuilder<>()
                .language("nashorn")
                .scriptSource("var email = item.getEmail();" +
                        "var existsFile = `ls | grep ${email}.txt`;" +
                        "if (!existsFile) item; else null;")
                .build();
    }

}
