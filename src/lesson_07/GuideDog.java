package lesson_07;

public class GuideDog extends Pet implements Named, Voicing{
    boolean isTrained;

    public GuideDog(int id, String name, int age, int weight, String color, boolean isVactinated, boolean isTrained) {
        super(id, name, age, weight, color, isVactinated);
        this.isTrained = isTrained;
    }

    public void takeHome() {
        if (isTrained) {

        }
        System.out.println("OK, go home!");
    }

    @Override
    public String voice() {
        String voice = super.voice() + " Woof!";
        if (isTrained) {
            voice += " I can take you home.";
        }
        return voice;
    }
}
