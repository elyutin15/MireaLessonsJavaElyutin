package Task2.s3;

public class Circle {
    private Point c;
    private double r;

    public Circle (Point c, double r) {
        this.c = c;
        this.r = r;
    }

    public Point getC() {
        return c;
    }

    public double getR() {
        return r;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "c=" + c +
                ", r=" + r +
                '}';
    }
}
