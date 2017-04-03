package ZooNewObservable;

public class Veterinary extends Worker {

    @Override
    public void handleEvent(String message) {
        System.out.println(message +  " - Veterinary");
    }
}
