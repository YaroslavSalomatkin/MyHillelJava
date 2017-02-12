package lesson_05;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        String number = scanner.next();

        if (isPalindrome(number)) {
            System.out.println("Your number " + number + " is palindrome");
        } else {
            System.out.println("Your number " + number + " is not palindrome");
        }
    }

    private static boolean isPalindrome(String number) {
        char[] array = number.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length-1 - i]) {
                return false;
            }
        }
        return true;
    }
}
