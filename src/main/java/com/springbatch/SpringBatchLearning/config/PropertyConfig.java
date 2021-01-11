package com.springbatch.SpringBatchLearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropertyConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(new FileSystemResource(System.getProperty("user.dir").concat("\\property\\application.properties")));
        return propertySourcesPlaceholderConfigurer;
    }

}
