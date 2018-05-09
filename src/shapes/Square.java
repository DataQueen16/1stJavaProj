package shapes;

public class Square extends Quadrilateral {
    protected double length;
    protected double width;

    public Square(double length, double width) {
        super(length, width);
    }

    public double returnWidth(){
        this.width = width;
        return width;
    }

    public double returnLength(){
        this.length = length;
        return length;
    }

    @Override
    public double setPerimeter() {
        return 0;
    }

    @Override
    public double setArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}


