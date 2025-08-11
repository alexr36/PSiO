import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    // -- Task 1 ---------------------------------------------------------------
    private static void task1() {
        int choice;

        do {
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();
        }
        while (choice < 0 || choice > 3);

        int side;
        switch (choice) {
            case 1:
                side = 2;
                handleChoice(side, side);
                break;
            case 2:
                System.out.print("Enter side length: ");
                side = scanner.nextInt();
                if (side >= 0) handleChoice(side, side);
                break;
            case 3:
                int side_a = 4;
                int side_b = 16;
                handleChoice(side_a, side_b);
                break;
            default:
                System.out.println("How did we even get here?");
        }
    }

    private static int calculateArea(int side_a, int side_b) { return side_a * side_b; }

    private static int calculatePerimeter(int side_a, int side_b) { return 2 * (side_a + side_b); }

    private static double calculateDiagonal(int side_a, int side_b) { return Math.sqrt(Math.pow(side_a, 2) + Math.pow(side_b, 2)); }

    private static void handleChoice(int side_a, int side_b) {
        printResult(side_a, side_b, calculateArea(side_a, side_b), calculatePerimeter(side_a, side_b), calculateDiagonal(side_a, side_b));
    }

    private static void printResult(int side_a, int side_b, int area, int perimeter, double diagonal) {
        System.out.printf(
            "Side A:\t\t%d\nSide B:\t\t%d\nArea:\t\t%d\nPerimeter:\t%d\nDiagonal:\t%.3f\n", 
            side_a, side_b, area, perimeter, diagonal
        );
    }


    // -- Task 2 ---------------------------------------------------------------
    private static void task2() {
        System.out.print("\nEnter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        double T;

        if (a >= b) {
            T = 2 * a + Math.abs(b) - 1;
            System.out.println("T = " + T);
            System.out.printf("%s %.3f\n", "T =", T);
        }
        else {
            T = Math.sin(a) - Math.pow(b, 2);
            System.out.println("T = " + T);
            System.out.printf("%s %.3f\n", "T =", T);
        }
    }


    // -- Task 3 ---------------------------------------------------------------
    private static void task3() {
        System.out.print("\nEnter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) return;

        if (Math.abs(b - c) < a && a < b + c) {
            System.out.println("Cannot build a triangle.");
            return;
        }

        double p = (a + b + c) / 2.0;
        System.out.println("Area = " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}