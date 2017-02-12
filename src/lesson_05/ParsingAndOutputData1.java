package lesson_05;

import java.util.Scanner;

public class ParsingAndOutputData1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in gramme: ");
        double weight = scanner.nextDouble();
        System.out.println("Result: " + resultWeightString(weight));
    }

    private static String resultWeightString(double weight) {
        String resultWeightString;

        if (weight - (int) weight == 0) {
            resultWeightString = integerNumber((int) weight);
        } else {
            resultWeightString = integerNumber((int) weight) + (int) ((weight - (int) weight) * 1000) + " micrograms";
        }
        return resultWeightString;
    }

    private static String integerNumber(int weight) {
        if (weight > 1000000) {
            return ((weight / 1000000) + " tons " + (weight / 1000 % 1000) + " kilograms " + (weight % 1000) + " grams ");
        }
        return (weight / 1000) + " kilograms " + (weight % 1000) + " grams ";
    }
}
