package ListaDodatkowa;

public class Main {
    private static final int T = 1475;

    public static void run() {
        Histogram histogram = new Histogram();

        System.out.println("Histogram: ");
        histogram.printHistogram();

        System.out.print("Most frequent value(s): ");
        histogram.findMostFrequentValues();

        System.out.print("\nValues more frequent than " + T + ": ");
        histogram.findValuesMoreFrequentThan(T);
    }

    public static void main(String[] args) {
        run();
    }
}
