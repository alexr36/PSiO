package List8;

public class Pacjent extends Osoba {
    //  ==  Class fields ===============================================================================================

    private int n;      //  Number of attended appointments
    private Wizyta[] appointments;


    //  ==  Constructors ===============================================================================================

    public Pacjent() {
        super();
        n = 0;
        appointments = null;
    }


    public Pacjent(String nazwisko, String pesel, int n) {
        super(nazwisko, pesel);
        setN(n);
        appointments = new Wizyta[n];
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Pacjent: " + super.toString() + " [n=" + n + "]";
    }


    @Override
    public double Oblicz() {
        if (appointments == null) return 0;

        double price = 0;

        for (int i = 0; i < n; i++) {
            price += appointments[i].getCenaWizyty();
        }

        return price;
    }


    public void wyswietlWizyty() {
        if (appointments == null) return;

        for (int i = 0; i < n; i++) {
            System.out.println(appointments[i]);
        }
    }


    //  ==  Getters and Setters ========================================================================================

    public int getN() {
        return n;
    }

    public Wizyta[] getAppointments() {
        return appointments;
    }

    public void setN(int n) {
        if (n > 0) this.n = n;
        else this.n = 0;
    }

    public void setAppointments(Wizyta[] appointments) {
        this.appointments = appointments;
    }
}
