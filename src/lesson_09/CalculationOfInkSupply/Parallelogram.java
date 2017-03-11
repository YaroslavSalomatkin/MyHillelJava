package lesson_09.CalculationOfInkSupply;

public class Parallelogram extends Figure {
    double side;
    double height;

    public Parallelogram(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double space() {
        return side * height;
    }
}
