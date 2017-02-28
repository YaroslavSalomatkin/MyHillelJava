package lesson_07;

public class Dog extends Pet implements Named, Voicing {
    public Dog(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    @Override
    public String voice() {
        return super.voice() + " Woof!";
    }
}
