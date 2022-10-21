package Task4_1.s8;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square (Double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, Double a) {
        super(color, filled, a, a);
    }

    @Override
    public void setA(Double side) {
        this.a = side;
        this.b = side;
    }

    @Override
    public void setB(Double side) {
        this.a = side;
        this.b = side;
    }

    @Override
    public String toString() {
        return "Square with sides a=" + a;
    }
}
