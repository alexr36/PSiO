package List9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Firma {
    private static final String DEST_FILENAME = "src/List9/payoffs.txt";
    private static final int MAX_PAYOFFS_AMOUNT = 100;
    private static final Wyplata[] payoffs = new Wyplata[MAX_PAYOFFS_AMOUNT];


    public static void main(String[] args) {
        insertPayoffs();
        printPayoffs();
        System.out.println();
        System.out.println("Payoffs with Manager's Card: " + countPayoffsWithManagerCard());
        System.out.println();
        printStaffMemberWithLowestPayoff();
        System.out.println();
        saveToFIle();
    }


    private static void insertPayoff(Wyplata payoff) {
        if (Wyplata.getNumerWyplaty() > payoffs.length) return;

        payoffs[Wyplata.getNumerWyplaty()] = payoff;
    }


    private static void insertPayoffs() {
        insertPayoff(new Wyplata());
        insertPayoff(new Wyplata(525, new KartaPersonelu()));
        insertPayoff(new Wyplata(723, new KartaPersonelu(43, "Nowak")));
        insertPayoff(new Wyplata(1001, new KartaKierownika()));
        insertPayoff(new Wyplata(1080, new KartaKierownika(441, "Kowalski")));
        insertPayoff(new Wyplata(4500, new KartaDyrektora()));
        insertPayoff(new Wyplata(5000, new KartaDyrektora(2137, "Pawlak")));
    }


    private static void printPayoffs() {
        System.out.println("Payoffs:");

        for (int i = 0; i < Wyplata.getNumerWyplaty(); i++) {
            System.out.println(payoffs[i]);
        }
    }


    private static int countPayoffsWithManagerCard() {
        int count = 0;

        for (int i = 0; i < Wyplata.getNumerWyplaty(); i++) {
            Wyplata currentPayoff = payoffs[i];

            if (currentPayoff != null && currentPayoff.getKarta() instanceof KartaKierownika) {
                count++;
            }
        }

        return count;
    }


    private static void printStaffMemberWithLowestPayoff() {
        double lowestPayoffValue = Double.MAX_VALUE;
        Wyplata lowestPayoff = null;

        for (int i = 0; i < Wyplata.getNumerWyplaty(); i++) {
            Wyplata currentPayoff = payoffs[i];

            if (currentPayoff != null && currentPayoff.getKarta() instanceof KartaPersonelu) {
                double currentPayoffValue = currentPayoff.getPensja();

                if (currentPayoffValue < lowestPayoffValue) {
                    lowestPayoff = currentPayoff;
                    lowestPayoffValue = currentPayoffValue;
                }
            }
        }

        System.out.println("Lowest staff member's payoff:\n" + lowestPayoff);
    }


    private static void saveToFIle() {
        try {
            System.out.println("Saving to file...");
            BufferedWriter writer = new BufferedWriter(new FileWriter(DEST_FILENAME));

            for (int i = 0; i < Wyplata.getNumerWyplaty(); i++) {
                Wyplata currentPayoff = payoffs[i];

                if (currentPayoff != null) {
                    writer.write(currentPayoff.toString());
                    writer.newLine();
                }
            }

            writer.close();
            System.out.println("Saved successfully.");
        }
        catch (IOException e) {
            System.out.println("Cannot save to file: " + e.getMessage());
        }
    }
}
