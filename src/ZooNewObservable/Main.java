package ZooNewObservable;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(001);
        Tiger tiger = new Tiger(002);

        Worker director = new Director();
        Worker fooder = new Fooder();
        Worker groomer = new Groomer();
        Worker veterinary = new Veterinary();

        cat.addListenerHungry(director);
        cat.addListenerHungry(veterinary);
        cat.addListenerHungry(fooder);
        cat.addListenerGroom(groomer);
        cat.addListenerGroom(director);
        cat.addListenerIllness(veterinary);
        cat.addListenerIllness(director);


        tiger.addListenerHungry(director);
        tiger.addListenerHungry(veterinary);
        tiger.addListenerHungry(fooder);
        tiger.addListenerIllness(veterinary);
        tiger.addListenerIllness(director);

        cat.setHungry(true);
        cat.setHungry(false);

        tiger.setIllness(true);
        tiger.setIllness(false);

        cat.setGroom(true);
        cat.setGroom(false);
    }
}
