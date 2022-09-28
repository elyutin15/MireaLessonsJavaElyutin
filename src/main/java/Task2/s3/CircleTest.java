package Task2.s3;

import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(), 2);
        Circle[] ar = new Circle[3];
        ar[0] = c;
        ar[1] = new Circle(new Point(1, 2), 2);
        ar[2] = new Circle(new Point(2, 2), 2);
        System.out.println(c);
        System.out.println(Arrays.toString(ar));
    }
}
