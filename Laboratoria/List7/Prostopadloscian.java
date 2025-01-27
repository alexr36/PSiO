package List7;

public class Prostopadloscian extends Bryla {
    //  ==  Class fields ===============================================================================================

    private int a;      //  First side of the base
    private int b;      //  Second side of the base

    //  Constants
    private static final int DEFAULT_BASE_SIDE_LENGTH = 1;
    private static final String DEFAULT_NAME = "Bazowy";


    //  ==  Constructors ===============================================================================================

    public Prostopadloscian() {
        super(DEFAULT_NAME, DEFAULT_HEIGHT);
        a = DEFAULT_BASE_SIDE_LENGTH;
        b = DEFAULT_BASE_SIDE_LENGTH;
    }


    public Prostopadloscian(String name, int height, int a, int b) {
        super(name, height);
        setA(a);
        setB(b);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return "Prostopadloscian: " + getNazwa() +
               " [a=" + a + ", b=" + b + ", h=" + getH() + "]";
    }


    @Override
    public double Objetosc() {
        return a * b * getH();
    }


    @Override
    public double Pole() {
        return 2 * (a * b + a * getH() + b * getH());
    }


    public boolean jestSzescianem() {
        return a == b && a == getH();
    }


    //  ==  Getters and Setters ========================================================================================

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        if (a > 0) this.a = a;
        else this.a = DEFAULT_BASE_SIDE_LENGTH;
    }

    public void setB(int b) {
        if (b > 0) this.b = b;
        else this.b = DEFAULT_BASE_SIDE_LENGTH;
    }
}
