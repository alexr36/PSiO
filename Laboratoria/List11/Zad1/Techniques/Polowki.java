package List11.Zad1.Techniques;

import List11.Zad1.Fruits.Sliwka;

import java.io.Serializable;

public class Polowki implements Sliwka, Serializable {
    @Override
    public void przygotowanieSliwki() {
        System.out.println("Sliwki pokrojone na polowki.");
    }
}
