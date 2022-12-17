package Task7.p3;

public class Tester {
    public static void main(String[] args) {
        MyStringProcessor str = new MyStringProcessor("234567");

        System.out.println(str.calculateLength());
        System.out.println(str.oddPositionsString());
        System.out.println(str.reverse());
    }
}
