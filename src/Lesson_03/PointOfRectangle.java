package Lesson_03;

import java.util.Scanner;

public class PointOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLeftCornerX, upperLeftCornerY, bottomRightCornerX, bottomRightCornerY, pointX, pointY;
        System.out.print("Enter coordinates of UPPER LEFT corner of Rectangle by X: ");
        upperLeftCornerX = scanner.nextInt();
        System.out.print("Enter coordinates of UPPER LEFT corner of Rectangle by Y: ");
        upperLeftCornerY = scanner.nextInt();
        System.out.print("\nEnter coordinates of BOTTOM RIGHT corner of Rectangle by X: ");
        bottomRightCornerX = scanner.nextInt();
        System.out.print("Enter coordinates of BOTTOM RIGHT corner of Rectangle by Y: ");
        bottomRightCornerY = scanner.nextInt();
        int sizeX = bottomRightCornerX - upperLeftCornerX;
        int sizeY = upperLeftCornerY - bottomRightCornerY;

        String[][] points = new String[sizeX][sizeY];
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                points[j][i] = (j + upperLeftCornerX) + "X" + (upperLeftCornerY - i) + "Y";
            }
        }

        //printRectangle(points, sizeX, sizeY);

        System.out.print("\nEnter POINT coordinates by X: ");
        pointX = scanner.nextInt();
        System.out.print("Enter POINT coordinates by Y: ");
        pointY = scanner.nextInt();
        String pointCoordinates = (pointX + 1) + "X" + (pointY + 1) + "Y";

        if (search(pointCoordinates, points, sizeX, sizeY)) {
            System.out.println("\nThis point is in rectangle");
        } else {
            System.out.println("\nThis point is not in rectangle");
        }
    }

    private static void printRectangle(String[][] points, int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(points[j][i] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean search(String pointCoordinates, String[][] points, int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                if (points[j][i].equals(pointCoordinates)) {
                    return true;
                }
            }
        }
        return false;
    }
}