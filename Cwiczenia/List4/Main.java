package List4;

import java.util.Random;

public class Main {
    //  --  TASK 1   -----------------------------------------------------------

    private static int[] ints = new int[100];
    private static Random rand = new Random();

    //  Filling given array with random values
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
    }

    //  Finding maximum value in given array
    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }

        return max;
    }

    //  Finding minimum value in given array
    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    //  Calculating average value of elements in given array
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    //  Extracting even values from given array
    public static int[] extractEvens(int[] array) {
        //  Calculate the resultant array's length
        int result_length = 0;

        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) result_length++;
        }

        int[] result = new int[result_length];

        //  Move elements to the resultant array
        int i = 0;
        int j = 0;
        while (j < result_length && i < array.length) {
            if (isEven(array[i])) { 
                result[j] = array[i]; 
                j++;
            }
            i++;
        }
        
        return result;
    }


    private static boolean isEven(int num) { return num % 2 == 0; } 

    //  Showing given array
    public static void printArray(int[] array) {
        System.out.print("Array: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }

    //  --  TASK 3   -----------------------------------------------------------

    //  Multiplying matrices
    public static int[][] multiplyMatrices(int[][] matrix_a, int[][] matrix_b) {
        int[][] result = new int[matrix_a.length][matrix_b[0].length];

        if (matrix_a[0].length != matrix_b.length) {
            fillMatrix(result);
            return result;
        }

        int sum;
        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_b[i].length; j++) {
                sum = 0;

                for (int k = 0; k < matrix_a[i].length; k++) {
                    sum += matrix_a[i][k] * matrix_b[k][j];
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    //  Showing given matrix
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

    //  --  TASK 4   -----------------------------------------------------------

    private static int[][] customMatrix = {
        new int[4],
        new int[2], 
        new int[3],
        new int[2], 
        new int[5]
    };

    //  Finding maximum value in given matrix
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

    //  Filling given matrix with random values
    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt();
            }
        }
    }

    //  --  Tests   ------------------------------------------------------------

    public static void main(String[] args) {
        //  TASK 1
        System.out.println("######### ZADANIE 1 #########");

        fillArray(ints);
        printArray(ints);

        System.out.println("Max: " + findMax(ints));
        System.out.println("Min: " + findMin(ints));
        System.out.println("Avg: " + calculateAverage(ints));
        printArray(extractEvens(ints));

        //  TASK 3
        System.out.println("\n######### ZADANIE 3 #########");

        int[][] test_matrix_a = {
            {1, 0, 2}, 
            {-1, 3, 1}
        };
        int[][] test_matrix_b = {
            {3, 1, 1, 2}, 
            {2, 1, 1, 2}, 
            {1, 0, 1, 2}
        };

        System.out.println("A x B = ");
        printMatrix(multiplyMatrices(test_matrix_a, test_matrix_b));

        //  TASK 4
        System.out.println("\n######### ZADANIE 4 #########");
        fillMatrix(customMatrix);
        printMatrix(customMatrix);

        System.out.println("Max: " + findMax(customMatrix));
    }
}
