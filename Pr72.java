class Point {
    private int x, y;
    private double speed;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean speedTest(Point otherPoint) {
        return this.speed == otherPoint.speed;
    }
}

public class Pr72 {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4, 10.0);
        Point point2 = new Point(5, 8, 10.0);

        System.out.println("Point 1: " + point1.convertToString());
        System.out.println("Point 2: " + point2.convertToString());

        if (point1.speedTest(point2)) {
            System.out.println("Both points have the same speed.");
        } else {
            System.out.println("Points have different speeds.");
        }
    }
}