package List9;

public class KartaKierownika extends KartaPracownika {
    //  ==  Constructors ===============================================================================================

    public KartaKierownika() {
        super();
    }


    public KartaKierownika(int numer, String nazwisko) {
        super(numer, nazwisko);
    }


    //  ==  Public methods =============================================================================================

    @Override
    public double premia() {
        return 1.5;
    }
}
