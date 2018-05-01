import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//      Fizzbuzz
//
//      One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//      Write a program that prints the numbers from 1 to 100.
//      For multiples of three print “Fizz” instead of the number
//      For the multiples of five print “Buzz”.
//      For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i < 101; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        int num;
        int square;
        int cube;
        String answer;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println();
            System.out.println("Would you like me to create a table today?");
            answer = input.next();

            System.out.print("How high would you like to go?");
            num = input.nextInt();

            System.out.print("Integer");
            System.out.printf("%10s", "| Squared");
            System.out.printf("%8s", "| Cubed");
            System.out.println();
            System.out.println("------- | ------- | -----");


            for (int i = 1; i <= num; i++) {
                System.out.printf("%-8s", i);
                square = i * i;
                System.out.printf("%-10s", "| " + square);
                cube = i * i * i;
                System.out.printf("%-8s", "| " + cube);
                System.out.println();

            }
        } while (answer.equals("yes"));


//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        int in;
        String keepGoing;
        Scanner grade = new Scanner(System.in);
        Scanner response = new Scanner(System.in);

        do {
            System.out.println("Would you like to find out your grade now?");
            keepGoing = response.next();

            System.out.println("Please enter your percent from 1-100: ");
            in = grade.nextInt();

            if (in > 89) {
                System.out.println("You earned an A!");
            } else if (in > 79) {
                System.out.println("You earned a B!");
            } else if (in > 69) {
                System.out.println("You earned a C!");
            } else if (in > 59) {
                System.out.println("I'm sorry, you failed. You earned a D.");
            } else if ((in >= 0) && (in < 59)) {
                System.out.println("You failed & will have to repeat this class. You earned an F.");
            }
        } while (keepGoing.equals("yes"));

//        Bonus exercises --
//        1. Write a program in Java to read 10 numbers from keyboard and find their sum and average
//        Expected Output :
//        The sum of 10 numbers is : 55
//        The Average is : 5.500000


    }
}
