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

public class AddCalculatorTest {

    @Mock
    private InputValidator inputValidator;

    private AddCalculator addCalculator;

    @Before
    public void setUp() {
        initMocks(this);
        addCalculator = new AddCalculator();
        addCalculator.setInputValidator(inputValidator);
    }

    @Test
    public void shouldReturnPlusResultWhenPassedValidate() {
        given(inputValidator.validInput(anyString(), anyString())).willReturn(true);
        assertThat(addCalculator.add("12", "23"), is("35"));
    }

    @Test
    public void shouldReturnErrorWhenValidationFailure() {
        given(inputValidator.validInput(anyString(), anyString())).willReturn(false);
        assertThat(addCalculator.add("100", "23"), is("Error"));
        assertThat(addCalculator.add("a", "23"), is("Error"));
    }
}
