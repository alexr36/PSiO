package List13;

import java.util.*;

public class BrylyGeometryczne {
    //  ==  Class fields ===============================================================================================

    private static ArrayList<Bryla> solids;
    private static ColorComparator colorComparator;
    private static HeightComparator heightComparator;
    private static ColorAndHeightComparator colorAndHeightComparator;
    private static Scanner read = new Scanner(System.in);


    //  ==  Constructors ===============================================================================================

    public BrylyGeometryczne() {
        solids = new ArrayList<>();
    }


    //  ==  Public methods =============================================================================================

    public static void main(String[] args) {
        runMenu();
    }


    //  ==  Handling menu ==============================================================================================

    private static void runMenu() {
        int choice;

        //  To make using not-static method for creating comparators possible
        BrylyGeometryczne helperObject = new BrylyGeometryczne();
        helperObject.createComparators();

        do {
            printMenu();
            choice = read.nextInt();
            handleMenu(choice);
        }
        while (choice != 0);
    }


    private static void handleMenu(int choice) {
        switch (choice) {
            case 1:
                createSolids();
                break;
            case 2:
                printSolids();
                break;
            case 3:
                sortSolids(colorComparator);
                break;
            case 4:
                sortSolids(heightComparator);
                break;
            case 5:
                sortSolids(colorAndHeightComparator);
                break;
            case 6:
                printSolidWithGreatestVolume();
                break;
            case 0:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }


    private static void printMenu() {
        System.out.print(
                "\n======= MENU: =======\n" +
                "1 - Utworz bryly\n" +
                "2 - Wyswietl wszystkie bryly\n" +
                "3 - Sortuj bryly wg koloru\n" +
                "4 - Sortuj bryly wg wysokosci\n" +
                "5 - Sortuj bryly wg koloru i wysokosci\n" +
                "6 - Wyswietl bryle o najwiekszej objetosci\n" +
                "0 - Wyjscie\n\n" +

                "Wybierz opcje: ");
    }


    //  ==  Private methods ============================================================================================

    private static void createSolids() {
        addSolid(new Prostopadloscian());
        addSolid(new Prostopadloscian("Red", 4, 6, 7));
        addSolid(new Prostopadloscian("Yellow", 10, 10, 10));
        addSolid(new Prostopadloscian("Yellow", 5, 4, 3));
        addSolid(new Walec());
        addSolid(new Walec("Yellow", 5, 5));
        addSolid(new Walec("Green", 17, 20));
        addSolid(new Walec("Blue", 2, 5));
    }


    private static void addSolid(Bryla solid) {
        if (solids != null) solids.add(solid);
    }


    private static void printSolids() {
        if (solids == null || solids.isEmpty()) return;

        System.out.println("\nSolids:");
        for (Bryla solid : solids) {
            System.out.println(solid);
        }
    }


    private void createComparators() {
        colorComparator = new ColorComparator();
        heightComparator = new HeightComparator();
        colorAndHeightComparator = new ColorAndHeightComparator();
    }


    private static void sortSolids(Comparator<Bryla> comparator) {
        if (solids == null) return;

        solids.sort(comparator);
    }


    private static void printSolidWithGreatestVolume() {
        HashMap<Bryla, Integer> result = findSolidWithGreatestVolume();
        if (solids == null || result == null) return;

        Bryla resultSolid = result.keySet().iterator().next();

        System.out.println("Solid with greatest volume: " + resultSolid + ", found on index: " + result.get(resultSolid));
    }


    private static HashMap<Bryla, Integer> findSolidWithGreatestVolume() {
        if (solids == null || solids.isEmpty()) return null;

        HashMap<Bryla, Integer> result = new HashMap<>();
        Bryla resultSolid = solids.getFirst();
        double maxVolume = Double.MIN_VALUE;
        int resultIndex = -1;

        for (int i = 0; i < solids.size(); i++) {
            Bryla currentSolid = solids.get(i);

            if (currentSolid.Objetosc() > maxVolume) {
                maxVolume = currentSolid.Objetosc();
                resultSolid = currentSolid;
                resultIndex = i;
            }
        }

        result.put(resultSolid, resultIndex);
        return result;
    }


    //  ================================================================================================================
    //  ==  Comparators
    //  ================================================================================================================

    private class ColorComparator implements Comparator<Bryla> {
        public int compare(Bryla solid1, Bryla solid2) {
            return solid1.getKolor().compareTo(solid2.getKolor());
        }
    }


    private class HeightComparator implements Comparator<Bryla> {
        @Override
        public int compare(Bryla solid1, Bryla solid2) {
            return solid1.getH() - solid2.getH();
        }
    }


    private class ColorAndHeightComparator implements Comparator<Bryla> {
        ColorComparator colorComparator = new ColorComparator();
        HeightComparator heightComparator = new HeightComparator();

        @Override
        public int compare(Bryla solid1, Bryla solid2) {
            int colorComparison = colorComparator.compare(solid1, solid2);

            if (colorComparison != 0) return colorComparison;
            else return heightComparator.compare(solid1, solid2);
        }
    }
}
