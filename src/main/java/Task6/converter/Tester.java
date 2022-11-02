package Task6.converter;

import java.util.Arrays;
import java.util.Scanner;

public class Tester{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();

        while(true) {
            System.out.println("Following types are available:");
            System.out.println(Arrays.toString(Temperature.values()));
            System.out.print("First type - ");
            String a = sc.next();
            System.out.print("Second type - ");
            String b = sc.next();
            System.out.print("Value - ");
            int value = sc.nextInt();
            Temperature f = Temperature.valueOf(a), s = Temperature.valueOf(b);
            System.out.println(c.convert(f, s, value) + " in " + b);
            System.out.println();
        }
    }
}
