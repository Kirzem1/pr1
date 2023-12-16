import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Pr112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStr = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);
        try {
            Date date = dateFormat.parse(dateStr);
            System.out.println("Объект Date: " + date);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты.");
        }

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}