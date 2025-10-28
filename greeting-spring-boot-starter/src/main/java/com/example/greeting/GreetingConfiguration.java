package com.example.greeting;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreetingService.class)
public class GreetingConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    @Bean
    @ConditionalOnMissingBean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
