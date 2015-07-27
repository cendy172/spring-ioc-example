package com.thoughtworks.bean.operation;

import org.apache.commons.lang3.StringUtils;

public abstract class ICalculator {

    public abstract String operate(String a, String b);

    public final String add(String a, String b) {
        boolean invalidInput = !StringUtils.isNumeric(a) || !StringUtils.isNumeric(b) || a.length() > 2 || b.length() > 2;
        if (invalidInput) {
            return "Error";
        }
        return operate(a, b);
    }
}
