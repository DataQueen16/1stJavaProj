package shapes;

class Rectangle extends Quadrilateral implements Measurable {
    double perimeter;
    double area;

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter() {
        perimeter = (2 * length) + (2 * width);
    }

    public void setArea() {
        area = length * width;
    }
}


