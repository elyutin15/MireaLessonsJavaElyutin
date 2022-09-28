package Task2.s6;

import Task2.s3.Point;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(), 2);
        Circle c2 = new Circle(new Point(1, 0), 2);
        System.out.println("c is " + c);
        System.out.println("c2 is " + c2);
        System.out.println("length of c is " + c.evaluateLength());
        System.out.println("area of c is " + c.evaluateArea());
        System.out.println("c2 is equal c is " + c2.equals(c));
    }
}
