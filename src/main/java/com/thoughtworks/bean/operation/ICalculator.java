package com.thoughtworks.bean.operation;

import com.thoughtworks.bean.validator.InputValidator;

public abstract class ICalculator {

    private InputValidator inputValidator;

    protected ICalculator() {
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
