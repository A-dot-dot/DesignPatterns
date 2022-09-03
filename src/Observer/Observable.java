package Observer;

import java.util.ArrayList;

public interface Observable {
    ArrayList<Observer> observers = new ArrayList();

    default void register(Observer o) {
        observers.add(o);
    }

    default void unRegister(Observer o) {
        int index = observers.indexOf(o);

        if(index != -1) {
            observers.remove(index);
        }
    }

    default void update() {
        for(Observer o : observers) {
            o.update();
        }
    }
}
