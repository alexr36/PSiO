package List6;

public class Main {
    private static void test() {
        Vet vet = new Vet();
        vet.printInfo();

        System.out.println();

        Animal animal = new Spider();
        animal.eat();
        animal.makeSound();
        animal.printInfo();

        System.out.println();

        Dog dachshund = new Dachshund("Fafik", 4, false, 46.7);
        dachshund.eat();
        dachshund.makeSound();
        dachshund.printInfo();
        System.out.println();

        Dog labrador = new Labrador("Szarik", 1, true, 50.22);
        labrador.eat();
        labrador.makeSound();
        labrador.printInfo();
        System.out.println();

        labrador.biteVet(vet);
        vet.vaccinateAnimal(labrador);
        labrador.printInfo();
        System.out.println();
        vet.printInfo();
        System.out.println();

        vet.vaccinateAnimal(labrador);

        System.out.println();

        Spider spider = new Spider("Bobik", 2);
        spider.eat();
        spider.makeSound();
        spider.printInfo();

        System.out.println();
        spider.addEye(new Eye("red", spider));
        spider.addEye(new Eye("blue", spider));

        spider.printInfo();
    }

    public static void main(String[] args) {
        test();
    }
}
