package lesson_07;

public class Fish extends Pet {
    public Fish(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, false);
    }

    public String voice() {
        return "....";
    }
}
