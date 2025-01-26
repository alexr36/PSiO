package List4.Wielomian;

public class Wielomian {
    public static double Czebyszew(int n, double x) {
        if (n < 0) return Integer.MIN_VALUE;

        double term_0 = 1.0;
        double term_1 = x;
        double term_n = 0.0;

        if (n == 0) return term_0;
        if (n == 1) return term_1;

        for (int i = 2; i <= n; i++) {
            term_n = 2 * x * term_1 - term_0;
            term_0 = term_1;
            term_1 = term_n;
        }

        return term_n;
    }
}
