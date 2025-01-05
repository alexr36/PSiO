package List6;

public class Labrador extends Dog {
    //  Stałe pola
    private static final String DEFAULT_LABRADOR_NAME = "Labrador";

    //  Zmienne pola
    private double height;

    //  Konstruktory
    public Labrador() {
        super();
        setName(DEFAULT_LABRADOR_NAME);
        height = 80.2;
    }

    public Labrador(String name, int age, boolean isAngry, double height) {
        super(name, age, isAngry);
        this.height = height;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Height: " + height);
    }

    @Override
    public void makeSound() {
        System.out.println("*Loud barking*");
        super.makeSound();
    }

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getDefaultDogName() {
        return DEFAULT_LABRADOR_NAME;
    }
}
