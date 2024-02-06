package observer;
import java.util.Observable;
public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;

    public void tick() {
        // Simuloi kellon tikitystä
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }

        // Ajan muuttuessa merkitään Observable-olio muuttuneeksi ja ilmoitetaan seuraajille
        setChanged();
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
