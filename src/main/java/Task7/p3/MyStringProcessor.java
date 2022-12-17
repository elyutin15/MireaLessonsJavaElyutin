package Task7.p3;

public class MyStringProcessor implements StringProcessor{

    String s;

    public MyStringProcessor(String s) {
        this.s = s;
    }

    @Override
    public int calculateLength() {
        return s.length();
    }

    @Override
    public String oddPositionsString() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    @Override
    public String reverse() {
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
