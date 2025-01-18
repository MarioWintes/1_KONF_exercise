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
        switch (gender) {
            case 'M':
            case 'W':
                this.gender = gender;
                break;
            default:
                this.gender = 'U';
        }
    }

    public double calculateBMI() {
        double bmi = getBodyWeight() / ((getBodyHeight() / 100.0) * (getBodyHeight() / 100.0));
        return Math.round(bmi * 100.0) / 100.0;
    }

    public int calculateBMICategory() {
        double bmi = calculateBMI();
        int category = 0;
        if (gender == 'M') {
            if (bmi < 16.0) {
                category = -2;
            } else if (bmi < 18.4) {
                category = -1;
            } else if (bmi < 24.9) {
                category = 0;
            } else if (bmi < 34.9) {
                category = 1;
            } else {
                category = 2;
            }
        } else if (gender == 'W') {
            if (bmi < 15.0) {
                category = -2;
            } else if (bmi < 17.4) {
                category = -1;
            } else if (bmi < 23.9) {
                category = 0;
            } else if (bmi < 33.9) {
                category = 1;
            } else if (bmi > 33.9) {
                category = 2;
            }
        }
        return category;
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
