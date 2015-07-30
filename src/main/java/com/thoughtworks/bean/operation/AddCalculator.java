package com.thoughtworks.bean.operation;

import org.springframework.stereotype.Component;

@Component
public class AddCalculator extends ICalculator {
    public AddCalculator() {
        System.out.println("----- AddCalculator created");
    }

    @Override
    public String operate(String a, String b) {
        System.out.println("before add number:" + inputValidator.getNumber());
        inputValidator.add();
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }
}
