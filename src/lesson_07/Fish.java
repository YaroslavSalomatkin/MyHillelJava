package lesson_07;

public class Fish extends Pet implements Named {
    public Fish(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, false);
    }

    @Override
    public String voice() {
        return "....";
    }
}
