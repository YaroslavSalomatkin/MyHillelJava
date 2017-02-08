package lesson_04;

import java.math.BigInteger;
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
        System.out.print("\nNumber " + index + " in the sequence Fibonacci = " + fibonacciRecursion(index, BigInteger.ZERO, BigInteger.ONE));
    }

    private static BigInteger fibonacciRecursion(int index, BigInteger a, BigInteger b) {
        if (index == 0) {
            return a;
        } else {
            return fibonacciRecursion(index - 1, b, a.add(b));
        }
    }
}
