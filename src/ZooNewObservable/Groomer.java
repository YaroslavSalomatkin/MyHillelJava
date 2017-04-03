package ZooNewObservable;

public class Groomer extends Worker {

    @Override
    public void handleEvent(String message) {
        System.out.println(message + " - Groomer");
    }
}
