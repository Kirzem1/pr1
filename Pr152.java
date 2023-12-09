import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr152 {
    public static void main(String[] args) {
        String[] countries = {"Германия", "Испания", "Италия", "Франция"};

        JFrame frame = new JFrame("Информация о странах");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JComboBox countryList = new JComboBox<>(countries);
        JLabel infoLabel = new JLabel("");

        countryList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryList.getSelectedItem();
                String info = getInfo(selectedCountry);
                infoLabel.setText(info);
            }
        });

        panel.add(countryList);
        panel.add(infoLabel);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static String getInfo(String country) {
        String info = "";
        switch (country) {
            case "Германия":
                info = "Столица: Берлин, Население: 83 млн, Язык: Немецкий";
                break;
            case "Испания":
                info = "Столица: Мадрид, Население: 47 млн, Язык: Испанский";
                break;
            case "Италия":
                info = "Столица: Рим, Население: 60 млн, Язык: Итальянский";
                break;
            case "Франция":
                info = "Столица: Париж, Население: 67 млн, Язык: Французский";
                break;
        }
        return info;
    }
}