package lesson_07;

public class Wolf extends Wild implements Voicing{
    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, true);
    }
}
