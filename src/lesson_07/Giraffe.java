package lesson_07;

public class Giraffe extends Wild implements Voicing {
    public Giraffe(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, false);
    }
}
