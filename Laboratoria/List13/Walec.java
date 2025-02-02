package List13;

public class Walec extends Bryla {
    //  ==  Class fields ===============================================================================================

    private int r;      //  Radius

    //  Constants
    private static final int DEFAULT_RADIUS_LENGTH = 1;


    //  ==  Constructors ===============================================================================================

    public Walec() {
        super();
        r = DEFAULT_RADIUS_LENGTH;
    }


    public Walec(String name, int height, int r) {
        super(name, height);
        setR(r);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Walec: " + getKolor() +
                " [r=" + r + ", h=" + getH() + "]";
    }


    @Override
    public double Objetosc() {
        return Math.PI * r * r * getH();
    }


    //  ==  Getters and Setters ========================================================================================

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r > 0) this.r = r;
        else this.r = DEFAULT_RADIUS_LENGTH;
    }
}
