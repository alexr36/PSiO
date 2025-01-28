package List8;

public class Przychodnia {
    private static final int PEOPLE_COUNT = 20;
    private static final Osoba[] people = new Osoba[PEOPLE_COUNT];
    private static int n = 0;

    public static void main(String[] args) {
        insertPeople();
        printPeople();
        System.out.println();
        printDoctors();
        System.out.println();
        printPatients();
        System.out.println();
        printBestEarningDoctor();
    }


    private static void insertPerson(Osoba person) {
        people[n++] = person;
    }


    private static void insertPeople() {
        insertPerson(new Lekarz("Kowalski", "23531564235", "internista", 5000));
        insertPerson(new Lekarz());
        insertPerson(new Pacjent());
        insertPerson(new Pacjent("Nowak", "12345678901", 4));
    }


    private static void printPeople() {
        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }
    }


    private static void printDoctors() {
        for (int i = 0; i < n; i++) {
            Osoba currentPerson = people[i];

            if (currentPerson instanceof Lekarz) {
                System.out.println(currentPerson + " ");
                ((Lekarz) currentPerson).wyswietlLiczbePacjentow();
            }
        }
    }


    private static void printPatients() {
        for (int i = 0; i < n; i++) {
            Osoba currentPerson = people[i];

            if (currentPerson instanceof Pacjent) {
                System.out.println(currentPerson + " ");
                ((Pacjent) currentPerson).wyswietlWizyty();
            }
        }
    }


    private static void printBestEarningDoctor() {
        double maxEarnings = 0;
        Lekarz bestEarningDoctor = null;

        for (int i = 0; i < n; i++) {
            Osoba currentPerson = people[i];

            if (currentPerson instanceof Lekarz) {
                double currentEarnings = currentPerson.Oblicz();

                if (maxEarnings < currentEarnings) {
                    bestEarningDoctor = (Lekarz) currentPerson;
                    maxEarnings = currentEarnings;
                }
            }
        }

        System.out.println("Best earning doctor: ");
        System.out.println(bestEarningDoctor + ", Paid: " + maxEarnings);
    }
}
