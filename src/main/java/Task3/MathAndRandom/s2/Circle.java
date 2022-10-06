package Task3.MathAndRandom.s2;

import Task2.s3.Point;

public class Circle {
    private Point c;
    private double r;

    public Circle(Point c, double r) {
        this.c = c;
        this.r = r;
    }

    public Double evaluateArea() {
        return Math.PI * r * r;
    }

    public Double evaluateLength() {
        return Math.PI * r;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Circle obj = (Circle) o;
        return obj.getC().equals(c) && Double.compare(obj.getR(), r) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "c=" + c +
                ", r=" + r +
                '}';
    }
}
