package List9;

public class KartaPersonelu extends KartaPracownika {
    public KartaPersonelu() {
        super();
    }


    public KartaPersonelu(int numer, String nazwisko) {
        super(numer, nazwisko);
    }


    @Override
    public double premia() {
        return 1.2;
    }
}
