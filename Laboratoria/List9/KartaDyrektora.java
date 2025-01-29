package List9;

public class KartaDyrektora extends KartaPracownika {
    //  ==  Constructors ===============================================================================================

    public KartaDyrektora() {
        super();
    }


    public KartaDyrektora(int numer, String nazwisko) {
        super(numer, nazwisko);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public double premia() {
        return 2.0;
    }
}
