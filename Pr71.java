public class Pr71 {
    interface StringProcessor {
    }
    static class ProcessStrings implements StringProcessor {
        private String processString(String input) {
            return input.toUpperCase();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            ProcessStrings stringProcessor = new ProcessStrings();
            String inputString = "Hello, World!";
            String result = stringProcessor.processString(inputString);
            System.out.println("Input: " + inputString);
            System.out.println("Processed: " + result);
        }
    }
}
