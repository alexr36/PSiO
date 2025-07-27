package List6;

public class Eye {
    //  Constant fields
    private static final String DEFAULT_EYE_COLOR = "Black";
    private final Spider owner;

    //  Variable fields
    private String color;

    //  Constructors
    public Eye(Spider owner) {
        color = DEFAULT_EYE_COLOR;
        this.owner = owner;
    }

    public Eye(String color, Spider owner) {
        this.color = color;
        this.owner = owner;
    }

    public void printInfo() {
        System.out.println("Type: " + getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Owner: ");
        owner.printInfo();
    }

    //  --  Getters and setters   ----------------------------------------------

    public Spider getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getDefaultEyeColor() {
        return DEFAULT_EYE_COLOR;
    }
}
