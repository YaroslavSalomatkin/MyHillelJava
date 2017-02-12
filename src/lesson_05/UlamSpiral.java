package lesson_05;

public class UlamSpiral {
    public static void main(String[] args) {
        int size = 7;
        int[][] arrayUlam = new int[size][size];
        fillingUlamSpiral(arrayUlam, size);
        printUlamSpiral(arrayUlam, size);
    }

    private static void fillingUlamSpiral(int[][] arrayUlam, int size) {
        int count = 0;
        int x = size / 2;
        int y = size / 2;
        arrayUlam[x][y] = count;
        shiftRight(arrayUlam, count, 1, x, y, size);
    }

    private static void shiftRight(int[][] arrayUlam, int count, int steps, int x, int y, int size) {
        for (int i = 0; i < steps; i++) {
            arrayUlam[x][y++] = ++count;
        }
        if (steps < size - 1) {
            shiftUp(arrayUlam, count, steps, x, y, size);
        }
    }

    private static void shiftUp(int[][] arrayUlam, int count, int steps, int x, int y, int size) {
        for (int i = 0; i < steps; i++) {
            arrayUlam[x--][y] = ++count;
        }
        shiftLeft(arrayUlam, count, ++steps, x, y, size);
    }

    private static void shiftLeft(int[][] arrayUlam, int count, int steps, int x, int y, int size) {
        for (int i = 0; i < steps; i++) {
            arrayUlam[x][y--] = ++count;
        }
        shiftDown(arrayUlam, count, steps, x, y, size);
    }

    private static void shiftDown(int[][] arrayUlam, int count, int steps, int x, int y, int size) {
        for (int i = 0; i < steps; i++) {
            arrayUlam[x++][y] = ++count;
        }
            shiftRight(arrayUlam, count, ++steps, x, y, size);
    }

    private static void printUlamSpiral(int[][] arrayUlam, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrayUlam[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
}