package Task4_1.s1;

public class Circle extends Shape{
    private Double r;

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public Double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle with radius=" + r;
    }
}
