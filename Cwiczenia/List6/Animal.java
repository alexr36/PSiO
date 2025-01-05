package List6;

public abstract class Animal {
    //  Stałe pola
    private static final String DEFAULT_NAME_UNKNOWN = "Unknown Animal";

    //  Zmienne pola
    private String name;
    private int age;
    private boolean isVaccinated;

    //  Konstruktory
    public Animal() {
        name = DEFAULT_NAME_UNKNOWN;
        age = Integer.MIN_VALUE;
        isVaccinated = false;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        isVaccinated = false;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void printInfo() {
        System.out.println("Type: " + getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Vaccinated: " + isVaccinated);
    }

    public abstract void makeSound();

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
