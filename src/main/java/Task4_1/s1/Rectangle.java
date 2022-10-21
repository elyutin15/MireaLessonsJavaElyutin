package Task4_1.s1;

public class Rectangle extends Shape{
    private Double a;
    private Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
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
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle with sides a=" + a + ", b=" + b;
    }
}
