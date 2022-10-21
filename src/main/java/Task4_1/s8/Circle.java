package Task4_1.s8;

public class Circle extends Shape {
    private Double r;

    public Circle(String color, boolean filled, Double r) {
        super(color, filled);
        this.r = r;
    }

    public Circle(Double r) {
        super();
        this.r = r;
    }

    public Circle() {
        super();
        this.r = 0.0;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
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
    public String toString() {
        return "Circle with radius=" + r;
    }
}
