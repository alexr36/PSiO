package List7;

public class Rysunki {
    private static final int DEFAULT_ARRAY_SIZE = 20;

    private static Bryla[] solids = new Bryla[DEFAULT_ARRAY_SIZE];
    private static int n;

    public static void main(String[] args) {
        insertSolids();
        findMaxAreaFigure();
        System.out.println();
        printSolids();
        System.out.println();
        printCylinders();
        System.out.println();
        printCuboids();
        System.out.println();
        System.out.println("Cubes: " + countCubes());
        System.out.println();
        System.out.println("Cylinders by rotating a square: " + countCylindersByRotatingSquare());
    }


    private static void insertSolids() {
        insertSolid(new Walec());
        insertSolid(new Prostopadloscian());
        insertSolid(new Walec("Not-default", 123, 2));
        insertSolid(new Walec("Special", 4, 2));
        insertSolid(new Prostopadloscian("Not-default", -4, 2, 4));
        insertSolid(new Prostopadloscian("Special", 4, 4, 4));
    }


    private static void findMaxAreaFigure() {
        double maxArea = solids[0].Pole();
        int index = 0;

        for (int i = 1; i < n; i++) {
            double currentArea = solids[i].Pole();

            if (currentArea > maxArea) {
                maxArea = currentArea;
                index = i;
            }
        }

        System.out.println("Solid with the greatest area is " + solids[index] +
                           ", placed on index " + index);
    }


    private static void printSolids() {
        System.out.println("Solids: ");

        for (int i = 0; i < n; i++) {
            System.out.println(solids[i]);
        }
    }


    private static void printCylinders() {
        System.out.println("Cylinders: ");

        for (int i = 0; i < n; i++) {
            Bryla currentSolid = solids[i];

            if (currentSolid instanceof Walec) {
                System.out.println(currentSolid);
            }
        }
    }


    private static void printCuboids() {
        System.out.println("Cuboids: ");

        for (int i = 0; i < n; i++) {
            Bryla currentSolid = solids[i];

            if (currentSolid instanceof Prostopadloscian) {
                System.out.println(currentSolid);
            }
        }
    }


    private static int countCubes() {
        int count = 0;

        for (int i = 0; i < n; i++) {
            Bryla currentSolid = solids[i];

            if (currentSolid instanceof Prostopadloscian &&
                ((Prostopadloscian) currentSolid).jestSzescianem()) {
                count++;
            }
        }

        return count;
    }


    private static int countCylindersByRotatingSquare() {
        int count = 0;

        for (int i = 0; i < n; i++) {
            Bryla currentSolid = solids[i];

            if (currentSolid instanceof Walec &&
                ((Walec) currentSolid).obrotKwadratu()) {
                count++;
            }
        }

        return count;
    }


    private static void insertSolid(Bryla solid) {
        if (n < DEFAULT_ARRAY_SIZE) solids[n++] = solid;
        else System.out.println("Cannot insert more elements.");
    }
}
