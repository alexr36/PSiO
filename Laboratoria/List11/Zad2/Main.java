package List11.Zad2;

/*
 *  ================================================== IMPORTANT NOTE ==================================================
 *
 *  Results may be slightly inaccurate due to optimizations performed by JVM.
 *  Preferred way to carry out this experiment is to run only a couple of tests for each method
 *  and with every iteration to write down the resultant times (to a .json or .xml),
 *  then to calculate the average manually or by using a spreadsheet.
 *
 *  ====================================================================================================================
 */


public class Main {
    private static final int[] REPEATS = {100, 1000, 10000};

    //  Main testing method
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) throws Exception {
        String arithmeticExceptionMessage = ArithmeticException.class.getSimpleName() + ": ";
        String indexOutOfBoundsExceptionMessage = IndexOutOfBoundsException.class.getSimpleName() + ": ";

        for (int i = 0; i < REPEATS.length; i++) {
            int currentRepeats = REPEATS[i];
            long[] timesTryCatchArithmetic = new long[currentRepeats];
            long[] timesTryCatchIndexOutOfBounds = new long[currentRepeats];
            long[] timesThrowsArithmetic = new long[currentRepeats];
            long[] timesThrowsIndexOutOfBounds = new long[currentRepeats];

            for (int j = 0; j < currentRepeats; j++) {
                timesTryCatchArithmetic[j] = measureTime(Main::tryCatchTest, Main::arithmeticExceptionExample);
                timesTryCatchIndexOutOfBounds[j] = measureTime(Main::tryCatchTest, Main::indexOutOfBoundsExample);
                timesThrowsArithmetic[j] = measureTime(Main::throwsTest, Main::arithmeticExceptionExample);
                timesThrowsIndexOutOfBounds[j] = measureTime(Main::throwsTest, Main::indexOutOfBoundsExample);
            }

            long averageTryCatchArithmetic = calculateAverage(timesTryCatchArithmetic, currentRepeats);
            long averageTryCatchIndexOutOfBounds = calculateAverage(timesTryCatchIndexOutOfBounds, currentRepeats);
            long averageThrowsArithmetic = calculateAverage(timesThrowsArithmetic, currentRepeats);
            long averageThrowsIndexOutOfBounds = calculateAverage(timesThrowsIndexOutOfBounds, currentRepeats);

            System.out.println("\n#################### Repeats amount: " + currentRepeats + " ####################\n");

            System.out.println("Tests for Try-Catch:");
            printResult(averageTryCatchArithmetic, arithmeticExceptionMessage);
            printResult(averageTryCatchIndexOutOfBounds, indexOutOfBoundsExceptionMessage);

            System.out.println("\nTests for Throws:");
            printResult(averageThrowsArithmetic, arithmeticExceptionMessage);
            printResult(averageThrowsIndexOutOfBounds, indexOutOfBoundsExceptionMessage);
        }
    }


    private static long measureTime(ExceptionTest exceptionTest, ExceptionSupplier exceptionSupplier) {
        if (exceptionSupplier == null || exceptionTest == null) return Long.MIN_VALUE;

        long start = System.nanoTime();

        try {
            exceptionTest.test(exceptionSupplier);
        }
        catch (Exception ignored) {}    //  Empty for optimization purposes

        return System.nanoTime() - start;
    }


    private static void printResult(long time, String msg) {
        System.out.println("Time taken for " + msg + time + " ns");
    }


    //  ==  Auxiliary methods for calculating the results  =============================================================

    private static long calculateAverage(long[] times, int denominator) {
        return calculateSum(times) / denominator;
    }


    private static long calculateSum(long[] times) {
        long sum = 0;

        for (int i = 0; i < times.length; i++) {
            sum += times[i];
        }

        return sum;
    }


    //  ==  Methods for handling exceptions  ===========================================================================

    private static void tryCatchTest(ExceptionSupplier exceptionSupplier) {
        try {
            if (exceptionSupplier != null) exceptionSupplier.throwException();
        }
        catch (Exception ignored) {}    //  Empty for optimization purposes
    }


    private static void throwsTest(ExceptionSupplier exceptionSupplier) throws Exception {
        if (exceptionSupplier != null) exceptionSupplier.throwException();
    }


    //  ==  Methods that cause exceptions  =============================================================================

    //  Causes IndexOufOfBoundsException
    private static int indexOutOfBoundsExample() {
        int[] arr = new int[1];
        return arr[1];
    }


    //  Causes ArithmeticException
    private static int arithmeticExceptionExample() {
        return 1 / 0;
    }
}
