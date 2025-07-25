package List4;

import java.util.Random;

public class Main {
    //  --  ZADANIE 1   ------------------------------------------------------------------------------------------------

    private static int[] ints = new int[100];
    private static Random rand = new Random();

    //  Wypełnianie tablicy wartoścami losowymi
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
    }

    //  Znajdowanie maksymalnej wartości w tablicy
    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    //  Znajdowanie minimalnej wartosci w tablicy
    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    //  Obliczanie średniej wartości elementu tablicy
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    //  Wyodrębnienie parzystych elementów tablicy
    public static int[] extractEvens(int[] array) {
        //  Obliczenie długości tablicy wynikowej
        int result_length = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result_length++;
            }
        }

        int[] result = new int[result_length];

        //  Przepisanie elementów parzystych do tablicy wynikowej
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < result_length; j++) {
                if (array[i] % 2 == 0) {
                    result[j] = array[i];
                }
            }
        }

        return result;
    }

    //  Wyświetlanie tablicy
    public static void printArray(int[] array) {
        System.out.print("Array: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }

    //  --  ZADANIE 3   ------------------------------------------------------------------------------------------------

    //  Mnożenie macierzy
    public static int[][] multiplyMatrices(int[][] matrix_a, int[][] matrix_b) {
        int[][] result = new int[matrix_a.length][matrix_b[0].length];
        int sum;

        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_b[0].length; j++) {
                sum = 0;

                for (int k = 0; k < matrix_a[0].length; k++) {
                    sum += matrix_a[i][k] * matrix_b[k][j];
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    //  Wyświetlanie macierzy
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("|");
        }
    }

    //  --  ZADANIE 4   ------------------------------------------------------------------------------------------------

    private static int[][] customMatrix = {new int[4], new int[2], new int[3], new int[2], new int[5]};

    //  Znajdowanie maksymalnej wartości w macierzy
    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    //  Wypełnianie macierzy wartościami losowymi
    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt();
            }
        }
    }

    //  --  Testy   ----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        //  ZADANIE 1
        System.out.println("######### ZADANIE 1 #########");

        fillArray(ints);
        printArray(ints);

        System.out.println("Max: " + findMax(ints));
        System.out.println("Min: " + findMin(ints));
        System.out.println("Avg: " + calculateAverage(ints));
        printArray(extractEvens(ints));

        //  ZADANIE 3
        System.out.println("\n######### ZADANIE 3 #########");

        int[][] test_matrix_a = {{1, 0, 2}, {-1, 3, 1}};
        int[][] test_matrix_b = {{3, 1}, {2, 1}, {1, 0}};

        System.out.println("A x B = ");
        printMatrix(multiplyMatrices(test_matrix_a, test_matrix_b));

        //  ZADANIE 4
        System.out.println("\n######### ZADANIE 4 #########");
        fillMatrix(customMatrix);
        printMatrix(customMatrix);

        System.out.println("Max: " + findMax(customMatrix));
    }
}
