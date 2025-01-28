package List8;

import java.util.Random;

public class Lekarz extends Osoba {
    //  ==  Class fields ===============================================================================================

    //  Constants
    private static final int WORKING_DAYS = 5;
    private static final String DEFAULT_SPECIALISATION = "brak";
    private static final int DEFAULT_PAY = 0;
    private static final int RANGE_LOWER_BOUND = 20;
    private static final int RANGE_UPPER_BOUND = 30;
    private static final Random rand = new Random();

    private String s;       //  Specialisation
    private int stawka;
    private int[] t;        //  Patients served during the working days of a week


    //  ==  Constructors ===============================================================================================

    public Lekarz() {
        super();
        s = DEFAULT_SPECIALISATION;
        stawka = DEFAULT_PAY;
        t = null;
    }


    public Lekarz(String nazwisko, String pesel, String s, int stawka) {
        super(nazwisko, pesel);
        this.s = s;
        this.stawka = stawka;
        t = new int[WORKING_DAYS];
        fillArray(t);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Lekarz: " + super.toString() +
               " [specjalizacja=" + s + ", stawka=" + stawka + "]";
    }


    @Override
    public double Oblicz() {
        return stawka * sumPatients();
    }


    public void wyswietlLiczbePacjentow() {
        if (t == null) {
            System.out.println("No patients served.");
            return;
        }

        for (int i = 0; i < t.length; i++) {
            System.out.println("Day " + (i + 1) + ", Patients: " + t[i]);
        }
    }


    public boolean jestInternista() {
        return s.equals("internista") || s.equals("Internista");
    }


    //  ==  Private methods ============================================================================================

    private void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(RANGE_LOWER_BOUND, RANGE_UPPER_BOUND + 1);
        }
    }


    private int sumPatients() {
        if (t == null) return 0;

        int sum = 0;

        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }

        return sum;
    }


    //  ==  Getters and Setters ========================================================================================

    public String getS() {
        return s;
    }

    public int getStawka() {
        return stawka;
    }

    public int[] getT() {
        return t;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setStawka(int stawka) {
        this.stawka = stawka;
    }

    public void setT(int[] t) {
        this.t = t;
    }
}
