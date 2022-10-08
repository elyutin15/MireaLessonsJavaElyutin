package Task3.MathAndRandom.s4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ValidateNumber {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = input();
        int c = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i) {
            ar[i] = (int) (Math.random() * n);
            c += 1 - ar[i] % 2;
        }
        System.out.println(Arrays.toString(ar));

        int[] ar2 = new int[c];
        for (int i = 0; i < n; ++i) {
            if (ar[i] % 2 == 0) {
                ar2[--c] = ar[i];
            }
        }
        System.out.println(Arrays.toString(ar2));
    }

    public static int input() {
        System.out.println("Enter please a valid natural numberd");
        int n = sc.nextInt();
        return n > 0 ? n : input();
    }
}
