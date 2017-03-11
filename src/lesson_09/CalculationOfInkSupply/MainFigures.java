package lesson_09.CalculationOfInkSupply;

public class MainFigures {
    public static void main(String[] args) {

        FiguresCollection figuresCollection = new FiguresCollection();

        Circle circle = new Circle(5.2);
        Square square = new Square(7.0);
        Triangle triangle = new Triangle(3.4, 5.6, 4.5);

        ColorFigures green = new ColorFigures("green", 0.675, 34);
        ColorFigures red = new ColorFigures("red", 1.5, 10);
        ColorFigures yellow = new ColorFigures("yellow", 0.675, 34);

        circle.setColor(green);
        figuresCollection.addFigure(circle);

        square.setColor(red);
        figuresCollection.addFigure(square);

        triangle.setColor(yellow);
        figuresCollection.addFigure(triangle);

        System.out.println("Paint area: " + figuresCollection.totalPaintArea());
        System.out.println("Weight of paint: " + figuresCollection.totalWeight());
        System.out.println("Total cost: " + figuresCollection.totalCost());
    }
}
