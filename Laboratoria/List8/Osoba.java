package List8;

public abstract class Osoba {
    //  ==  Class fields ===============================================================================================

    //  Constants
    private String nazwisko;
    private String pesel;
    protected static final String EMPTY_STRING = "";


    //  ==  Constructors ===============================================================================================

    public Osoba() {
        nazwisko = EMPTY_STRING;
        pesel = EMPTY_STRING;
    }


    public Osoba(String nazwisko, String pesel) {
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return nazwisko + " " + pesel;
    }


    public abstract double Oblicz();


    //  ==  Getters and Setters ========================================================================================

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
