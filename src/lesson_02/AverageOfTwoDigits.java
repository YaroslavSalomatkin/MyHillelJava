package lesson_02;

import java.util.Scanner;

public class AverageOfTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int firstOperand = scanner.nextInt();
        System.out.print("Enter second operand: ");
        int secondOperand = scanner.nextInt();
        System.out.println("\nAverage of two digits " + firstOperand + " and " + secondOperand + " = " + (firstOperand+secondOperand)/2.0);
    }
}
