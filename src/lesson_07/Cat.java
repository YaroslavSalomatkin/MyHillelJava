package lesson_07;

public class Cat extends Pet implements Named, Voicing{
    public Cat(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    @Override
    public String voice() {
        return super.voice() + " Meow...";
    }
}
