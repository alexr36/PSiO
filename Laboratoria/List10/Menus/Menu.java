package List10.Menus;

import List10.Bakers.PieczeBabcia;
import List10.Bakers.PieczeDziadek;

import java.util.Scanner;

public class Menu {
    //  ==  Class fields  ==============================================================================================

    private static final Scanner read = new Scanner(System.in);


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
                break;
            case 2:
                choices = handleBaker("dziadek");
                whoChoice = choices[0];
                howChoice = choices[1];
                PieczeDziadek pieczeDziadek = new PieczeDziadek(whoChoice, howChoice);
                pieczeDziadek.wyswietlInfo();
                break;
            case 0:
                System.out.println("Konczenie pracy programu...");
                System.exit(0);
                break;
            default:
                System.out.println("Brak wybranej opcji: " + choice);
        }
    }
}
