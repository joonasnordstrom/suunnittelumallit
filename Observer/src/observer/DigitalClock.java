package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    
    Observable observable;
    ClockTimer timer;
    
    public DigitalClock(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object o1) {
        timer = (ClockTimer) o1;
        System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());
    }

}
