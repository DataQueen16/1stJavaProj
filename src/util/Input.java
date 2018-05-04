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
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("yes")) {
            return true;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Let's see if you can ready my mind.\nPick a number in my range: ");
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println("You did it! " + num + " is in range!");
            return num;
        }
        System.out.println("Try again poor dear!");
        return getInt();
    }

    public int getInt() {
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
        return getDouble();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
