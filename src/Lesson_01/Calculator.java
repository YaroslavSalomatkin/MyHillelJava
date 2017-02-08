package Lesson_01;
import java.util.Scanner;

/**
 * Test header
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input FIRST number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Your input " + firstNumber + " as a first number.");
        System.out.print("Please input SECOND number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Your input " + secondNumber + " as a second number.\n");

        System.out.println("Sum " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("Difference " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("Multiplication " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        if (secondNumber != 0) {
            System.out.println("Division " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else {
            System.out.println("Division error: Second operand is 0!");
        }
    }
}
