package Task4_1.s6;

public class Tester {
    public static void main(String[] args) {
        Employer a = new Manager("a", "b", 10.0, 10.0);
        System.out.println(a.getIncome());
        System.out.println();

        Employer[] ar = new Employer[3];
        ar[0] = new Employer("A", "B", 10.0);
        ar[1] = new Manager("Y", "E", 10.0, 10.0);
        ar[2] = new Employer("W", "X", 100.0);

        for (Employer b : ar) {
            System.out.println(b.getIncome());
        }
    }
}
