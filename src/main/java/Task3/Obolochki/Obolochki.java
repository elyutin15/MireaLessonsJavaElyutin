package Task3.Obolochki;

import java.util.Scanner;

public class Obolochki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double d = Double.valueOf(sc.nextDouble());
        Double a = Double.parseDouble(sc.next());
        int b = a.intValue();
        double c = a.doubleValue();
        byte e = a.byteValue();
        float f = a.floatValue();
        long g = a.longValue();
        short h = a.shortValue();

        System.out.println(a);

        String i = Double.toString(3.14);
        System.out.println(i);

    }
}
