package Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr161 extends JFrame {

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 20;
    private static final int MAX_TRIES = 3;

    private JLabel messageLabel;
    private JButton guessButton;
    private JTextField guessField;

    private int targetNumber;
    private int numTries;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Pr161 pr161 = new Pr161();
            pr161.setVisible(true);
        });
    }

    public Pr161() {
        setTitle("Угадайка");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        // Создание верхней панели
        JPanel topPanel = new JPanel();
        topPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel titleLabel = new JLabel("Угадайте число от " + MIN_NUMBER + " до " + MAX_NUMBER);
        topPanel.add(titleLabel);

        // Создание центральной панели
        JPanel centerPanel = new JPanel(new GridLayout(3, 1));
        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        guessField = new JTextField();
        guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });
        centerPanel.add(messageLabel);
        centerPanel.add(guessField);
        centerPanel.add(guessButton);

        // Добавление панелей на главный макет
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);

        pack();

        // Начало новой игры
        startNewGame();
    }

    private void startNewGame() {
        targetNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
        numTries = 0;
        messageLabel.setText("");
        guessField.setText("");
        guessButton.setEnabled(true);
    }

    private void handleGuess() {
        int guess = Integer.parseInt(guessField.getText());
        numTries++;

        if (guess == targetNumber) {
            showMessage("Вы угадали число! МОЛОДЕЦ!");
            guessButton.setEnabled(false);
        } else if (numTries == MAX_TRIES) {
            showMessage("НЕУДАЧНИК! Загаданное число было " + targetNumber);
            guessButton.setEnabled(false);
        } else if (guess < targetNumber) {
            showMessage("Неверное угадывание. Загаданное число больше.");
        } else {
            showMessage("Неверное угадывание. Загаданное число меньше.");
        }

        guessField.setText("");
        guessField.requestFocus();
    }

    private void showMessage(String message) {
        messageLabel.setText(message);
    }

}