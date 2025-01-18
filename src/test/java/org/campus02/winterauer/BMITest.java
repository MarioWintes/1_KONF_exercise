package org.campus02.winterauer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMITest {

    private BMICalculator bmiCalculator;
    private String expectedFirstName;
    private String expectedLastName;
    private int expectedHeight;
    private double expectedWeight;
    private char expectedGender;

    @BeforeEach
    public void setUp() {
        expectedFirstName = "Hermann";
        expectedLastName = "Maier";
        expectedHeight = 185;
        expectedWeight = 95;
        expectedGender = 'M';

        bmiCalculator = new BMICalculator(expectedFirstName, expectedLastName, expectedHeight, expectedWeight, expectedGender);
    }

    @Test
    @DisplayName("Constructor-Test")
    void testConstructor() {
        Assertions.assertEquals(expectedFirstName, bmiCalculator.getFirstName());
        Assertions.assertEquals(expectedLastName, bmiCalculator.getLastName());
        Assertions.assertEquals(expectedHeight, bmiCalculator.getBodyHeight());
        Assertions.assertEquals(expectedWeight, bmiCalculator.getBodyWeight());
        Assertions.assertEquals(expectedGender, bmiCalculator.getGender());
    }

    @Test
    @DisplayName("BMI-Calculation-Test")
    void testBMICalculation() {
        double expectedBMI = expectedWeight / ((expectedHeight / 100.0) * (expectedHeight / 100.0));
        expectedBMI = Math.round(expectedBMI * 100.0) / 100.0;
        Assertions.assertEquals(expectedBMI, bmiCalculator.calculateBMI());

    }
}
