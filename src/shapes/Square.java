package shapes;

public class Square extends Quadrilateral implements Measurable {
    protected double area;
    protected double perimeter;

    public Square(double side) {
        super(side, side);
        setArea();
        setPerimeter();
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
    public void setPerimeter() {
        perimeter = 2 * length + 2 * width;
    }

    @Override
    public void setArea() {
        area = length * width;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }
}


