package ZooNewObservable;

import java.util.*;

public abstract class Pet extends Animal {
    private boolean isGroom = false;
    private ArrayList<Observer> listenersGroom = new ArrayList<Observer>();

    public Pet(int id, String type) {
        super(id, type);
    }

    public boolean isGroom() {
        return isGroom;
    }

    public void setGroom(boolean groom) {
        isGroom = groom;
        this.notifyListenersGroom();
        this.notifyObservers();
    }

    public void addListenerGroom(Observer listener) {
        listenersGroom.add(listener);
    }

    public void removeListenerGroom(Observer listener) {
        listenersGroom.remove(listener);
    }

    protected void notifyListenersGroom() {
        String message;
        if (isGroom) {
            message = " NEED GROOM!";
        } else {
            message = " IS GROOMED!";
        }
        for (Observer listener : listenersGroom) {
            listener.handleEvent(this.toString() + message);
        }
    }
}
