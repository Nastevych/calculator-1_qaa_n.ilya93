package com.calculatorNastevychQaa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate() {
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
            }
        }
    }

        private double calculationStep () throws InputMismatchException {
            System.out.println("Enter first number or q if you want to quit:");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter operation to perform (only '+, -, *, /' is available):");
            operation = scanner.nextLine();

            System.out.println("Enter second number:");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            return performOperation(firstNumber, secondNumber);
        }


    private double performOperation(double firstNumber, double secondNumber) {
        double result;

        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = divide(firstNumber, secondNumber);
                break;
            default:
                throw new UnsupportedOperationException(String.format("The operation '%s' is not supported", operation));
        }
        System.out.println("Result:");
        return result;
    }

    private double plus(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }
    private  double minus(double numberOne, double numberTwo){
        return  numberOne - numberTwo;
    }
    private  double multiply(double numberOne, double numberTwo){
        return  numberOne * numberTwo;
    }
    private  double divide(double numberOne, double numberTwo){
        return  numberOne / numberTwo;
    }
}
