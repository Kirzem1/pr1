import java.util.Scanner;

public class Pr84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = scanner.nextInt();

        int count = 0; // счетчик количества повторений числа
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}