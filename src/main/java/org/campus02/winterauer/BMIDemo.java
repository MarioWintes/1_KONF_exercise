package org.campus02.winterauer;

import java.lang.Math;


public class BMIDemo {

    public static void main(String[] args) {

        BMICalculator calculator = new BMICalculator("Hermann", "Mann", 170, 40.0, 'M');

//        System.out.println(Math.round((calculator.calculateBMI()) * 100.0) / 100.0);
        System.out.println(calculator.calculateBMI());
        System.out.println(calculator.calculateBMICategory());
    }

}
