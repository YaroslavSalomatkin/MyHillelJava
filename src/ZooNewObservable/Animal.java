package ZooNewObservable;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal implements Observable {
    private int id;
    private String type;
    private boolean isHungry = false;
    private boolean isIllness = false;
    private ArrayList<Observer> listenersHungry = new ArrayList<Observer>();
    private ArrayList<Observer> listenersIllness = new ArrayList<Observer>();
    private ArrayList<Observer> listeners = new ArrayList<Observer>();
    private Date date = new Date();

    public Animal(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public boolean isHungry() {
        return this.isHungry;
    }

    public void setHungry(boolean hungry) {
        this.isHungry = hungry;
        this.notifyListeners("HUNGRY");
    }

    public void addListenerHungry(Observer observer) {
        listenersHungry.add(observer);
    }

    public void removeListenerHungry(Observer observer) {
        listenersHungry.remove(observer);
    }

    public boolean isIllness() {
        return this.isIllness;
    }

    public void setIllness(boolean illness) {
        this.isIllness = illness;
        this.notifyListeners("ILLNESS");
    }

    public void addListenerIllness(Observer observer) {
        listenersIllness.add(observer);
    }

    public void removeListenerIllness(Observer observer) {
        listenersIllness.remove(observer);
    }

    private void notifyListeners(String event) {
        String message;
        switch (event) {
            case "HUNGRY":
                if (isHungry) {
                    message = " IS HUNGRY!";
                } else {
                    message = " ATE UP!";
                }
                for (Observer listener : listenersHungry) {
                    listener.handleEvent(this.toString() + message);
                }
                break;
            case "ILLNESS":
                if (isIllness) {
                    message = " IS ILL!";
                } else {
                    message = " HEALTHY!";
                }
                for (Observer listener : listenersIllness) {
                    listener.handleEvent(this.toString() + message);
                }
                break;
        }
    }
    public String toString() {
        return "\t" + type + " id:" + id + " " + date + ".";
    }

    public void addObserver(Observer listener) {
        listeners.add(listener);
    }

    public void removeObserver(Observer listener) {
        listeners.remove(listener);
    }

    public void notifyObservers() {
    }


}
