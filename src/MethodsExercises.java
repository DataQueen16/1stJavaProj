import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your functions and verify the output.
//
//        Add a modulus function that finds the modulus of two numbers.
//
//          Food for thought: What happens if we try to divide by zero? What should happen?
//
//        Bonus
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

        // Creating variables to hold the user responses from the keyboard
        int addAnswer1;
        int addAnswer2;

        // Create an object to hold the user answers
        Scanner answer = new Scanner(System.in);
        System.out.print("Let's add.\nPlease enter the 1st integer: ");  // Prompt the user for 1st integer
        addAnswer1 = answer.nextInt();  // Store the answer in addAnswer1 variable

        System.out.print("Enter the 2nd integer now: ");  // Prompt user for 2nd integer
        addAnswer2 = answer.nextInt();  // Store answer in addAnswer2

        System.out.println("The result of " + addAnswer1 + " plus " + addAnswer2 + " is " + add(addAnswer1, addAnswer2));  // Call the add function using the user's answers


    }

    public static int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }
}
