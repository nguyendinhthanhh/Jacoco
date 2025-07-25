package com.test.swt302.jacoco;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int addCalculate(int x, int y) {
        return x + y; //Lặp lại logic giống hệt add() → code duplication
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public String evaluateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        }

        if (score >= 90) {
            return "Excellent";
        } else if (score >= 75) {
            return "Good";
        } else if (score >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
