package Task8;

import java.util.Scanner;

public class s7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc.nextInt(), 2);
    }

    public static void check(int n, int div) {
        if (n == 1) {
            return;
        }
        if (n < div * div) {
            System.out.println(n + " 1");
            return;
        }
        int c = 0;
        while (n % div == 0) {
            n/=div;
            c++;
        }
        if (c > 0)
            System.out.println(div + " " + c);
        check(n, div + 1);
    }
}
