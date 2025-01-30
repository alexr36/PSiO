package List10.Cake;

import List10.Fruits.Jablko;
import List10.Fruits.Sliwka;

public abstract class Ciasto {
    //  ==  Class fields  ==============================================================================================

    private String algorytmInfoJablko;
    private String algorytmInfoSliwka;

    private Jablko szarlotka;
    private Sliwka ciastoSliwkowe;


    //  ==  Public methods  ============================================================================================

    public void wykonajSzarlotke() {
        szarlotka.przygotowanieJablka();
    }


    public void ustawSzarlotke(Jablko szarlotka, String algorytmInfoJablko) {
        this.szarlotka = szarlotka;
        this.algorytmInfoJablko = algorytmInfoJablko;
    }


    public void wykonajCiastoSliwkowe() {
        ciastoSliwkowe.przygotowanieSliwki();
    }


    public void ustawCiastoSliwkowe(Sliwka ciastoSliwkowe, String algorytmInfoSliwka) {
        this.ciastoSliwkowe = ciastoSliwkowe;
        this.algorytmInfoSliwka = algorytmInfoSliwka;
    }


    public abstract void wyswietlInfo();


    //  ==  Other Getters and Setters ==================================================================================

    public String getAlgorytmInfoJablko() {
        return algorytmInfoJablko;
    }

    public String getAlgorytmInfoSliwka() {
        return algorytmInfoSliwka;
    }

    public Jablko getSzarlotka() {
        return szarlotka;
    }

    public Sliwka getCiastoSliwkowe() {
        return ciastoSliwkowe;
    }

    public void setAlgorytmInfoJablko(String algorytmInfoJablko) {
        this.algorytmInfoJablko = algorytmInfoJablko;
    }

    public void setAlgorytmInfoSliwka(String algorytmInfoSliwka) {
        this.algorytmInfoSliwka = algorytmInfoSliwka;
    }
}
