package lesson_07;

public class Lion extends Wild implements Voicing{
    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, true);
    }
}
