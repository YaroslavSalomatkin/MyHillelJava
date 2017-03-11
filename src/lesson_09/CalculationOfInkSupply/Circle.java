package lesson_09.CalculationOfInkSupply;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double space() {
        return Math.PI * radius * radius;
    }
}
