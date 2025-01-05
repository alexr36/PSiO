package List6;

public abstract class Dog extends Animal {
    //  Stałe pola
    private static final String DEFAULT_DOG_NAME = "Dog";

    //  Zmienne pola
    private boolean isAngry;

    //  Konstruktory
    public Dog() {
        super();
        setName(DEFAULT_DOG_NAME);
        isAngry = false;
    }

    public Dog(String name, int age, boolean isAngry) {
        super(name, age);
        this.isAngry = isAngry;
    }

    public void biteVet(Vet vet) {
        if (isAngry) vet.setBitten(true);
        else System.out.println("This dog doesn't bite.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Is angry?: " + isAngry);
    }

    @Override
    public void makeSound() {
        if (isAngry) System.out.println("Angry woof...");
        else System.out.println("Woof woof...");
    }

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean isAngry) {
        this.isAngry = isAngry;
    }

    public String getDefaultDogName() {
        return DEFAULT_DOG_NAME;
    }
}
