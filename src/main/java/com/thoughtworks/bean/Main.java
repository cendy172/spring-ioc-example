package com.thoughtworks.bean;

public class Main {

    private static CalculatorClient calculatorClient;

    public static void main(String[] args) {
        calculatorClient = new CalculatorClient();

        System.out.println(calculatorClient.add("12", "35"));
        System.out.println(calculatorClient.add("112", "35"));
        System.out.println(calculatorClient.plus("12", "35"));
        System.out.println(calculatorClient.plus("112", "35"));
    }

}
