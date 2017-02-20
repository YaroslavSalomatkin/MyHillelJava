package lesson_07;

public class Cat extends Pet {
    public Cat(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String voice() {
        return super.voice() + " Meow...";
    }
}
