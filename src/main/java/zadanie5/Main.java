package zadanie5;

import java.util.Scanner;

public class Main {

    public static int filterEquals (int[] a, int n, int k) {
        int last = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] % k != 0) {
                a[last++] = a[i];
            }
        }
        return last;
    }

    public static int filterEnds (int[] a, int n, int k) {
        int last = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i]%10 != k) {
                a[last++] = a[i];
            }
        }
        return last;
    }

    public static void print(int[] ar, int n) {
        System.out.println(n);
        for (int i = 0; i < n; ++i) {
            System.out.print(ar[i]);
            if (i + 1 != n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i) {
            ar[i] = (int) (Math.random() * 100);
        }
        print(ar, n);
        int k = sc.nextInt();
        n = filterEquals(ar, n, k);
        print(ar, n);
        k = sc.nextInt();
        n = filterEnds(ar, n, k);
        print(ar, n);
    }
}
