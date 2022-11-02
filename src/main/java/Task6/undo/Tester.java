package Task6.undo;

public class Tester {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder();
        str.append("hello");
        str.append(',');
        str.append("world");
        str.append('!');
        str.setCharAt(0, 'H');

        System.out.println(str);
        str.undo();
        System.out.println(str);
        str.undo();
        System.out.println(str);
        str.undo();
        System.out.println(str);
        str.undo();
        System.out.println(str);
    }
}
