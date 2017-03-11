package lesson_09.CalculationOfInkSupply;

public abstract class Figure {
    private ColorFigures color;

    public void setColor(ColorFigures colorFigures) {
        this.color = colorFigures;
    }

    public ColorFigures getColor() {
        return this.color;
    }

    public double paintCost() {
        return amountOfInk() * color.getPrice();
    }

    public double amountOfInk() {
        return this.space() * color.getConsumption();
    }

    public abstract double space();
}