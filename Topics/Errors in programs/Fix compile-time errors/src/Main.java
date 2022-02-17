import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line2);
        System.out.println(line1);
    }

    public static void checkTheCode (String input) {
        boolean result = Boolean.parseBoolean(input);
        result = !result;
        String output = String.valueOf(result);
        System.out.println(output);
    }
    int size = numbers == null ? 0 : numbers.length;
}