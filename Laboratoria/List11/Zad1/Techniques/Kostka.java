package List11.Zad1.Techniques;

import List11.Zad1.Fruits.Jablko;

import java.io.Serializable;

public class Kostka implements Jablko, Serializable {
    @Override
    public void przygotowanieJablka() {
        System.out.println("Jablka pokrojone w kostke.");
    }
}
