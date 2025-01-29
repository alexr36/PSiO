package List9;

public class KartaDyrektora extends KartaPracownika {
    public KartaDyrektora() {
        super();
    }


    public KartaDyrektora(int numer, String nazwisko) {
        super(numer, nazwisko);
    }


    @Override
    public double premia() {
        return 2.0;
    }
}
