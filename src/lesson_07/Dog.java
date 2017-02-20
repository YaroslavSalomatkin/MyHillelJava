package lesson_07;

public class Dog extends Pet {
    public Dog(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }
    public String voice() {
        return super.voice()+" Woof!";
    }
}
