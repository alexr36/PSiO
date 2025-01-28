package List8;

public class Wizyta {
    //  ==  Class fields ===============================================================================================

    private int kodChoroby;
    private int cenaWizyty;
    private boolean givenSickNote;
    private boolean givenReceipt;


    //  ==  Constructors ===============================================================================================

    public Wizyta() {
        kodChoroby = 0;
        cenaWizyty = 0;
        givenSickNote = false;
        givenReceipt = false;
    }


    public Wizyta(int kod, int cena, boolean zwolnienie, boolean recepta) {
        kodChoroby = kod;
        setCenaWizyty(cena);
        givenSickNote = zwolnienie;
        givenReceipt = recepta;
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Kod choroby: " + kodChoroby +
                "; Cena wizyty: " + cenaWizyty +
                "; Wystawiono zwolnienie: " + givenSickNote +
                "; Wystawiono recepte: " + givenReceipt;
    }


    //  ==  Getters and Setters ========================================================================================

    public int getKodChoroby() {
        return kodChoroby;
    }

    public int getCenaWizyty() {
        return cenaWizyty;
    }

    public boolean isGivenSickNote() {
        return givenSickNote;
    }

    public boolean isGivenReceipt() {
        return givenReceipt;
    }

    public void setKodChoroby(int kodChoroby) {
        this.kodChoroby = kodChoroby;
    }

    public void setCenaWizyty(int cenaWizyty) {
        if (cenaWizyty > 0) this.cenaWizyty = cenaWizyty;
        else this.cenaWizyty = 0;
    }

    public void setGivenSickNote(boolean givenSickNote) {
        this.givenSickNote = givenSickNote;
    }

    public void setGivenReceipt(boolean givenReceipt) {
        this.givenReceipt = givenReceipt;
    }
}
