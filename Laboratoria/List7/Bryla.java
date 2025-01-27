package List7;

public abstract class Bryla {
    //  ==  Class fields ===============================================================================================

    private String nazwa;
    private int h;      //  Height

    //  Constants
    private static final String DEFAULT_NAME = "";
    protected static final int DEFAULT_HEIGHT = 0;


    //  ==  Constructors ===============================================================================================

    public Bryla() {
        nazwa = DEFAULT_NAME;
        h = DEFAULT_HEIGHT;
    }


    public Bryla(String nazwa, int h) {
        this.nazwa = nazwa;
        setH(h);
    }


    //  ==  Public methods =============================================================================================

    public String toString() {
        return "Bryla o nazwie: " + nazwa;
    }


    public abstract double Objetosc();
    public abstract double Pole();


    //  ==  Getters and Setters ========================================================================================

    public String getNazwa() {
        return nazwa;
    }

    public int getH() {
        return h;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setH(int h) {
        if (h >= 0) this.h = h;
        else this.h = DEFAULT_HEIGHT;
    }
}
