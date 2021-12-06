package com.dz;

public class Calculator {
    double c1;
    double c2;
    String operation;

    public Calculator() {
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    double Calculate() { // калькулятор
        switch (operation) {
            case "+" -> {
                return c1 + c2;
            }
            case "-" -> {
                return c1 - c2;
            }
            case "*" -> {
                return c1 * c2;
            }
            case "/" -> {
                if (c2 != 0)
                   return (double)(c1 / c2);
                else {
                    return -1;
                }
            }
            default -> {
                return -1;
            }
        }
    }
}
