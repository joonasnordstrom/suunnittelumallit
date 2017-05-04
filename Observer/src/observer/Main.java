package observer;

import java.util.Observable;


public class Main {


    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        new DigitalClock(clockTimer);
        //new AnalogClock(clockTimer);
        
        clockTimer.run();
    }
    
}
