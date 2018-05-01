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

//        for (int i = 1; i < 101; i++) {
//            if ((i % 5 == 0) && (i % 3 == 0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        int num;
        int square;
        int cube;
        Scanner input = new Scanner(System.in);

        System.out.print("How high would you like to go?");
        num = input.nextInt();

        System.out.print("Integer");
        System.out.printf("%10s", "| Squared");
        System.out.printf("%8s", "| Cubed");
        System.out.println();
        System.out.println("------- | ------- | -----");


        for (int i = 1; i <= num; i++){
            System.out.printf("%-8s", i);
            square = i * i;
            System.out.printf("%-10s", "| " + square);
            cube = i * i * i;
            System.out.printf("%-8s", "| " + cube);
            System.out.println();

        }

    }
}
