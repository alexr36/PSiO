package List3.Biblioteka;

public class Functions {

    //  sin(x)
    public static double sin(double x, double n) {
        if (n < 0) return Integer.MIN_VALUE;    //  Number of terms cannot be < 0

        double sum = x;
        double numerator = x;
        double denominator = 1;
        double term;

        for (int i = 1; i <= n; i++) {
            numerator *= x * x;
            denominator *= 2 * i * (2 * i + 1);

            //  term = (-1)^i * (x^(2i + 1) / (2i + 1)!
            if (i % 2 == 0) term = numerator / denominator;
            else term = -1 * numerator / denominator;

            sum += term;
        }

        return sum;
    }

    //  cos(x)
    public static double cos(double x, double n) {
        if (n < 0) return Integer.MIN_VALUE;    //  Number of terms cannot be < 0

        double sum = 1;
        double numerator = 1;
        double denominator = 1;
        double term;

        for (int i = 1; i < n; i++) {
            numerator *= x * x;
            denominator *= 2 * i * (2 * i - 1);

            //  term = (-1)^k * x^2i / 2i!
            if (i % 2 == 0) term = numerator / denominator;
            else term = -1 * numerator / denominator;

            sum += term;
        }

        return sum;
    }

    // e^x
    public static double ex(double x, double n) {
        if (n < 0) return Integer.MIN_VALUE;    //  Number of terms cannot be < 0

        double sum = 1;
        double term = 1;

        for (int i = 1; i <= n; i++) {
            term = term * (x / i);              //  term = x^i / i!
            sum += term;
        }

        return sum;
    }
}
