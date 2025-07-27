package List6;

public class Dachshund extends Dog {
    //  Constant fields
    private static final String DEFAULT_DACHSHUND_NAME = "Dachshund";

    //  Variable fields
    private double length;

    //  Constructors
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

    //  --  Getters and setters   ----------------------------------------------

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
