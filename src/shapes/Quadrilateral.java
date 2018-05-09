package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double returnLength() {
        return length;
    }

    public double returnWidth() {
        return width;
    }

    public abstract void setPerimeter();
    public abstract void setArea();
}
