package List14;

import java.util.ArrayList;

public class Zegar implements Subject {
    //  ==  Class fields  ==============================================================================================

    public static final int SECONDS_PER_HOUR = 3600;
    public static final int MINUTES_PER_HOUR = 60;
    private int secondsFromMidnight;
    private ArrayList<Observer> observers = new ArrayList<>();


    //  ==  Constructors  ==============================================================================================

    public Zegar() {
        secondsFromMidnight = 0;
    }


    public Zegar(int hh, int mm, int ss) {
        secondsFromMidnight = toSeconds(hh, mm, ss);
    }


    //  ==  Public methods  ============================================================================================

    public void Przesun(int hh, int mm, int ss) {
        if (hh < 0 || mm < 0 || ss < 0) return;

        System.out.println("\nPrzesuniecie czasu o " + hh + "h, " + mm + "m, " + ss + "s");
        secondsFromMidnight += toSeconds(hh, mm, ss);
        changedState();
    }


    public void Tykniecie() {
        System.out.println("\nZegar tyka");
        secondsFromMidnight++;
        changedState();
    }


    public void Wypisz() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        int hh = secondsFromMidnight / SECONDS_PER_HOUR;
        int mm = secondsFromMidnight % SECONDS_PER_HOUR / MINUTES_PER_HOUR;
        int ss = secondsFromMidnight % MINUTES_PER_HOUR;

        String timeFormatted = hh + ":" + mm + ":" + ss;
        String timeToPrint = "\tczas= " + secondsFromMidnight + "\t\t" + timeFormatted;

        return String.format("%-17s", "Zegar:") + timeToPrint;
    }


    //  ==  Private methods ============================================================================================

    private int toSeconds(int hh, int mm, int ss) {
        if (hh < 0 || mm < 0 || ss < 0) return 0;

        return hh * SECONDS_PER_HOUR + mm * MINUTES_PER_HOUR + ss;
    }


    private void changedState() {
        Wypisz();
        notifyObservers();
    }


    //  == Observer methods ============================================================================================

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            int hh = secondsFromMidnight / SECONDS_PER_HOUR;
            int mm = secondsFromMidnight % SECONDS_PER_HOUR / MINUTES_PER_HOUR;
            int ss = secondsFromMidnight % MINUTES_PER_HOUR;

            observer.update(hh, mm, ss);
        }
    }


    //  ==  Getters and Setters  =======================================================================================

    public int getSecondsFromMidnight() {
        return secondsFromMidnight;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setSecondsFromMidnight(int secondsFromMidnight) {
        if (secondsFromMidnight < 0) return;

        this.secondsFromMidnight = secondsFromMidnight;
        System.out.println("\nUstawiono czas na: " + secondsFromMidnight + "s");
        Wypisz();
        notifyObservers();
    }

    public void setObservers(ArrayList<Observer> observers) {
        if (observers == null) return;

        this.observers = observers;
        notifyObservers();
    }
}
