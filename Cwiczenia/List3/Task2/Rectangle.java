package List3;

public class Rectangle {
    private Point point_a;
    private Point point_b;

    //  Konstruktor domyślny
    public Rectangle() {                    //  Pa(1; -1), Pb(-1; 1)
        point_a = new Point();
        point_b = new Point(-1, 1);
    }

    //  Konstruktor przeciążony
    public Rectangle(double x1, double y1, double x2, double y2) {
        if (validateCoordinates(x1, y1) && validateCoordinates(x2, y2)) {
            this.point_a = new Point(x1, y1);
            this.point_b = new Point(x2, y2);
        }
        else new Rectangle();
    }

    public double calculateArea() {
        return Math.abs(point_a.getX() - point_b.getX()) * Math.abs(point_a.getY() - point_b.getY());                   //  |x2 - x1| * |y2 - y1|
    }

    public double calculatePerimeter() {
        return 2 * (Math.abs(point_a.getX() - point_b.getX()) + Math.abs(point_a.getY() - point_b.getY()));             //  2 * (|x2 - x1| + |y2 - y1|)
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(point_a.getX() - point_b.getX(), 2) + Math.pow(point_a.getY() - point_b.getY(), 2));  //  |x2 - x1|^2 + |y2 - y1|^2
    }

    private boolean validateCoordinates(double a, double b) {
        return a != b;
    }

    //  --  Gettery i settery   ----------------------------------------------------------------------------------------

    public Point getPoint_a() {
        return point_a;
    }

    public void setPoint_a(Point point_a) {
        this.point_a = point_a;
    }

    public Point getPoint_b() {
        return point_b;
    }

    public void setPoint_b(Point point_b) {
        this.point_b = point_b;
    }
}
