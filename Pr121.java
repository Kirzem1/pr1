import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected int x, y;
    protected Color color;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }

    public abstract void draw(Graphics g);

    private Color getRandomColor() {
        Random rnd = new Random();
        return new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
        this.radius = 20;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y) {
        super(x, y);
        this.width = 40;
        this.height = 30;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class Pr121 extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private Shape[] shapes;

    public Pr121() {
        shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            int x = (int) (Math.random() * WINDOW_WIDTH);
            int y = (int) (Math.random() * WINDOW_HEIGHT);
            if (i % 2 == 0) {
                shapes[i] = new Circle(x, y);
            } else {
                shapes[i] = new Rectangle(x, y);
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);
        frame.add(new Pr121());
        frame.setVisible(true);
    }
}