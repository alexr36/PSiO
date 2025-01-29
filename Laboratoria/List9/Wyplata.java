package List9;

public class Wyplata {
    //  ==  Class fields ===============================================================================================

    //  Constants
    private static final double DEFAULT_SALARY = 0.0;

    private static int numerWyplaty = 0;
    private int nextPayoffNumber;
    private double pensja;
    private KartaPracownika karta;


    //  ==  Constructors ===============================================================================================

    public Wyplata() {
        numerWyplaty++;
        nextPayoffNumber = numerWyplaty;
        pensja = DEFAULT_SALARY;
        karta = new KartaPersonelu();
    }


    public Wyplata(double pensja, KartaPracownika karta) {
        numerWyplaty++;
        nextPayoffNumber = numerWyplaty;
        setPensja(pensja * karta.premia());
        setKarta(karta);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Payoff id: " + nextPayoffNumber +
                ", Salary: " + pensja +
                ", Worker's card: " + karta.toString();
    }


    public double pensjaZPremia() {
        return pensja * karta.premia();
    }


    //  ==  Getters and Setters ========================================================================================

    public static int getNumerWyplaty() {
        return numerWyplaty;
    }

    public int getNextPayoffNumber() {
        return nextPayoffNumber;
    }

    public double getPensja() {
        return pensja;
    }

    public KartaPracownika getKarta() {
        return karta;
    }

    public void setPensja(double pensja) {
        if (pensja > 0.0) this.pensja = pensja;
        else this.pensja = 0.0;
    }

    public void setKarta(KartaPracownika karta) {
        if (karta != null) this.karta = karta;
    }
}
