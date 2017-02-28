package lesson_07;

public class Hamster extends Pet implements Named, Voicing{
    public Hamster(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }
}
