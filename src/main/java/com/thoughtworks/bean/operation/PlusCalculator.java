package com.thoughtworks.bean.operation;

import org.springframework.stereotype.Component;

@Component
public class PlusCalculator extends ICalculator {
    public PlusCalculator() {
        System.out.println("----- PlusCalculator created");
    }

    @Override
    public String operate(String a, String b) {
        System.out.println("number:" + inputValidator.getNumber());
        return a + b;
    }
}
