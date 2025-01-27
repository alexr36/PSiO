package List6.Zad2;

import java.util.Random;

public class Main {
    private static final int ARRAY_SIZE = 20;
    private static final int RANGE_LOWER_BOUND = -100;
    private static final int RANGE_UPPER_BOUND = 100;
    private static final Random rand = new Random();


    public static void main(String[] args) {
        int[] A = generateArray();
        System.out.println("Array A: ");
        printArray(A);

        int[] B = insertCustom(A);
        System.out.println("Array B: ");
        printArray(B);

        System.out.println();

        int max_index = indexOfMax(A);
        System.out.println("Index of the element with the highest value: " + max_index);

        int odds_number = countOdds(A);
        System.out.println("Odds number: " + odds_number);


    }


    //  ==  Main methods ===============================================================================================

    private static int indexOfMax(int[] A) {
        int max = A[0];
        int index = 0;

        for (int i = 1; i < A.length; i++) {
            if (max <= A[i]) {
                max = A[i];
                index = i;
            }
        }

        return index;
    }


    private static int countOdds(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) count++;
        }

        return count;
    }


    private static int[] insertCustom(int[] A) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) result[i] = A[i] * A[i];     //  If odd then square
            else result[i] = A[i] / 10;                     //  Else cut the units digit
        }

        return result;
    }


    //  ==  Methods for creating, filling or viewing the array =========================================================

    private static int[] generateArray() {
        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(RANGE_LOWER_BOUND, RANGE_UPPER_BOUND + 1);
        }

        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
