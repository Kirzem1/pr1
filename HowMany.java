import java.util.Scanner;
public class HowMany {
        public static void main(String[] args) {
// Создаем объект класса Scanner для чтения ввода с консоли
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String input = scanner.nextLine(); // Читаем введенную строку

            int HowMany = HowMany(input); // Вызываем метод HowMany для подсчета слов
            System.out.println("Количество слов: " + HowMany);
        }
        private static int HowMany(String input) {
            String[] words = input.split("\\s+"); // Делим строку на слова, используя пробел в качестве разделителя
            return words.length; // Возвращаем количество слов
        }
    }

