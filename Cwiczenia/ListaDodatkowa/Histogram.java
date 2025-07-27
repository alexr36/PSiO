package ListaDodatkowa;

import java.util.Random;

public class Histogram {
    private static final int MIN_X_SIZE = 550;
    private static final int MIN_Y_SIZE = 650;
    private static final int MAX_MATRIX_VALUE = 255;
    private static final Random rand = new Random();

    private int[][] matrix;
    private int most_frequent_elements_count = 0;
    private int more_frequent_elements_than_count = 0;

    public Histogram() {
        matrix = new int[MIN_X_SIZE][MIN_Y_SIZE];
        fillMatrix();
    }

    public Histogram(int x_size, int y_size) {
        if (x_size < MIN_X_SIZE || y_size < MIN_Y_SIZE) {
            new Histogram();
        }
        else {
            matrix = new int[x_size][y_size];
            fillMatrix();
        }
    }

    //  Printing frequency of occurance of each element
    public void printHistogram() {
        for (int i = 0; i < MAX_MATRIX_VALUE + 1; i++) {
            int appearances = countAppearances(i);
            System.out.println("Value " + i + " appeared " + appearances + " times.");
        }
    }

    public void findMostFrequentValues() {
        printArray(collectElementsOfFrequency(findMaxValue(getFrequencies())));
    }

    public void findValuesMoreFrequentThan(int T) {
        printArray(collectElementsOfFrequencyHigherThan(T));
    }

    //  ==  Aux methods  =======================================================

    private void addToMostFrequent(int value, int[] result) {
        if (most_frequent_elements_count < MAX_MATRIX_VALUE) {
            result[most_frequent_elements_count] = value;
            most_frequent_elements_count++;
        }
    }

    private void addToMoreFrequentThan(int value, int[] result) {
        if (more_frequent_elements_than_count < MAX_MATRIX_VALUE) {
            result[more_frequent_elements_than_count] = value;
            more_frequent_elements_than_count++;
        }
    }

    private int[] collectElementsOfFrequency(int frequency) {
        int[] result = new int[countElementsOfFrequency(frequency)];

        for (int i = 0; i < MAX_MATRIX_VALUE; i++) {
            if (countAppearances(i) == frequency) {
                addToMostFrequent(i, result);
            }
        }

        return result;
    }

    private int[] collectElementsOfFrequencyHigherThan(int frequency) {
        int[] result = new int[countElementsOfFrequencyHigherThan(frequency)];

        for (int i = 0; i < MAX_MATRIX_VALUE; i++) {
            if (countAppearances(i) > frequency) {
                addToMoreFrequentThan(i, result);
            }
        }

        return result;
    }

    //  Gathering frequency of occurance of each element in the matrix
    private int[] getFrequencies() {
        int[] frequencies = new int[matrix.length];

        for (int i = 0; i < MAX_MATRIX_VALUE + 1; i++) {
            frequencies[i] = countAppearances(i);
        }

        return frequencies;
    }

    private int findMaxValue(int[] values) {
        int max_value = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max_value) {
                max_value = values[i];
            }
        }

        return max_value;
    }

    //  Calculating frequency of occurance of elements
    private int countElementsOfFrequency(int frequency) {
        int count = 0;

        for (int i = 0; i < MAX_MATRIX_VALUE + 1; i++) {
            if (frequency == countAppearances(i)) {
                count++;
            }
        }

        return count;
    }

    //  Calculating number of occurances of each value in histogram 
    //  with frequency higher than given one
    private int countElementsOfFrequencyHigherThan(int frequency) {
        int count = 0;

        for (int i = 0; i < MAX_MATRIX_VALUE; i++) {
            if (countAppearances(i) > frequency) {
                count++;
            }
        }

        return count;
    }

    //  Printing number of occurances of each value in histogram
    private int countAppearances(int sought_value) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == sought_value) {
                    count++;
                }
            }
        }

        return count;
    }

    //  Filling matrix with values from range [0; 255]
    private void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(MAX_MATRIX_VALUE + 1);
            }
        }
    }

    private void printArray(int[] array) {
        if (array != null) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }

    //  ==  Getters and setters  ===============================================

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
