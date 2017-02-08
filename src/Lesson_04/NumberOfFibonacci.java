package Lesson_04;
import java.util.Scanner;

public class NumberOfFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index number in the sequence Fibonacci: ");
        int index = scanner.nextInt();
        while (index <= 0) {
            System.out.print("Incorrect! Try again: ");
            index = scanner.nextInt();
        }

        int[] fibonacciArray = new int[index];
        fibonacciArray[0] = 1;
        if (index > 1) {
            fibonacciArray[1] = 1;
        }

        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
        }

        System.out.print("\nNumber " + index + " in the sequence Fibonacci = " + fibonacciArray[index-1]);
    }
}
