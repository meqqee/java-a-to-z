package ru.asemenchenko.lessons;

/**
 * Created by meqqee on 14.10.16.
 */
public class Calculator {
    private double result = 0.0;

    public void division(double dividend, double divided) {
        if (divided == 0) {
            System.out.println("Divided can't be 0");
        } else {
            this.result = dividend / divided;
        }
    }

    public void addition(double augent, double addend) {
        this.result = augent + addend;
    }

    public void multiplication(double multiplicand, double multiplier) {
        this.result = multiplicand * multiplier;
    }

    public void substraction(double minuend, double subtrahend) {
        this.result = minuend - subtrahend;
    }

    public double getResult() {
        return result;
    }
}
