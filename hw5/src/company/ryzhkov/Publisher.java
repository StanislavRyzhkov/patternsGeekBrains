package company.ryzhkov;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    protected void notify(Object arg) {
        observers.forEach(observer -> observer.update(this, arg));
    }
}
