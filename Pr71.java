interface StringFunctions {
    int countCharacters(String s);
    String oddPositionCharacters(String s);
    String reverseString(String s);
}

class StringManipulator implements StringFunctions {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

public class Pr71 {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String input = "Hello, World!";

        System.out.println("Character count: " + manipulator.countCharacters(input));

        System.out.println("Characters at odd positions: " + manipulator.oddPositionCharacters(input));

        System.out.println("Reversed string: " + manipulator.reverseString(input));
    }
}