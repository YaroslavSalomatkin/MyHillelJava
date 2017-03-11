package lesson_09.CalculationOfInkSupply;

public class ColorFigures {
    private String colorName;
    private final double consumption;
    private final double price;

    public ColorFigures(String color, double consumption, double price) {
        this.colorName = color;
        this.consumption = consumption;
        this.price = price;
    }

    public ColorFigures() {
        this.colorName = "non colored";
        this.consumption = 0;
        this.price = 0;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getPrice() {
        return price;
    }
}
