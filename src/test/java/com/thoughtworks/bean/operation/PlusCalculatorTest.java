package com.thoughtworks.bean.operation;

import com.thoughtworks.bean.validator.InputValidator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class PlusCalculatorTest {

    @Mock
    private InputValidator inputValidator;

    private PlusCalculator plusCalculator;

    @Before
    public void setUp() {
        initMocks(this);
        plusCalculator = new PlusCalculator();
        plusCalculator.setInputValidator(inputValidator);
    }

    @Test
    public void shouldReturnPlusResultWhenPassValidate() {
        given(inputValidator.validInput(anyString(), anyString())).willReturn(true);
        assertThat(plusCalculator.add("12", "23"), is("1223"));
    }

    @Test
    public void shouldReturnErrorWhenValidateFailure() {
        given(inputValidator.validInput(anyString(), anyString())).willReturn(false);
        assertThat(plusCalculator.add("100", "23"), is("Error"));
        assertThat(plusCalculator.add("a", "23"), is("Error"));
    }
}