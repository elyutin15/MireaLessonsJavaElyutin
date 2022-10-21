package Task4_1.s2;

public class Tester {
    public static void main(String[] args) {
        Phone a = new Phone(1);
        Phone b = new Phone(2);
        Phone c = new Phone(3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        System.out.println(c.getNumber());
        System.out.println();

        a.receiveCall("A");
        b.receiveCall("B");
        c.receiveCall("C");
        c.receiveCall("C", 1234);

        c.sendMessage("hello", 1, 2, 3, 4, 5);
    }
}
