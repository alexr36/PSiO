public class List2 {
    //  --  ZADANIE 3   ------------------------------------------------------------------------------------------------

    public static int findMax(int[] ints) {
        int max = ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }

        return max;
    }

    //  --  ZADANIE 4   ------------------------------------------------------------------------------------------------

    public static double evaluateFunction(int n, double x) {
        if (n < 0) return Integer.MIN_VALUE;    //  Liczba wyrazów ciągu nie może być < 0

        double sum = 1;
        double term = 1;

        for (int k = 1; k <= n; k++) {
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
