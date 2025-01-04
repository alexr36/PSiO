package List3;

public class Point {
    private static final double DEFAULT_POINT_VALUE = 1;
    private double x;
    private double y;

    //  Konstruktor domyślny
    public Point() {
        x = DEFAULT_POINT_VALUE;
        y = -DEFAULT_POINT_VALUE;
    }

    //  Konstruktor przeciążony
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
