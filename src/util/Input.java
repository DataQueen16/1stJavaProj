package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString(prompt) {
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
        int num = getInt();
//        Integer.valueOf(String s);
//        Double.valueOf(String s);

            if (num >= min && num <= max) {
                System.out.println("You did it! " + num + " is in range!");
                return getInt(prompt, min, max);
            }
            System.out.println("Try again poor dear!");
            return num;
        }


    public int getInt() {

        String input = getString();

        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Must input an integer");
            return getInt();
        }
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double num = getDouble(prompt);
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return getDouble(prompt, min, max);
        }
        System.out.println("Try again poor dear!");
        return num;
    }

    public double getDouble(String prompt) {
        String input = getString();

        try{
            return Double.valueOf(input);
        }catch (NumberFormatException e) {
            System.out.println("Input must be a number.");
            return getDouble(prompt);
        }
    }
}
