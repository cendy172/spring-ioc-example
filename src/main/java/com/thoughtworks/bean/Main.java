package com.thoughtworks.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        CalculatorClient calculatorClient = (CalculatorClient)applicationContext.getBean("calculatorClient");

        System.out.println(calculatorClient.add("12", "35"));
        System.out.println(calculatorClient.add("112", "35"));
        System.out.println(calculatorClient.plus("12", "35"));
        System.out.println(calculatorClient.plus("112", "35"));
    }

}
