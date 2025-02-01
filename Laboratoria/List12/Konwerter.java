package List12;

public class Konwerter {
    private static final double przelicznik = 1.8;


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / przelicznik;         //  C = (F - 32) / 1.8
    }


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * przelicznik) + 32;            //  F = C * 1.8 + 32
    }
}
