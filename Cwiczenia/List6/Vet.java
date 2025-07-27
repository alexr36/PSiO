package List6;

public class Vet {
    //  Constants
    private boolean isBitten;

    //  Constructors
    public Vet() {
        isBitten = false;
    }

    public Vet(boolean isBitten) {
        this.isBitten = isBitten;
    }

    public void vaccinateAnimal(Dog dog) {
        if (dog.isVaccinated()) {
            System.out.println("The " + dog.getClass().getSimpleName() + " has already been vaccinated.");
        }
        else {
            System.out.println(dog.getClass().getSimpleName() + " has been vaccinated.");
            dog.setVaccinated(true);
            dog.setAngry(false);
        }
    }

    public void printInfo() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Was bitten: " + (isBitten ? "Bitten" : "Not bitten"));
    }

    //  --  Getters and setters   ----------------------------------------------

    public boolean isBitten() {
        return isBitten;
    }

    public void setBitten(boolean bitten) {
        isBitten = bitten;
    }
}
