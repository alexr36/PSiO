package List5;

import java.util.Random;

public class Main {
    private static final Random rand = new Random();
    private static final int UPPER_RANGE_VALUE = 10;
    private static final int DEFAULT_SIZE = 1;
    private static final int ARRAY_ELEMENTS_NUM = 10;

    //  --  Aux methods   ------------------------------------------------------

    public static void fillArray(int[] arr, int upper_bound) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upper_bound) + 1;
        }
    }

    public static void fillArrayTask6(int[] arr, int upper_bound) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upper_bound);
        }
    }

    public static int[] createArray(int size, int upper_bound) {
        if (size <= 0 || upper_bound <= 0) return new int[DEFAULT_SIZE];

        int[] array = new int[size];

        fillArray(array, upper_bound);

        return array;
    }

    public static int[][] createMatrix(int size_x, int size_y, int upper_bound, int task_number) {
        if (size_x <= 0 || size_y <= 0 || upper_bound <= 0) return new int[DEFAULT_SIZE][DEFAULT_SIZE];

        int[][] matrix = new int[size_x][size_y];

        for (int i = 0; i < size_x; i++) {
            if (task_number == 6) {
                fillArrayTask6(matrix[i], upper_bound);
            }
            else {
                fillArray(matrix[i], upper_bound);
            }
        }

        return matrix;
    }

    //  Swapping elements in given array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //  Swapping elements in given matrix
    private static void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

    private static void printArray(int[] array) {
        System.out.print("Array: [ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("|");
        }
    }

    //  --  TASK 1   -----------------------------------------------------------

    public static void bubbleSortOneDimensional(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    //  --  TASK 2   -----------------------------------------------------------

    public static void bubbleSortTwoDimensionalRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            bubbleSortOneDimensional(matrix[i]);
        }
    }

    //  --  TASK 3   -----------------------------------------------------------

    public static int countDivisibilities(int[] array_a, int[] array_b) {
        int count;
        int divisibles = 0;

        for (int i = 0; i < array_a.length; i++) {
            count = 0;

            for (int j = 0; j < array_b.length; j++) {
                if (isDivisible(array_a[i], array_b[j])) {
                    count++;
                }
            }

            if (count >= 3) divisibles++;
        }


        return divisibles;
    }

    private static boolean isDivisible(int a, int b) {
        return a % b == 0;
    }

    //  --  TASK 4   -----------------------------------------------------------

    public static void bubbleSortTwoDimensionalCols(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = 0; k < matrix.length - 1 - j; k++) {
                    if (matrix[k + 1][j] < matrix[k][j]) {
                        swap(matrix, k, j, k + 1, j);
                    }
                }
            }
        }
    }

    //  --  TASK 5   -----------------------------------------------------------

    public static void fillCustomMatrix(int[][] matrix, int upper_bound) {
        for (int i = 0; i < matrix.length; i++) {
            fillArray(matrix[i], upper_bound);
        }
    }

    //  --  TASK 6   -----------------------------------------------------------

    public static int[][] generateMatrixForRelation() {
        return createMatrix(5, 5, 2, 6);
    }

    //  For every x: (x, x) belongs to the relation
    public static boolean isReflexive(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != 1) return false;
        }

        return true;
    }

    //  (x, y) belongs to the relation => (y, x) belongs to the relation
    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    //  For every x: (x, x) doesn't belong to the relation
    public static boolean isAntireflexive(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != 0) return false;
        }

        return true;
    }

    //  (x, y) belongs to the relation => (y, x) doesn't belong to the relation
    public static boolean isAsymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] == 1 &&  matrix[j][i] == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    //  --  Tests   ------------------------------------------------------------

    public static void test() {
        //  TASK 1
        System.out.println("################## TASK 1 ##################");
        int[] array_task1 = createArray(ARRAY_ELEMENTS_NUM, UPPER_RANGE_VALUE);
        printArray(array_task1);
        bubbleSortOneDimensional(array_task1);
        printArray(array_task1);

        //  TASK 2
        System.out.println("\n################## TASK 2 ##################");
        int[][] matrix_task2 = createMatrix(ARRAY_ELEMENTS_NUM, ARRAY_ELEMENTS_NUM * 2, UPPER_RANGE_VALUE, 2);
        printMatrix(matrix_task2);

        System.out.println();

        bubbleSortTwoDimensionalRows(matrix_task2);
        printMatrix(matrix_task2);

        //  TASK 3
        System.out.println("\n################## TASK 3 ##################");
        int[] array_1_task3 = createArray(ARRAY_ELEMENTS_NUM, UPPER_RANGE_VALUE);
        int[] array_2_task3 = createArray(ARRAY_ELEMENTS_NUM, UPPER_RANGE_VALUE);
        printArray(array_1_task3);
        printArray(array_2_task3);

        System.out.println("Divisibilities: " + countDivisibilities(array_1_task3, array_2_task3));

        //  TASK 4
        System.out.println("\n################## TASK 4 ##################");
        int[][] matrix_task4 = createMatrix(ARRAY_ELEMENTS_NUM, ARRAY_ELEMENTS_NUM * 2, UPPER_RANGE_VALUE, 4);
        printMatrix(matrix_task4);

        System.out.println();

        bubbleSortTwoDimensionalCols(matrix_task4);
        printMatrix(matrix_task4);

        //  TASK 5
        System.out.println("\n################## TASK 5 ##################");
        int[][] matrix_task5 = {
            new int[4],
            new int[2], 
            new int[3], 
            new int[2], 
            new int[5]
        };
        fillCustomMatrix(matrix_task5, UPPER_RANGE_VALUE);
        printMatrix(matrix_task5);

        bubbleSortTwoDimensionalRows(matrix_task5);
        printMatrix(matrix_task5);

        //  TASK 6
        System.out.println("\n################## TASK 6 ##################");
        int[][] matrix_task6 = generateMatrixForRelation();

        System.out.println("Generated relation: ");
        printMatrix(matrix_task6);

        System.out.println("Reflexive relation: " + isReflexive(matrix_task6));
        System.out.println("Symmetric relation: " + isSymmetric(matrix_task6));
        System.out.println("Antireflexive relation: " + isAntireflexive(matrix_task6));
        System.out.println("Asymmetric relation: " + isAsymmetric(matrix_task6));
    }

    public static void main(String[] args) {
        test();
    }
}
