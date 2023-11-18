/*import java.lang.Math;

class Point {
    protected double x;
    protected double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Параметризованный конструктор
    Point(Point p, double d) {
        this(p.x + d, p.y);
    }

    String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

class VelocityPoint extends Point {
    double speed;

    VelocityPoint(Point point, double speed) {
        super(point, speed);
        this.speed = speed;
    }

    String toString() {
        return super.toString() + " - скорость: " + speed;
    }

    boolean SpeedTest(VelocityPoint point) {
        // Метод для проверки скорости
        return (this.speed == point.speed);
    }
}
*/