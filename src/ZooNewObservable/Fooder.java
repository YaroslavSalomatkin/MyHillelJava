package ZooNewObservable;

public class Fooder extends Worker {

    @Override
    public void handleEvent(String message) {
        System.out.println(message + " - Fooder");
    }
}
