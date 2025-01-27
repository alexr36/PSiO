package List6.Zad1.Konto;

public class Waluta {
    //  ==  Class fields ===============================================================================================

    private int type;
    private static final int DEFAULT_TYPE = 0;


    //  ==  Constructors ===============================================================================================

    public Waluta() {
        type = DEFAULT_TYPE;
    }


    public Waluta(int type) {
        setType(type);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public String toString() {
        return Integer.toString(type);
    }


    //  ==  Getters and Setters ========================================================================================

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type > 4 || type < 0) this.type = DEFAULT_TYPE;
        else this.type = type;
    }
}
