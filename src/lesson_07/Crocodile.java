package lesson_07;

public class Crocodile extends  Wild implements Voicing {
    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, true);
    }
}
