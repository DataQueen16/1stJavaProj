public class ControlFlowExercises {
    public static void main(String[] args) {

//        Do While
//
//      Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//      Alter your loop to count backwards by 5's from 100 to -10.
//      Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//      2
//      4
//      16
//      256
//      65536

        for (int i = 0; i < 101; i += 2) {
            System.out.println(i);
        }
    }
}