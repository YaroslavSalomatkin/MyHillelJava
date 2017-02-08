package lesson_02;

public class GraphicsConsole {
    public static void main(String[] args) {

        // Rectangle
        int heightOfRectangle = 6;
        int widthOfRectangle = 14;
        for (int strings = 0; strings < heightOfRectangle; strings++) {
            for (int columns = 0; columns < widthOfRectangle; columns++) {
                if (strings == 0 || columns == 0 || strings == heightOfRectangle - 1 || columns == widthOfRectangle - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();

        //Envelope
        int heightOfEnvelope = 11;
        int widthOfEnvelope = heightOfEnvelope;
        for (int strings = 0; strings < heightOfEnvelope; strings++) {
            for (int columns = 0; columns < widthOfEnvelope; columns++) {
                if (strings == 0 || columns == 0 || strings == heightOfEnvelope - 1 || columns == widthOfEnvelope - 1
                        || columns == strings || columns == widthOfEnvelope - strings - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();

        //Checkerboard pattern
        int lineLenght = 4;
        int lines = 10;
        for (int linesCount=0;linesCount<lines;linesCount++) {
            for (int count = 0; count < lineLenght; count++) {
                if (linesCount % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
