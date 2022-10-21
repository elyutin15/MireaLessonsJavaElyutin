package Task4_1.s8;

public class Rectangle extends Shape {
    protected Double a;
    protected Double b;

    public Rectangle() {
        super();
        this.a = 0.0;
        this.b = 0.0;
    }

    public Rectangle(Double a, Double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Rectangle(String color, boolean filled, Double a, Double b) {
        super(color, filled);
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public Double getArea() {
        return a * b;
    }

    @Override
    public Double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with sides a=" + a + ", b=" + b;
    }
}
