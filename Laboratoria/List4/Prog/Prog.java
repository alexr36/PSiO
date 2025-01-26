package List4.Prog;

import List4.Wielomian.Wielomian;

public class Prog {
    public static void main(String[] args) {
        Wielomian polynomial = new Wielomian();
        double x = 2.0;
        int n;
        double res;

        n = 0;
        res = polynomial.Czebyszew(n, x);
        System.out.println("Czebyszew for x = " + x + ", n = " + n + ": " + res);

        n = 1;
        res = polynomial.Czebyszew(n, x);
        System.out.println("Czebyszew for x = " + x + ", n = " + n + ": " + res);

        n = 4;
        res = polynomial.Czebyszew(n, x);
        System.out.println("Czebyszew for x = " + x + ", n = " + n + ": " + res);
    }
}
