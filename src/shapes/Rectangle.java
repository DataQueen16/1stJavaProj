package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        int area = length * width;
        return area;
    }

    public int getPerimeter() {
       int perimeter =  (2 * length) + (2 * width);
       return perimeter;
    }
}

//perimeter = 2 x length + 2 x width
//        area = length x width
