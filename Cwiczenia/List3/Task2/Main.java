package List3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Default Rectangle: ");
        Rectangle default_rectangle = new Rectangle();
        System.out.println("Area: " + default_rectangle.calculateArea());
        System.out.println("Perimeter: " + default_rectangle.calculatePerimeter());
        System.out.println("Diagonal: " + default_rectangle.calculateDiagonal());

        System.out.println("\nCustom Rectangle: ");
        Rectangle rectangle = new Rectangle(5.2, 7.2, -214.2, 62);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle.calculateDiagonal());
    }
}
