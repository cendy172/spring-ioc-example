package com.thoughtworks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import com.thoughtworks.bean.validator.InputValidator;

@Configuration
public class Config {

    @Bean
    public InputValidator inputValidator() {
        return new InputValidator();
    }

    @Bean
    public AddCalculator addCalculator() {
        return new AddCalculator();
    }

    @Bean
    public PlusCalculator plusCalculator() {
        return new PlusCalculator();
    }

    @Bean
    public CalculatorClient calculatorClient() {
        return new CalculatorClient();
    }

}
