package org.campus02.winterauer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMITest {

    private BMICalculator person1;
    private BMICalculator person2;
    private BMICalculator person3;
    private BMICalculator person4;
    private BMICalculator person5;

    @BeforeEach
    public void setUp() {
        person1 = new BMICalculator("Hermann", "Maier", 180, 120.0, 'M');
        person2 = new BMICalculator("Herta", "Müller", 170, 70.0, 'W');
        person3 = new BMICalculator("Sabine", "Müller", 170, 60.0, 'W');
        person4 = new BMICalculator("Alex", "Müller", 170, 50.0, 'M');
        person5 = new BMICalculator("Herbert", "Müller", 170, 40.0, 'M');
    }

    @Test
    @DisplayName("Constructor-Test")
    void testConstructor() {
        String expectedFirstName = "Hermann";
        String expectedLastName = "Maier";
        int expectedHeight = 180;
        double expectedWeight = 120;
        char expectedGender = 'M';
        Assertions.assertEquals(expectedFirstName, person1.getFirstName());
        Assertions.assertEquals(expectedLastName, person1.getLastName());
        Assertions.assertEquals(expectedHeight, person1.getBodyHeight());
        Assertions.assertEquals(expectedWeight, person1.getBodyWeight());
        Assertions.assertEquals(expectedGender, person1.getGender());
    }

    @Test
    @DisplayName("BMI-Calculation-Test")
    void testBMICalculation() {
        double expectedBMI1 = Math.round(person1.getBodyWeight() / Math.pow(person1.getBodyHeight() / 100.0, 2) * 100.0) / 100.0;
        double expectedBMI2 = Math.round(person2.getBodyWeight() / Math.pow(person2.getBodyHeight() / 100.0, 2) * 100.0) / 100.0;
        double expectedBMI3 = Math.round(person3.getBodyWeight() / Math.pow(person3.getBodyHeight() / 100.0, 2) * 100.0) / 100.0;
        double expectedBMI4 = Math.round(person4.getBodyWeight() / Math.pow(person4.getBodyHeight() / 100.0, 2) * 100.0) / 100.0;
        double expectedBMI5 = Math.round(person5.getBodyWeight() / Math.pow(person5.getBodyHeight() / 100.0, 2) * 100.0) / 100.0;


        Assertions.assertEquals(expectedBMI1, person1.calculateBMI());
        Assertions.assertEquals(expectedBMI2, person2.calculateBMI());
        Assertions.assertEquals(expectedBMI3, person3.calculateBMI());
        Assertions.assertEquals(expectedBMI4, person4.calculateBMI());
        Assertions.assertEquals(expectedBMI5, person5.calculateBMI());
    }

    @Test
    @DisplayName("BMI-Category-Test")
    void testBMICategory() {
        int expectedCategory1 = 2;
        int expectedCategory2 = 1;
        int expectedCategory3 = 0;
        int expectedCategory4 = -1;
        int expectedCategory5 = -2;
        Assertions.assertEquals(expectedCategory1, person1.calculateBMICategory());
        Assertions.assertEquals(expectedCategory2, person2.calculateBMICategory());
        Assertions.assertEquals(expectedCategory3, person3.calculateBMICategory());
        Assertions.assertEquals(expectedCategory4, person4.calculateBMICategory());
        Assertions.assertEquals(expectedCategory5, person5.calculateBMICategory());
    }

    @Test
    @DisplayName("BMI-Category-Name-Test")
    void testBMICategoryName() {
        String expectedCategoryName1 = "Sehr starkes Übergewicht";
        String expectedCategoryName2 = "Übergewicht";
        String expectedCategoryName3 = "Normalgewicht";
        String expectedCategoryName4 = "Untergewicht";
        String expectedCategoryName5 = "Sehr starkes Untergewicht";

        Assertions.assertEquals(expectedCategoryName1, person1.getBMICategoryName());
        Assertions.assertEquals(expectedCategoryName2, person2.getBMICategoryName());
        Assertions.assertEquals(expectedCategoryName3, person3.getBMICategoryName());
        Assertions.assertEquals(expectedCategoryName4, person4.getBMICategoryName());
        Assertions.assertEquals(expectedCategoryName5, person5.getBMICategoryName());
    }
}
