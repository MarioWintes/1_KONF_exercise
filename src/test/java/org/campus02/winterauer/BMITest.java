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
    private double expectedBMI;

    @BeforeEach
    public void setUp() {
        expectedFirstName = "Hermann";
        expectedLastName = "Maier";
        expectedHeight = 185;
        expectedWeight = 95;
        expectedGender = 'M';
        expectedBMI = expectedWeight / ((expectedHeight / 100.0) * (expectedHeight / 100.0));
        expectedBMI = Math.round(expectedBMI * 100.0) / 100.0;

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
        Assertions.assertEquals(expectedBMI, bmiCalculator.calculateBMI());
    }

    @Test
    @DisplayName("BMI-Category-Test")
    void testBMICategory() {
        int expectedCategory = 1;
        Assertions.assertEquals(expectedCategory, bmiCalculator.calculateBMICategory());
    }
}
