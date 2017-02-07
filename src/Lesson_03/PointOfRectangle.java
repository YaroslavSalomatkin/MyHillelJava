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
        for (int i = upperLeftCornerY; i < bottomRightCornerY; i--) {
            for (int j = upperLeftCornerX; j < sizeX + upperLeftCornerX; j++) {
                points[i][j] = i + "X" + j + "y";
            }
        }

        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeY; j++) {
                points[i][j] = (upperLeftCornerX + i) + "X" + (upperLeftCornerY - j) + "Y";
            }
        }

        System.out.print("\nEnter POINT coordinates by X: ");
        pointX = scanner.nextInt();
        System.out.print("Enter POINT coordinates by Y: ");
        pointY = scanner.nextInt();
        String pointCoordinates = pointX + "X" + pointY + "Y";

        if (search(pointCoordinates, points, sizeX, sizeY)) {
            System.out.println("Point is in rectangle");
        } else {
            System.out.println("Point is not in rectangle");
        }
    }

    private static boolean search(String pointCoordinates, String[][] points, int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                if (points[i][j].equals(pointCoordinates)) {
                    return true;
                }
            }
        }
        return false;
    }
}
