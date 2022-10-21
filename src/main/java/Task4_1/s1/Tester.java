package Task4_1.s1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape square = new Square(2.0);

        System.out.println(circle.getArea());
        System.out.println(circle.getType());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
        System.out.println();


        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getType());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle);
        System.out.println();

        System.out.println(square.getArea());
        System.out.println(square.getType());
        System.out.println(square.getPerimeter());
        System.out.println(square);

    }
}
