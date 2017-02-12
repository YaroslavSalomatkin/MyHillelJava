package lesson_05;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int size = 10;
        int[][] array = new int[size][size];
        randomFillingArray(array, size);
        printArray(array, size);
        System.out.println("\nSum of array elements = " + sumOfArrayElements(array, size));
        System.out.println("Average of array elements = " + averageOfArrayElements(array, size));
        System.out.println("Minimal element in array = " + minimalElement(array, size));
        System.out.println("Maximal element in array = " + maximalElement(array, size));
        System.out.println("Number of positive elements = " + positiveNumbers(array, size));
        System.out.println("Sum of the rows (in order line):   " + sumOfRows(array, size));
    }

    private static String sumOfRows(int[][] array, int size) {
        String sumOfTheRows = "";
        int rowSum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rowSum += array[i][j];
            }
            sumOfTheRows += rowSum + "    ";
            rowSum=0;
        }
        return sumOfTheRows;
    }

    private static int positiveNumbers(int[][] array, int size) {
        int countPositiveNumbers = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] > 0) {
                    countPositiveNumbers++;
                }
            }
        }
        return countPositiveNumbers;
    }

    private static int maximalElement(int[][] array, int size) {
        int maximal = array[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] > maximal) {
                    maximal = array[i][j];
                }
            }
        }
        return maximal;
    }

    private static int minimalElement(int[][] array, int size) {
        int minimal = array[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] < minimal) {
                    minimal = array[i][j];
                }
            }
        }
        return minimal;
    }

    private static double averageOfArrayElements(int[][] array, int size) {
        int count = size * size;
        return sumOfArrayElements(array, size) / (double) count;
    }

    private static int sumOfArrayElements(int[][] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void randomFillingArray(int[][] array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(41) - 20;
            }
        }
    }
}
