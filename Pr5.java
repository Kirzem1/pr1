import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr5 {

    public static class FootballMatch extends JFrame {
        private JButton milanButton;
        private JButton madridButton;
        private JLabel resultLabel;
        private JLabel lastScorerLabel;
        private JLabel winnerLabel;

        private int milanScore = 0;
        private int madridScore = 0;

        public FootballMatch() {
            setTitle("Football Match");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(3, 2));

            milanButton = new JButton("AC Milan");
            milanButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    milanScore++;
                    updateScore();
                    lastScorerLabel.setText("Last Scorer: AC Milan");
                    updateWinner();
                }
            });
            add(milanButton);

            madridButton = new JButton("Real Madrid");
            madridButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    madridScore++;
                    updateScore();
                    lastScorerLabel.setText("Last Scorer: Real Madrid");
                    updateWinner();
                }
            });
            add(madridButton);

            resultLabel = new JLabel("Result: 0 X 0");
            add(resultLabel);

            lastScorerLabel = new JLabel("Last Scorer: N/A");
            add(lastScorerLabel);

            winnerLabel = new JLabel("Winner: DRAW");
            add(winnerLabel);
        }

        private void updateScore() {
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        }

        private void updateWinner() {
            if (milanScore > madridScore) {
                winnerLabel.setText("Winner: AC Milan");
            } else if (milanScore < madridScore) {
                winnerLabel.setText("Winner: Real Madrid");
            } else {
                winnerLabel.setText("Winner: DRAW");
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    FootballMatch match = new FootballMatch();
                    match.setVisible(true);
                }
            });
        }
    }
}
