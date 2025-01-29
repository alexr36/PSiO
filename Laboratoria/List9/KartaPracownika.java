package List9;

public abstract class KartaPracownika {
    //  ==  Class fields ===============================================================================================

    private int numer;
    private String nazwisko;


    //  ==  Constructors ===============================================================================================

    public KartaPracownika() {
        numer = 0;
        nazwisko = null;
    }


    public KartaPracownika(int numer, String nazwisko) {
        this.numer = numer;
        this.nazwisko = nazwisko;
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Name: " + nazwisko + ", Number: " + numer;
    }


    public abstract double premia();


    //  ==  Getters and Setters ========================================================================================

    public int getNumer() {
        return numer;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
