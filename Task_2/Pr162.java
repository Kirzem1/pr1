package Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr162 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        frame.add(textArea, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Color");
        JMenu fontMenu = new JMenu("Font");
        JMenu fontSizeMenu = new JMenu("Font Size");

        String[] colors = {"Orange", "Purple", "Black", "Red", "Blue"};
        for (String color : colors) {
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    switch (color) {
                        case "Orange":
                            textArea.setForeground(Color.ORANGE);
                            break;
                        case "Purple":
                            textArea.setForeground(new Color(128, 0, 128));
                            break;
                        case "Black":
                            textArea.setForeground(Color.BLACK);
                            break;
                        case "Red":
                            textArea.setForeground(Color.RED);
                            break;
                        case "Blue":
                            textArea.setForeground(Color.BLUE);
                            break;
                    }
                }
            });
            colorMenu.add(colorItem);
        }

        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        for (String font : fonts) {
            JMenuItem fontItem = new JMenuItem(font);
            fontItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(new Font(font, Font.PLAIN, textArea.getFont().getSize()));
                }
            });
            fontMenu.add(fontItem);
        }

        String[] fontSizes = {"12", "16", "20"};
        for (String size : fontSizes) {
            JMenuItem sizeItem = new JMenuItem(size);
            sizeItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int newSize = Integer.parseInt(size);
                    textArea.setFont(new Font(textArea.getFont().getFamily(), Font.PLAIN, newSize));
                }
            });
            fontSizeMenu.add(sizeItem);
        }

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        menuBar.add(fontSizeMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}