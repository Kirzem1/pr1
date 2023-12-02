import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnimationExample extends JPanel implements ActionListener {
    private Timer timer;
    private int frameCount = 4;
    private int currentFrame = 0;

    private Image[] images;

    public AnimationExample() {
        images = new Image[frameCount];
        for (int i = 0; i < frameCount; i++) {
            images[0] = new ImageIcon("frame0.png").getImage();
            images[1] = new ImageIcon("frame1.png").getImage();
            images[2] = new ImageIcon("frame2.png").getImage();
            images[3] = new ImageIcon("frame3.png").getImage();
        }
        timer = new Timer(150, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame < frameCount) {
            g.drawImage(images[currentFrame], 0, 0, this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        currentFrame++;
        if (currentFrame == frameCount) {
            currentFrame = 0;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.add(new AnimationExample());
        frame.setVisible(true);
    }
}