import java.util.Scanner;

public class Pr81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: введено некорректное число. Пожалуйста, введите натуральное число.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}