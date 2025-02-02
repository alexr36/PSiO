package List14;

import static List14.Zegar.MINUTES_PER_HOUR;
import static List14.Zegar.SECONDS_PER_HOUR;

public class ZegarAnalogowy implements Observer {
    //  ==  Class fields ===============================================================================================

    private Zegar clock;
    private int secondsFromMidnight;


    //  ==  Constructors ===============================================================================================

    public ZegarAnalogowy(Zegar observedClock) {
        clock = observedClock;
        observedClock.registerObserver(this);
    }


    //  ==  Public methods =============================================================================================

    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        String timeToPrint = "\tczas= " + secondsFromMidnight + "\t\tZegar Analogowy";

        return String.format("%-17s", "Zegar Analogowy:") + timeToPrint;
    }


    @Override
    public void update(int hh, int mm, int ss) {
        this.secondsFromMidnight = hh * SECONDS_PER_HOUR + mm * MINUTES_PER_HOUR + ss;
        print();
    }


    //  ==  Getters and Setters  =======================================================================================

    public Zegar getClock() {
        return clock;
    }

    public int getSecondsFromMidnight() {
        return secondsFromMidnight;
    }

    public void setClock(Zegar clock) {
        if (clock != null) this.clock = clock;
    }

    public void setSecondsFromMidnight(int secondsFromMidnight) {
        if (secondsFromMidnight >= 0) this.secondsFromMidnight = secondsFromMidnight;
    }
}
