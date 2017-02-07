package Lesson_02;

import java.util.Scanner;

public class MultiplesDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.print("Your number \"" + number + "\" multiples:  ");
        for (int count = 1; count <= number/2; count++) {
            if (number % count == 0) {
                System.out.print(count + ", ");
            }
        }
        System.out.print(number);
    }
}
