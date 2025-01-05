package List6;

public class Dachshund extends Dog {
    //  Stałe pola
    private static final String DEFAULT_DACHSHUND_NAME = "Dachshund";

    //  Zmienne pola
    private double length;

    //  Konstruktory
    public Dachshund() {
        super();
        setName(DEFAULT_DACHSHUND_NAME);
        length = 55.5;
    }

    public Dachshund(String name, int age, boolean isAngry, double length) {
        super(name, age, isAngry);
        this.length = length;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Length: " + length);
    }

    @Override
    public void makeSound() {
        System.out.println("*Quiet barking*");
        super.makeSound();
    }

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getDefaultDogName() {
        return DEFAULT_DACHSHUND_NAME;
    }
}
