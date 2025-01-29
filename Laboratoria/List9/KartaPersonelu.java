package List9;

public class KartaPersonelu extends KartaPracownika {
    //  ==  Constructors ===============================================================================================

    public KartaPersonelu() {
        super();
    }


    public KartaPersonelu(int numer, String nazwisko) {
        super(numer, nazwisko);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public double premia() {
        return 1.2;
    }
}
