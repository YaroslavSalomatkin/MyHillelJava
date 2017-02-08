package Lesson_04;

import java.util.Scanner;

public class NumberOfFibonacciInRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index number in the sequence Fibonacci: ");
        int index = scanner.nextInt();
        while (index <= 0) {
            System.out.print("Incorrect! Try again: ");
            index = scanner.nextInt();
        }
        System.out.print("\nNumber " + index + " in the sequence Fibonacci = " + fibonacciRecursion(index));
    }

    private static int fibonacciRecursion(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fibonacciRecursion(index - 1) + fibonacciRecursion(index - 2);
    }
}
