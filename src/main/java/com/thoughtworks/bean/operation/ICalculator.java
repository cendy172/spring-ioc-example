package com.thoughtworks.bean.operation;

import com.thoughtworks.bean.validator.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ICalculator {

    @Autowired
    private InputValidator inputValidator;

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
