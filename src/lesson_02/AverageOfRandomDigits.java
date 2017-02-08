package lesson_02;

import java.util.Scanner;

public class AverageOfRandomDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will be? - ");
        int numbers = scanner.nextInt();
        int sum = 0;
        for (int count = 0; count < numbers; count++) {
            System.out.print("Enter operand: ");
            int operand = scanner.nextInt();
            sum += operand;
        }

        System.out.println("\nAverage of " + numbers + " digits = " + (sum/(double)numbers));
    }
}
