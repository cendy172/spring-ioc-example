package com.thoughtworks.bean.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class InputValidator {

    private static final int MAX_LENGTH = 3;
    private int number = 0;

    public InputValidator() {
        System.out.println("--- InputValidator created");
    }

    public boolean validInput(String a, String b) {
        return StringUtils.isNumeric(a) && StringUtils.isNumeric(b) && a.length() < MAX_LENGTH && b.length() < MAX_LENGTH;
    }

    public void add() {
        number = number + 1;
    }

    public int getNumber() {
        return number;
    }
}
