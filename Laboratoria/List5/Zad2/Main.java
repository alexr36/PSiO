package List5.Zad2;

public class Main {
    public static void main(String[] args) {
        Latarka flashlight = new Latarka();

        flashlight.Wlacz();
        flashlight.Wylacz();
        flashlight.Wlacz();
        flashlight.ZmienKolor(2);
        flashlight.Drukuj();
        flashlight.Wylacz();
    }
}
