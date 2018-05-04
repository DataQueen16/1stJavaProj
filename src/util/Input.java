package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        System.out.println("Do you like Black Panther?");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("yes")) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Let's see if you can read my mind.\nPick a number in my range: ");
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return num;
        }
        System.out.println("Try again poor dear!");
        return getInt(min, max);
    }

    public int getInt() {
        System.out.println("What's your favorite number?");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Let's see if you can read my mind with bigger numbers.\nPick a number in my range: ");
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return num;
        }
        System.out.println("Try again poor dear!");
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.println("Please enter another number in decimals: ");
        return scanner.nextDouble();
    }
}
