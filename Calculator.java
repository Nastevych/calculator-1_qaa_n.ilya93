package com.calculatorNastevychQaa;

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
            } catch (NumberFormatException er) {
                System.err.println("Wrong input data!");
            } catch (UnsupportedOperationException ex) {
                System.err.println("The operation is not supported!");}
        }
        }

        private double calculationStep () throws NumberFormatException {
            System.out.println("Enter first number:");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter second number:");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter operation to perform (only '+, -, *, /' is available):");
            operation = scanner.nextLine();

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

    private double plus(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
    private  double minus(double firstNumber, double secondNumber){
        return  firstNumber - secondNumber;
    }
    private  double multiply(double firstNumber, double secondNumber){
        return  firstNumber * secondNumber;
    }
    private  double divide(double firstNumber, double secondNumber){
        return  firstNumber / secondNumber;
    }
}
