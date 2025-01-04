public class List2 {
    //  --  ZADANIE 3   ------------------------------------------------------------------------------------------------

    public static int findMax(int[] ints) {
        bubbleSort(ints);
        return ints[0];         //  Lista powinna być posortowana malejąco
    }

    //  Metoda do sortowania listy - pomocnicza do znajdowania maksymalnej w liście
    private static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    swap(ints, j, j + 1);
                }
            }
        }
    }

    //  Metoda pomocznicza do zamiany elementów o podanych indeksach miejscami
    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    //  --  ZADANIE 4   ------------------------------------------------------------------------------------------------

    public static double evaluateFunction(double n, double x) {
        if (n < 0) return Integer.MIN_VALUE;    //  Liczba wyrazów ciągu nie może być < 0

        double sum = 1;
        double term = 1;

        for (int k = 1; k < n; k++) {
            term = term * (x / k);     //  term = x^k / k!
            sum += term;
        }

        return sum;
    }

    //  Testy
    public static void main(String[] args) {
        //  ZADANIE 3

        int result_task_3 = findMax(new int[]{7, 521, 513, 564, 5});                //  564
        System.out.println("Maximum value in the list: " + result_task_3);

        //  ZADANIE 4
        double result_task_4 = evaluateFunction(100, 2);
        System.out.println("Evauluation of [f(x) = e^x]: " + result_task_4);        //  7.389056
    }
}
