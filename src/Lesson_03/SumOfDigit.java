package Lesson_03;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int sum = 0;
        int number = scanner.nextInt();
        if (number < 0) {
            number = Math.abs(number);
        }
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("\nSum of digits in Your number = " + sum);
    }
}
