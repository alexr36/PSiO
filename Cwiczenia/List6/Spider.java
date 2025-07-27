package List6;

public class Spider extends Animal {
    //  Constant fields
    private static final String DEFAULT_SPIDER_NAME = "Spider";
    private static final int MAX_EYES_COUNT = 8;

    //  Variable fields
    private int eyes_count;
    private Eye[] eyes = new Eye[MAX_EYES_COUNT];

    //  Constructors
    public Spider() {
        super();
        eyes_count = 0;
        eyes = new Eye[0];
    }

    public Spider(String name, int age) {
        super(name, age);
    }

    public void addEye(Eye eye) {
        if (eyes.length < MAX_EYES_COUNT) {
            eyes[eyes_count] = eye;
            eyes_count++;
        }
        else {
            System.out.println("Cannot add more eyes.");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Eyes count: " + eyes_count);
        System.out.println("Eyes: ");

        if (eyes.length > 0) {
            for (Eye eye : eyes) {
                if (eye != null) eye.printInfo();
            }
        }
        else {
            System.out.println("No eyes.");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Hiss...");
    }

    //  --  Getters and setters  -----------------------------------------------

    public int getEyes_count() {
        return eyes_count;
    }

    public void setEyes_count(int eyes_count) {
        this.eyes_count = eyes_count;
    }

    public static int getMaxEyesCount() {
        return MAX_EYES_COUNT;
    }

    public static String getDefaultSpiderName() {
        return DEFAULT_SPIDER_NAME;
    }

    public Eye[] getEyes() {
        return eyes;
    }

    public void setEyes(Eye[] eyes) {
        this.eyes = eyes;
    }
}
