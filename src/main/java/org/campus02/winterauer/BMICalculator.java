package org.campus02.winterauer;

public class BMICalculator {

    private String firstName;
    private String lastName;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMICalculator(String firstName, String lastName, int bodyHeight, double bodyWeight, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public double calculateBMI() {
        return getBodyWeight() / (getBodyHeight() * getBodyHeight());
    }

    public int calculateBMICategory() {
        double bmi = calculateBMI();
        if (gender == 'M') {
            if (bmi < 16.0) {
                return -2;
            } else if (bmi < 18.4) {
                return -1;
            } else if (bmi < 24.9) {
                return 0;
            } else if (bmi < 34.9) {
                return 1;
            } else {
                return 2;
            }
        } else if (gender == 'F') {
            if (bmi < 15.0) {
                return -2;
            } else if (bmi < 17.4) {
                return -1;
            } else if (bmi < 23.9) {
                return 0;
            } else if (bmi < 33.9) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    public String getBMICategoryName() {
        switch (calculateBMICategory()) {
            case -2:
                return "Sehr starkes Untergewicht";
            case -1:
                return "Untergewicht";
            case 0:
                return "Normalgewicht";
            case 1:
                return "Übergewicht";
            case 2:
                return "Sehr starkes Übergewicht";
            default:
                return "??";
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

}
