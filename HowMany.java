import java.util.Scanner;
public class HowMany {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            int HowMany = HowMany(input); 
            System.out.println("Количество слов: " + HowMany);
        }
        private static int HowMany(String input) {
            String[] words = input.split("\\s+");
            return words.length;
        }
    }

