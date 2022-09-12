package zadanie4;

import java.util.Scanner;

public class Main {
    private static final String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String resolve(double n, int k) {
        StringBuilder s = new StringBuilder();
        int valueZ = (int) Math.floor(n);
        n = n - valueZ;
        if (valueZ != 0) {
            while (valueZ > 0) {
                s.append(alpha.charAt(valueZ % k));
                valueZ /= k;
            }
        }
        else {
            s.append("0");
        }
        s.reverse();
        s.append('.');
        for (int i = 0; i < 10; ++i) {
            s.append(alpha.charAt((int)(n*k)));
            n = n * k - (int)(n*k);
        }
        return s.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            double n = sc.nextDouble();
            int k = sc.nextInt();
            System.out.println(resolve(n, k));
            System.out.println();
        }
    }
}
