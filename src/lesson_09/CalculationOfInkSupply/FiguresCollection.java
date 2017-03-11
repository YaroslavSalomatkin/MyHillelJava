package lesson_09.CalculationOfInkSupply;

import java.util.ArrayList;

public class FiguresCollection {

    private ArrayList<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public double totalCost() {
        double total = 0;
        for (Figure f : figures) {
            total += f.paintCost();
        }
        return total;
    }

    public double totalPaintArea() {
        double total = 0;
        for (Figure f : figures) {
            total += f.space();
        }
        return total;
    }

    public double totalWeight() {
        double total = 0;
        for (Figure f : figures) {
            total += f.amountOfInk();
        }
        return total;
    }
}
