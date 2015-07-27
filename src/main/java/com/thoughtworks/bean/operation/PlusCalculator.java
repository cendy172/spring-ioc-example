package com.thoughtworks.bean.operation;

public class PlusCalculator extends ICalculator {
    public PlusCalculator() {
    }

    @Override
    public String operate(String a, String b) {
        return a + b;
    }
}
