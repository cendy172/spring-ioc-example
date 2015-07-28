package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorClient {
    @Autowired
    private AddCalculator addCalculator;
    @Autowired
    private PlusCalculator plusCalculator;

    public CalculatorClient() {
        System.out.println("---- CalculatorClient created");
    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }

    public void setAddCalculator(AddCalculator addCalculator) {
        this.addCalculator = addCalculator;
    }

    public void setPlusCalculator(PlusCalculator plusCalculator) {
        this.plusCalculator = plusCalculator;
    }
}
