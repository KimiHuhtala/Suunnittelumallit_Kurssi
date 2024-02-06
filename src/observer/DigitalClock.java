package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        this.timer.addObserver(this); // Lisätään tämä DigitalClock observeriksi ClockTimeriin
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}