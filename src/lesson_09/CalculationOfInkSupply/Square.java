package lesson_09.CalculationOfInkSupply;

public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double space() {
        return side * side;
    }
}
