package com.thoughtworks.bean;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorClientTest {

    private CalculatorClient calculatorClient;

    @Before
    public void setUp() {
        calculatorClient = new CalculatorClient();
    }

    @Test
    public void shouldAdd() {
        assertThat(calculatorClient.add("23", "12"), is("35"));
        assertThat(calculatorClient.add("123", "12"), is("Error"));
    }

    @Test
    public void shouldPlus() {
        assertThat(calculatorClient.plus("23", "12"), is("2312"));
        assertThat(calculatorClient.plus("123", "12"), is("Error"));
    }
}