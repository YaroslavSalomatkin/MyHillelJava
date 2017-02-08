package lesson_02;

import java.util.Scanner;

public class IsDigitPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Your number " + number + " is prime");
        } else {
            System.out.println("Your number " + number + " is not prime");
        }
    }

    private static boolean isPrime(int num) {
        num = Math.abs(num);
        if (num == 0 || num == 1)
            return false;
        for (int counter = 2; counter < num / 2; counter++) {
            if (num % counter == 0)
                return false;
        }
        return true;
    }
}
