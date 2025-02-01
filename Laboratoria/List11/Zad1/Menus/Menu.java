package List11.Zad1.Menus;

import List11.Zad1.Bakers.PieczeBabcia;
import List11.Zad1.Bakers.PieczeDziadek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu {
    //  ==  Class fields  ==============================================================================================

    //  Constants
    private static final Scanner read = new Scanner(System.in);
    private static final int MAX_OBJECTS_NUMBER = 10;
    private static final String FILENAME = "src/List11/Zad1/bakers.ser";

    private static PieczeBabcia[] babcie = new PieczeBabcia[MAX_OBJECTS_NUMBER];
    private static PieczeDziadek[] dziadkowie = new PieczeDziadek[MAX_OBJECTS_NUMBER];
    private static int babcieCount = 0;
    private static int dziadkowieCount = 0;


    //  ==  Public methods  ============================================================================================

    public void run() {
        int choice = Integer.MIN_VALUE;

        while (choice != 0) {
            showMenu();
            choice = read.nextInt();
            System.out.println();
            handleMenu(choice);
        }
    }


    //  ==  Private methods  ===========================================================================================

    private void showMenu() {
        System.out.print("\n========== MENU: ==========\n" +
                            "Kto piecze dzis ciasto?:\n" +
                            "1 - Babcia\n" +
                            "2 - Dziadek\n" +
                            "3 - Zapisz\n" +
                            "4 - Odczytaj\n" +
                            "0 - Wyjscie\n\n" +

                            "Wybrana opcja: ");
    }


    private void printTypesOfCakes() {
        System.out.println("1 - Szarlotka\n" +
                            "2 - Ciasto sliwkowe\n");
    }


    private void printWaysOfBaking() {
        System.out.print("1 - Dla szarlotki: Kostka; Dla ciasta sliwkowego: Zmiksowane\n" +
                          "2 - Dla szarlotki: Cwiartki; Dla ciasta sliwkowego: Polowki\n\n" +

                          "W jaki sposob przygotuje owoce?: ");
    }


    private int[] handleBaker(String baker) {
        int who_choice;
        int how_choice;

        printTypesOfCakes();
        System.out.print("Jakie ciasto upiecze " + baker + "?: ");
        who_choice = read.nextInt();
        System.out.println();
        printWaysOfBaking();
        how_choice = read.nextInt();
        System.out.println();

        //  Returns set of two choices on who and how bakes the cake
        return new int[] {who_choice, how_choice};
    }


    private void handleMenu(int choice) {
        int whoChoice;
        int howChoice;
        int[] choices;

        switch (choice) {
            case 1:
                choices = handleBaker("babcia");
                whoChoice = choices[0];
                howChoice = choices[1];
                PieczeBabcia pieczeBabcia = new PieczeBabcia(whoChoice, howChoice);
                pieczeBabcia.wyswietlInfo();
                addBabcia(pieczeBabcia);
                break;
            case 2:
                choices = handleBaker("dziadek");
                whoChoice = choices[0];
                howChoice = choices[1];
                PieczeDziadek pieczeDziadek = new PieczeDziadek(whoChoice, howChoice);
                pieczeDziadek.wyswietlInfo();
                addDziadek(pieczeDziadek);
                break;
            case 3:
                saveToFile();
                break;
            case 4:
                readFromFile();
                break;
            case 0:
                System.out.println("Konczenie pracy programu...");
                System.exit(0);
                break;
            default:
                System.out.println("Brak wybranej opcji: " + choice);
        }
    }


    private void addBabcia(PieczeBabcia babcia) {
        if (babcieCount < MAX_OBJECTS_NUMBER) {
            babcie[babcieCount++] = babcia;
        }
    }


    private void addDziadek(PieczeDziadek dziadek) {
        if (dziadkowieCount < MAX_OBJECTS_NUMBER) {
            dziadkowie[dziadkowieCount++] = dziadek;
        }
    }


    private void saveToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(babcie);
            objectOutputStream.writeObject(dziadkowie);
            objectOutputStream.close();

            System.out.println("Saved to file: " + FILENAME);
        }
        catch (Exception e) {
            System.out.println("Cannot save to file.");
            e.printStackTrace();
        }
    }


    private void readFromFile() {
        try {
            System.out.println("Reading from file: " + FILENAME);

            FileInputStream fileInputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            babcie = (PieczeBabcia[]) objectInputStream.readObject();
            dziadkowie = (PieczeDziadek[]) objectInputStream.readObject();

            printInfos();
        }
        catch (Exception e) {
            System.out.println("Cannot read from file.");
            e.printStackTrace();
        }
    }


    private void printInfos() {
        for (int i = 0; i < babcieCount; i++) {
            babcie[i].wyswietlInfo();
        }

        for (int i = 0; i < dziadkowieCount; i++) {
            dziadkowie[i].wyswietlInfo();
        }
    }
}
