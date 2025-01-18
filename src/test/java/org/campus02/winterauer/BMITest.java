package org.campus02.winterauer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BMITest {

    @BeforeEach
    public void setUp() {

    }

    @Test
    void testConstructor() {
        String expectedFirstName = "Hermann";
        String expectedLastName = "Maier";
        int expectedHeight = 185;
        double expectedWeight = 95;
        char expectedGender = 'M';

        BMICalculator bmiCalculator = new BMICalculator(expectedFirstName, expectedLastName, expectedHeight, expectedWeight, expectedGender);

        Assertions.assertEquals(expectedFirstName, bmiCalculator.getFirstName());
        Assertions.assertEquals(expectedLastName, bmiCalculator.getLastName());
        Assertions.assertEquals(expectedHeight, bmiCalculator.getBodyHeight());
        Assertions.assertEquals(expectedWeight, bmiCalculator.getBodyWeight());
        Assertions.assertEquals(expectedGender, bmiCalculator.getGender());
    }
}
