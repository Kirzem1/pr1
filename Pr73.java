/*class MovablePoint implements Movable {
    int x;
    int y;

    MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        topLeft = new MovablePoint(x1, y1);
        bottomRight = new MovablePoint(x2, y2);

        */