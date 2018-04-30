import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        int userInput;
        Scanner ip = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        userInput = ip.nextInt();

        System.out.println("You entered " + userInput);

        String first, second, third;

        Scanner wordIp = new Scanner(System.in);
        first = wordIp.next();
        second = wordIp.next();
        third = wordIp.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
