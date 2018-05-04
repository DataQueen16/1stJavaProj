package shapes;
import java.util.Scanner;

public class Circle {
    private double radius;

//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)
//
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
