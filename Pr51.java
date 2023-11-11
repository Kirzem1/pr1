import javax.swing.*;

public class Pr51 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("C:\\Users\\Public\\Pictures\\qwe.jpg");
            return;
        }

        String imagePath = args[0];
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new JLabel(imageIcon));
        frame.pack();
        frame.setVisible(true);
    }
}