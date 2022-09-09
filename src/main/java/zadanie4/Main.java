package zadanie4;

import java.util.Scanner;

public class Main {
    private static final String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String resolve(int n, int k) {
        StringBuffer s = new StringBuffer();
        while (n > 0) {
            s.append(alpha.charAt(n%k));
            n/=k;
        }
        s.reverse();
        return s.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(resolve(n, k));
            System.out.println();
        }
    }
}
