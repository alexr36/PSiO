package List14;

public class Main {
    public static void main(String[] args) {
        //  Creating the subject
        Zegar zegar = new Zegar();

        //  Creating the observers
        ZegarCyfrowy zegarCyfrowy = new ZegarCyfrowy(zegar);
        ZegarAnalogowy zegarAnalogowy = new ZegarAnalogowy(zegar);


        zegar.Tykniecie();
        zegar.Tykniecie();

        zegar.setSecondsFromMidnight(15);

        zegar.Przesun(2, 35, 4);
        zegar.Przesun(2, 15, 0);
    }
}
