package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double returnLength() {
        return length;
    }

    public double returnWidth() {
        return width;
    }

    public abstract double setPerimeter();
    public abstract double setArea();
}
