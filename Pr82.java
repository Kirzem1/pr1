import java.util.Scanner;

public class Pr82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число A: ");
        int A = scanner.nextInt();

        System.out.println("Введите целое число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }
    }
}