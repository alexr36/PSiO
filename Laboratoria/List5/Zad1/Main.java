package List5.Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String operation_type;
        int number1, number2;

        System.out.println("#### Simple calculator ####");

        System.out.print("Enter the operation type: ");
        operation_type = scanner.nextLine();

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        calculator.operation(operation_type, number1, number2);
    }
}
