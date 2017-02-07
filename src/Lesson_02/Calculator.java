package Lesson_02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        System.out.print("Please input FIRST operand: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Please input operation: ");
        String operation = correctOperation();

        System.out.print("Please input SECOND operand: ");
        double secondNumber = correctEnteringOperand(operation);

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }

        System.out.print("\n" + correctPrinting(firstNumber) + " " + operation + " " + correctPrinting(secondNumber) + " = " + correctPrinting(result));
    }

    private static double correctEnteringOperand(String operation) {
        Scanner scanner = new Scanner(System.in);
        double operand = scanner.nextDouble();
        if (operation.equals("/") && operand == 0) {
            System.out.print("Operation incorrect! Impossible to divide by \"0\"! Enter correct operand: ");
            operand = scanner.nextDouble();
        }
        return operand;
    }

    private static String correctPrinting(double firstNumber) {
        if (firstNumber != (int) firstNumber) {
            String correctNumber = "" + firstNumber;
            return correctNumber;
        }
        return ("" + (int) firstNumber);
    }

    private static String correctOperation() {
        Scanner operation = new Scanner(System.in);
        String operator = operation.next();
        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.print("Operator invalid! Operator may be \"+\", \"-\", \"*\" or \"/\" Try again: ");
            operator = operation.next();
        }
        return operator;
    }
}