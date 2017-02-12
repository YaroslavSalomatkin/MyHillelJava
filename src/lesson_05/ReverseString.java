package lesson_05;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your string: ");
        String string = scanner.next();

        System.out.println("Reverse Your string: " + stringReverse(string));
        System.out.println("Reverse with StringBuilder: " + stringReverseWithStringBuilder(string));
    }

    private static String stringReverse(String string) {
        String newString = "";
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            newString = array[i] + newString;
        }
        return newString;
    }

    private static String stringReverseWithStringBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
