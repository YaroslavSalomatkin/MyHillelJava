package lesson_07;

public class MainClass {
    public static void main(String[] args) {
        GuideDog guideDog1 = new GuideDog(1000, "Sharik",5, 15, "brown", true, true);
        Hamster hamster = new Hamster(1000, "Homka",5, 15, "brown", true);
        System.out.println(guideDog1.voice());
        System.out.println(hamster.voice());
        Lion lion = new Lion(1000,5, 15, "yellow", true);
        System.out.println(lion.voice());
        Crocodile crocodile = new Crocodile(3000,7, 15, "green", true);
        System.out.println(crocodile.voice());
    }
}
