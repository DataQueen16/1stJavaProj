import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//
//        int myFav = 40;
//        System.out.println(myFav);
//
//        String myString = "So happy to finally be doing Java!";
//        System.out.println(myString);
//
//        float myNumber = (long) 3.14;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        String userInput;  //initializes variable
        Scanner sc;  // declares a variable
                sc = new Scanner(System.in);  //created a Scanner object to use for listening

        System.out.print("Enter something: ");  //question for user
        userInput = sc.nextLine(); //listening for user input & assigning it to the userInput variable

        System.out.println("You entered: --> \"" + userInput + "\" <--");  //takes user input and outputs result to the console
    }
}
