package observer;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable implements Runnable {
    LocalDateTime timePoint;
    int seconds;
    int minutes;
    int hours;
    
    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
    
    public String toString() {
        return hours + " : " + minutes + " : " + seconds;
    }

    @Override
    public void run() {
        while (true) {
            timePoint = LocalDateTime.now();
            if (seconds != timePoint.getSecond()) setChanged();
            seconds = timePoint.getSecond();
            minutes = timePoint.getMinute();
            hours = timePoint.getHour();
            notifyObservers(this);
        }
    }
    
    
}
