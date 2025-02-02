package List13;

public abstract class Bryla {
    //  ==  Class fields ===============================================================================================

    private String kolor;
    private int h;      //  Height

    //  Constants
    private static final String DEFAULT_COLOR = "Default color";
    protected static final int DEFAULT_HEIGHT = 0;


    //  ==  Constructors ===============================================================================================

    public Bryla() {
        kolor = DEFAULT_COLOR;
        h = DEFAULT_HEIGHT;
    }


    public Bryla(String kolor, int h) {
        this.kolor = kolor;
        setH(h);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Bryla o kolorze: " + kolor;
    }


    public abstract double Objetosc();

    //  ==  Getters and Setters ========================================================================================

    public String getKolor() {
        return kolor;
    }

    public int getH() {
        return h;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setH(int h) {
        if (h >= 0) this.h = h;
        else this.h = DEFAULT_HEIGHT;
    }
}
