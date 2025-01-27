package List6.Zad1.Projekt_Main;

import List6.Zad1.Konto.Konto;
import List6.Zad1.Konto.Waluta;
import List6.Zad1.Osoba.Osoba;

import java.util.Random;

public class Main {
    private static final int BANK_SIZE = 5;
    private static final int CURRENCIES_NUMBER = 4;
    private static Random rand = new Random();

    public static void main(String[] args) {
        Konto[] bank = new Konto[BANK_SIZE];

        for (int i = 0; i < BANK_SIZE; i++) {
            int currency_type = rand.nextInt(CURRENCIES_NUMBER) + 1;
            Waluta currency = new Waluta(currency_type);
            bank[i] = new Konto(currency);
        }

        showBank(bank);

        System.out.println();

        Osoba person = new Osoba(bank[2]);
        person.aktywujKonto();
        showBank(bank);

        System.out.println();

        person.dezaktywujKonto();
        showBank(bank);
    }


    private static void showAccount(Konto account, int index) {
        System.out.print("Konto o indeksie=" + index + " ");
        account.getStan();
    }


    private static void showBank(Konto[] bank) {
        for (int i = 0; i < bank.length; i++) {
            showAccount(bank[i], i);
        }
    }
}
