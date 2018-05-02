import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//          Food for thought: What happens if we try to divide by zero? What should happen?
//
//        Bonus
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

        // Add method test
        // Creating variables to hold the user responses from the keyboard
        int addAnswer1;
        int addAnswer2;

        // Create an object to hold the user answers
        Scanner answer = new Scanner(System.in);
        System.out.print("Let's add.\nPlease enter the 1st integer: ");  // Prompt the user for 1st integer
        addAnswer1 = answer.nextInt();  // Store the answer in addAnswer1 variable

        System.out.print("Enter the 2nd integer now: ");  // Prompt user for 2nd integer
        addAnswer2 = answer.nextInt();  // Store answer in addAnswer2

        // Assign the result of the method call to a variable for the sout
        int addTotal = add(addAnswer1, addAnswer2);

        System.out.println(addAnswer1 + " + " + addAnswer2 + " = " + addTotal);  // Call the add function using the user's answers
        System.out.println();

        // Subtract method test
        // Creating variables to hold user answers
        double number1;
        double number2;

        // Prompt user for parameters
        System.out.print("Let's subtract now.\nPlease enter a number with a decimal point: ");
        number1 = answer.nextDouble();
        System.out.print("Now enter another number with a decimal point: ");
        number2 = answer.nextDouble();

        // Assign the result of the method call to a variable for the sout
        double subtractTotal = subtract(number1, number2);

        System.out.println(number1 + " - " + number2 + " = " + subtractTotal);
        System.out.println();


        // Create variables for multiply method
        int var1;
        int var2;

        // Prompt user for variables
        System.out.print("Let's multiply.\nPlease enter your 1st number: ");
        var1 = answer.nextInt();
        System.out.print("Please enter the 2nd number: ");
        var2 = answer.nextInt();

        // Assign result of method call to a variable for clarity
        int multiplyTotal = multiply(var1, var2);

        // Output the result
        System.out.println(var1 + " x " + var2 + " = " + multiplyTotal);
        System.out.println();


        // Create divide variables
        long divide1;
        long divide2;

        // Prompt user for variables
        System.out.println("It's time to divide.");
        System.out.print("Please enter the 1st number: ");
        divide1 = answer.nextLong();
        System.out.print("Enter the 2nd number: ");
        divide2 = answer.nextLong();

        // Result of divide method call in a variable
        long divideTotal = divide(divide1, divide2);

        // Output to the console with the total
        System.out.println(divide1 + " / " + divide2 + " = " + divideTotal);
        System.out.println();

        // Create modulo integers
        int mod1;
        int mod2;

        // Prompt user for variables
        System.out.println("Greetings human....");
        System.out.print("Please enter the 1st modulo number: ");
        mod1 = answer.nextInt();
        System.out.print("Enter the 2nd modulo number: ");
        mod2 = answer.nextInt();

        // Store result of modulo method call in a variable for use
        int moduloTotal = modulo(mod1, mod2);

        // Show result of calculation in console
        System.out.println(mod1 + " % " + mod2 + " = " + moduloTotal);
        System.out.println("Are you surprised human?");
        System.out.println();

//       2. Create a method that validates that user input is in a certain range
//        The method signature should look like this:
//
//        public static int getInteger(int min, int max);
//        and is used like this:
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//
//                Hint: recursion might be helpful here!

    getInt(50, 75);

    }


    public static int getInt(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your min number: ");
        int answer = input.nextInt();

       if ((answer < min) || (answer > max)) {
           System.out.println("Sorry, try again my dear...\n");
           return getInt(min, max);
       }

       return answer;
    }


    public static int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public static double subtract(double sub1, double sub2) {
        double total = sub1 - sub2;
        return total;
    }

    public static int multiply(int var1, int var2) {
        int total = var1 * var2;
        return total;
    }

    public static long divide(long number1, long number2) {
        long total = number1 / number2;
        return total;
    }

    public static int modulo(int mod1, int mod2) {
        int total = mod1 % mod2;
        return total;
    }
}
