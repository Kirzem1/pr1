import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pr113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.MM.yyyy: ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date userDate;
        try {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            return;
        }

        Date currentDate = new Date();

        if (userDate.compareTo(currentDate) > 0) {
            System.out.println("Введенная дата позже текущей даты");
        } else if (userDate.compareTo(currentDate) < 0) {
            System.out.println("Введенная дата раньше текущей даты");
        } else {
            System.out.println("Введенная дата равна текущей дате");
        }
    }
}