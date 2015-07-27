package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.ICalculator;
import com.thoughtworks.bean.operation.PlusCalculator;

public class CalculatorClient {
    private ICalculator addCalculator;
    private ICalculator plusCalculator;

    public CalculatorClient() {
        addCalculator = new AddCalculator();
        plusCalculator = new PlusCalculator();
    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }
}
