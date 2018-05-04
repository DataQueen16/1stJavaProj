package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        System.out.println(prompt);
        return false;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return num;
        }
        System.out.println("Try again poor dear!");
        return getInt(prompt, min, max);
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return num;
        }
        System.out.println("Try again poor dear!");
        return getDouble(prompt, min, max);
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
