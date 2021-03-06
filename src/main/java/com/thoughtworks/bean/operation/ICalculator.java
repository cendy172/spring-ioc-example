package com.thoughtworks.bean.operation;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.bean.validator.InputValidator;

public abstract class ICalculator {

    @Autowired
    protected InputValidator inputValidator;

    protected ICalculator() {
        System.out.println("---- ICalculator constructor called");
    }

    public abstract String operate(String a, String b);

    public String add(String a, String b) {
        if (inputValidator.validInput(a, b)) {
            return operate(a, b);
        }
        return "Error";
    }

    public void setInputValidator(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }
}
