package observer;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {

    Observable observable;
    
    public AnalogClock(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object o1) {
        System.out.println("Not so analog clock: " + o1);
    }

}
