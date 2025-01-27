package List6.Zad1.Konto;

public class Konto {
    //  ==  Class fields ===============================================================================================

    private Waluta waluta;
    private boolean jestAktywne = false;
    private static final Waluta DEFAULT_CURRENCY = new Waluta();


    //  ==  Constructors ===============================================================================================

    public Konto() {
        waluta = DEFAULT_CURRENCY;
    }


    public Konto(Waluta waluta) {
        this.waluta = waluta;
    }


    //  ==  Public methods =============================================================================================

    //  Printing current state
    public void getStan() {
        System.out.println("waluta=" + waluta + " jestAktywne=" + jestAktywne);
    }


    public void aktywuj() {
        jestAktywne = true;
    }


    public void dezaktywuj() {
        jestAktywne = false;
    }


    //  ==  Getters and Setters ========================================================================================

    public Waluta getWaluta() {
        return waluta;
    }

    public boolean isJestAktywne() {
        return jestAktywne;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public void setJestAktywne(boolean jestAktywne) {
        this.jestAktywne = jestAktywne;
    }
}
