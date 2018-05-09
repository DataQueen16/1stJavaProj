package shapes;

class Rectangle extends Quadrilateral implements Measurable {
    double perimeter;
    double area;

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public double getPerimeter() {
        perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public double getArea() {
        area = length * width;
        return area;
    }

    public double setPerimeter() {
        return perimeter;
    }

    public double setArea() {
        return area;
    }
}


