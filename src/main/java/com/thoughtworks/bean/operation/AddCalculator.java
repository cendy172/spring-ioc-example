package com.thoughtworks.bean.operation;

import org.apache.commons.lang3.StringUtils;

public class AddCalculator {

    public String add(String a, String b) {
        boolean invalidInput = !StringUtils.isNumeric(a) || !StringUtils.isNumeric(b) || a.length() > 2 || b.length() > 2;
        if (invalidInput) {
            return "Error";
        }
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }
}
