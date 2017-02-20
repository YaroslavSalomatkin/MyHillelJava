package lesson_07;

public class Wild extends Animal {
    boolean isPredator;

    public Wild (int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public String voice() {
        String voice = super.voice() + "I am a wild animal";
        if (isPredator) {
            voice += " and I am angry!!!";
        }
        return voice;
    }
}
