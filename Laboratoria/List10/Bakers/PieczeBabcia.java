package List10.Bakers;

import List10.Cake.Ciasto;
import List10.Fruits.*;
import List10.Techniques.*;

import java.util.Random;

public class PieczeBabcia extends Ciasto {
    //  ==  Class fields  ==============================================================================================
    private static final String APPLEPIE_MESSAGE = "Ciasto pieczone przez babcie to szarlotka.";
    private static final String PLUMCAKE_MESSAGE = "Ciasto pieczone przez babcie to ciasto sliwkowe.";
    private static final Random rand = new Random();

    private int whoChoice;
    private int howChoice;


    //  ==  Constructors  ==============================================================================================

    public PieczeBabcia(int whoChoice, int howChoice) {
        this.whoChoice = whoChoice;
        this.howChoice = howChoice;

        switch (whoChoice) {
            case 1:
                handleBaking(new Kostka(), new Zmiksowane());
                break;
            case 2:
                handleBaking(new Cwiartki(), new Polowki());
                break;
            default:
                handleBaking(randomAppleType(), randomPlumType());
        }
    }


    //  ==  Public methods  ============================================================================================

    @Override
    public void wyswietlInfo() {
        switch (whoChoice) {
            case 1:
                printTypeOfCake(getAlgorytmInfoJablko());
                wykonajSzarlotke();
                break;
            case 2:
                printTypeOfCake(getAlgorytmInfoSliwka());
                wykonajCiastoSliwkowe();
                break;
            default:
                System.out.println("Babcia miala piec ciasto, ale nie wie jak.");
        }
    }


    //  ==  Private methods  ===========================================================================================

    private void printTypeOfCake(String type) {
        System.out.println("Babcia piecze ciasto. " + type);
    }


    private void handleBaking(Jablko jablkoType, Sliwka sliwkaType) {
        ustawSzarlotke(jablkoType, APPLEPIE_MESSAGE);
        ustawCiastoSliwkowe(sliwkaType, PLUMCAKE_MESSAGE);
    }


    private Jablko randomAppleType() {
        int randomChoice = rand.nextInt(2);

        if (randomChoice == 0) return new Kostka();
        else if (randomChoice == 1) return new Cwiartki();
        else return null;
    }


    private Sliwka randomPlumType() {
        int randomChoice = rand.nextInt(2);

        if (randomChoice == 0) return new Zmiksowane();
        else if (randomChoice == 1) return new Polowki();
        else return null;
    }


    //  ==  Getters and Setters ========================================================================================

    public int getWhoChoice() {
        return whoChoice;
    }

    public int getHowChoice() {
        return howChoice;
    }

    public void setWhoChoice(int whoChoice) {
        this.whoChoice = whoChoice;
    }

    public void setHowChoice(int howChoice) {
        this.howChoice = howChoice;
    }
}
