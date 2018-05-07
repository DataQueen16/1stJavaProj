import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//          Food for thought: What happens if we try to divide by zero? What should happen?
//
//        Bonus
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

//        // Add method test
//        // Creating variables to hold the user responses from the keyboard
//        int addAnswer1;
//        int addAnswer2;
//
//        // Create an object to hold the user answers
        Scanner input = new Scanner(System.in);
//        System.out.print("Let's add.\nPlease enter the 1st integer: ");  // Prompt the user for 1st integer
//        addAnswer1 = input.nextInt();  // Store the answer in addAnswer1 variable
//
//        System.out.print("Enter the 2nd integer now: ");  // Prompt user for 2nd integer
//        addAnswer2 = input.nextInt();  // Store answer in addAnswer2
//
//        // Assign the result of the method call to a variable for the sout
//        int addTotal = add(addAnswer1, addAnswer2);
//
//        System.out.println(addAnswer1 + " + " + addAnswer2 + " = " + addTotal);  // Call the add function using the user's answers
//        System.out.println();
//
//        // Subtract method test
//        // Creating variables to hold user answers
//        double number1;
//        double number2;
//
//        // Prompt user for parameters
//        System.out.print("Let's subtract now.\nPlease enter a number with a decimal point: ");
//        number1 = input.nextDouble();
//        System.out.print("Now enter another number with a decimal point: ");
//        number2 = input.nextDouble();
//
//        // Assign the result of the method call to a variable for the sout
//        double subtractTotal = subtract(number1, number2);
//
//        System.out.println(number1 + " - " + number2 + " = " + subtractTotal);
//        System.out.println();
//
//
//        // Create variables for multiply method
//        int var1;
//        int var2;
//
//        // Prompt user for variables
//        System.out.print("Let's multiply.\nPlease enter your 1st number: ");
//        var1 = input.nextInt();
//        System.out.print("Please enter the 2nd number: ");
//        var2 = input.nextInt();
//
//        // Assign result of method call to a variable for clarity
//        int multiplyTotal = multiply(var1, var2);
//
//        // Output the result
//        System.out.println(var1 + " x " + var2 + " = " + multiplyTotal);
//        System.out.println();
//
//
//        // Create divide variables
//        long divide1;
//        long divide2;
//
//        // Prompt user for variables
//        System.out.println("It's time to divide.");
//        System.out.print("Please enter the 1st number: ");
//        divide1 = input.nextLong();
//        System.out.print("Enter the 2nd number: ");
//        divide2 = input.nextLong();
//
//        // Result of divide method call in a variable
//        long divideTotal = divide(divide1, divide2);
//
//        // Output to the console with the total
//        System.out.println(divide1 + " / " + divide2 + " = " + divideTotal);
//        System.out.println();
//
//        // Create modulo integers
//        int mod1;
//        int mod2;
//
//        // Prompt user for variables
//        System.out.println("Greetings human....");
//        System.out.print("Please enter the 1st modulo number: ");
//        mod1 = input.nextInt();
//        System.out.print("Enter the 2nd modulo number: ");
//        mod2 = input.nextInt();
//
//        // Store result of modulo method call in a variable for use
//        int moduloTotal = modulo(mod1, mod2);
//
//        // Show result of calculation in console
//        System.out.println(mod1 + " % " + mod2 + " = " + moduloTotal);
//        System.out.println("Are you surprised human?");
//        System.out.println();
//
////       2. Create a method that validates that user input is in a certain range
////        The method signature should look like this:
//
//        // Recursive method that prompts for a value within a certain range
//    getInt(50, 75);
//        System.out.println();


//        Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        factorialLayout();

//        Create an application that simulates dice rolling.
//
//                Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//                Use the .random method of the java.lang.Math class to generate random numbers.

        int sides1;  // Variable to hold the number of sides for a dice
        int sides2;
        String roll;  // Roll the dice
        System.out.println("Please enter the number of sides for one dice: ");
        sides1 = input.nextInt();

        System.out.println("Now enter another number for the 2nd dice: ");
        sides2 = input.nextInt();

        System.out.println("Please roll the dice: ");
        diceRoll(sides1, sides2);



    }

    public static double diceRoll(double num, double num2){
        double dice1 = ((Math.random() * num) + 1);
        double dice2 = ((Math.random() * num2) + 1);
        System.out.println("You rolled " + dice1 + " & " + dice2);
        rollAgain(prompt);
        return dice1 + dice2;
    }

    public static String rollAgain(String prompt){
        Scanner input = new Scanner(System.in);  // Create a new scanner input object
        System.out.println("Would you like to roll again?"); // Prompt user to roll
        prompt = input.next();

        if ("y".equalsIgnoreCase(prompt) || "yes".equalsIgnoreCase(prompt)){
            String excite = "Here we go!";
            diceRoll(num, num2);
            return excite;
        }
        String excite = "Thanks for playing. Maybe next time!";
        return excite;
    }


    public static int factorialLayout() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number from 1-10: ");
        int num = input.nextInt();
        int total;
        int calculate = calculateFactorial(num);

        if ((num > 0) && (num < 11)) {

            System.out.print(num + "! = ");
            for (int i = num; i > 0; i--) {
                System.out.print(num + " x ");
                num -= 1;
            }
            System.out.print(num + " = ");
            System.out.print(calculate);
            return num;
        }

        System.out.println("Try again dear.....");
        return factorialLayout();
    }

    public static int calculateFactorial(int number) {
            int total = 1;
            for (int i = number; i >= 1; i--) {
                total *= i;
            }
        System.out.print(total);
        return total;
    }


        public static int getInt ( int min, int max){
            Scanner input = new Scanner(System.in);
            System.out.println("Please input your number: ");
            int answer = input.nextInt();

            if ((answer < min) || (answer > max)) {
                System.out.println("Sorry, try again my dear...\n");
                return getInt(min, max);
            }

            return answer;
        }


        public static int add ( int num1, int num2){
            int total = num1 + num2;
            return total;
        }

        public static double subtract ( double sub1, double sub2){
            double total = sub1 - sub2;
            return total;
        }

        public static int multiply ( int var1, int var2){
            int total = var1 * var2;
            return total;
        }

        public static long divide ( long number1, long number2){
            long total = number1 / number2;
            return total;
        }

        public static int modulo ( int mod1, int mod2){
            int total = mod1 % mod2;
            return total;
        }
    }

