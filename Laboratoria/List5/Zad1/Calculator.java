package List5.Zad1;

public class Calculator {
    public void operation(String type, int a, int b) {
        double result;

        switch (type) {
            case "+":
                result = addition(a, b);
                System.out.println("Result: " + result);
                break;
            case "-":
                result = subtraction(a, b);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = multiplication(a, b);
                System.out.println("Result: " + result);
                break;
            case "/":
                result = division(a, b);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Unknown operation: " + type);
        }
    }


    private double addition(double a, double b) {
        return a + b;
    }


    private double subtraction(double a, double b) {
        return a - b;
    }


    private double multiplication(double a, double b) {
        return a * b;
    }


    private double division(double a, double b) {
        if (b == 0) return Integer.MAX_VALUE;

        return a / b;
    }
}
