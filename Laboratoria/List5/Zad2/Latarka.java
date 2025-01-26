package List5.Zad2;


public class Latarka {
    private int color;
    private static final int COLOR_WHITE = 0;
    private static final int COLOR_GREEN = 1;
    private static final int COLOR_RED = 2;

    private int state;
    private static final int STATE_OFF = 0;
    private static final int STATE_ON = 1;


    public Latarka() {
        color = COLOR_WHITE;
        state = STATE_OFF;
    }


    public void Wlacz() {
        state = STATE_ON;
        color = COLOR_WHITE;

        Drukuj();
    }


    public void Wylacz() {
        state = STATE_OFF;

        Drukuj();
    }


    public void ZmienKolor(int newColor) {
        color = newColor;

        System.out.println("Zmieniono kolor swiatla.");
    }


    public void Drukuj() {
        if (state == STATE_OFF) {
            System.out.println("Latarka wylaczona.");
        }

        if (state == STATE_ON) {
            System.out.print("Latarka wlaczona i swieci swiatlem ");

            switch(color) {
                case COLOR_WHITE:
                    System.out.print("bialym.\n");
                    break;
                case COLOR_GREEN:
                    System.out.print("zielonym.\n");
                    break;
                case COLOR_RED:
                    System.out.print("czerwonym.\n");
                    break;
                default:
                    System.out.print("nieznanym.\n");
            }
        }
    }
}
