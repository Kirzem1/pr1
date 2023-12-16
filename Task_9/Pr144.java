package Task_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для построения частотного словаря:");
        String text = scanner.nextLine();
        Map<Character, Integer> frequencyMap = buildFrequencyMap(text);
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> buildFrequencyMap(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] chars = text.replaceAll("[^а-яА-Яa-zA-Z]", "").toCharArray();
        for (char c : chars) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        return frequencyMap;
    }
}