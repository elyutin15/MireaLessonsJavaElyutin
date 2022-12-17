package Task8;

import java.util.Scanner;

public class s6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.nextInt(), 2) + " divisors");
    }

    public static int check(int n, int div) {
        if (n == 1) {
            return 0;
        }
        if (n < div * div) {
            return 1;
        }
        while (n % div == 0) {
            n/=div;
        }
        return 1 + check(n, div + 1);
    }
}
