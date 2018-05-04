package shapes;
import java.util.Scanner;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();  // Instantiate an Input object to access those methods
       do {
           double radius = input.getDouble("Please enter the radius now: "); // Prompt user for the radius using Input class
           Circle circle = new Circle(radius); // Instantiate a Circle object to use those methods

           System.out.println("The area of the circle is " + circle.getArea()); // Print the area of the circle using Circle class
           System.out.println("The circumference of the circle is " + circle.getCircumference()); // Print the circumference of the circle using hte Circle class
       } while (input.yesNo("Do you want to continue?"));
    }
}
