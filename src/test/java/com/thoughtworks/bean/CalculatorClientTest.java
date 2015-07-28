package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class CalculatorClientTest {

    @Mock
    private AddCalculator addCalculator;

    @Mock
    private PlusCalculator plusCalculator;

    private CalculatorClient calculatorClient;

    @Before
    public void setUp() {
        initMocks(this);
        calculatorClient = new CalculatorClient();
        calculatorClient.setAddCalculator(addCalculator);
        calculatorClient.setPlusCalculator(plusCalculator);
    }

    @Test
    public void shouldAdd() {
        given(addCalculator.add(anyString(), anyString())).willReturn("35");
        assertThat(calculatorClient.add("23", "12"), is("35"));
        given(addCalculator.add(anyString(), anyString())).willReturn("Error");
        assertThat(calculatorClient.add("123", "12"), is("Error"));
    }

    @Test
    public void shouldPlus() {
        given(plusCalculator.add(anyString(), anyString())).willReturn("2312");
        assertThat(calculatorClient.plus("23", "12"), is("2312"));

        given(plusCalculator.add(anyString(), anyString())).willReturn("Error");
        assertThat(calculatorClient.plus("123", "12"), is("Error"));
    }
}