package List3;

public class Point {
    private static final double DEFAULT_POINT_VALUE = 1;
    private double x;
    private double y;

    //  Default constructor
    public Point() {
        x = DEFAULT_POINT_VALUE;
        y = -DEFAULT_POINT_VALUE;
    }

    //  Overloaded constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //  --  Getters and setters   ----------------------------------------------

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
