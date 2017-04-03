package ZooNewObservable;

public class Director extends Worker {

    @Override
    public void handleEvent(String message) {
        System.out.println(message + " - Director");
    }
}
