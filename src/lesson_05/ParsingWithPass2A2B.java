package lesson_05;

import java.util.Scanner;

public class ParsingWithPass2A2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter unit (kg, gr): ");
        String units = scanner.next();
        System.out.println("Result: " + resultWeightString(weight, units));
    }

    private static String resultWeightString(double weight, String units) {
        String resultString = "";
        int tons;
        int kilograms;
        if (units.equals("kg")) {
            tons = (int) weight / 1000;
            kilograms = (int) (weight % 1000);
            if (tons > 0) {
                resultString += tons + " tons ";
            }
            if (kilograms > 0) {
                resultString += kilograms + " kilograms ";
            }
            if (numberNotInteger(weight)) {
                resultString += (int) ((weight - (int) weight) * 1000) + " grams";
            }

        } else if (units.equals("gr")) {
            tons = (int) weight / 1000000;
            kilograms = (int) (weight / 1000 % 1000);
            int grams = (int) (weight % 1000);
            if (tons > 0) {
                resultString = tons + " tons ";
            }
            if (kilograms > 0) {
                resultString += kilograms + " kilograms ";
            }
            if (grams > 0) {
                resultString += grams + " grams ";
            }

            if (numberNotInteger(weight)) {
                resultString += (int) ((weight - (int) weight) * 1000) + " micrograms";
            }
        } else {
            resultString = "unknown result! Units is invalid!";
        }
        return resultString;
    }

    private static boolean numberNotInteger(double weight) {
        return ((weight - (int) weight) != 0);
    }
}
