package lesson_09.CalculationOfInkSupply;

public class Triangle extends Figure {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double space() {
        // Heron's formula
        double perimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
}
