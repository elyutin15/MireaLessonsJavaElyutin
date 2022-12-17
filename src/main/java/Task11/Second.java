package Task11;

import java.time.LocalDate;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate nw = LocalDate.now();
        String s = sc.next();
        LocalDate d = LocalDate.parse(s);
        if (nw.isEqual(d)) {
            System.out.println("Dates are equal");
        }
        else {
            System.out.println("Dates arent equal");
        }
    }
}
