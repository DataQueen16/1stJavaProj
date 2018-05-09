package shapes;

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getArea(int side) {
        int area = side * side;
        return area;
    }

    public int getPerimeter(int side) {
        int perimeter =  4 * side;
        return perimeter;
    }
}


